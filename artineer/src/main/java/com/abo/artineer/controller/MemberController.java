package com.abo.artineer.controller;

import com.abo.artineer.model.MemberVO;
import com.abo.artineer.service.MemberService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;

import static java.lang.System.out;

@Controller
public class MemberController {
    @Autowired
    MemberService service;
    @Setter(onMethod_ = {@Autowired})
    private PasswordEncoder passwordEncoder;
    JavaMailSender mailSender;
    
    // 회원가입 폼 이동
    @RequestMapping("/join")
    public String viewJoin() {
        return "/join/join";
    }

    // 아이디 중복 체크
    @ResponseBody
    @RequestMapping("/memIdCheck")
    public String idCheck(@RequestParam("memId") String memId) {
        // 서비스 호출 - > DAO -> Mapper -> memId 조회 결과 반환
        // DB에 값이 있으면 값이 들어오고, 없다면 null됨.
        String mem = service.idCheck(memId);
        String result = "";
        if(mem != null) {
            result = "use";
        }
        else {
            result = "no_use";
        }
        return result;
    }

    // 회원가입
    @RequestMapping("/joinComplete")
    public String join(MemberVO mem) {
        out.println(mem.getMemId());
        service.join(mem);
        return "redirect:/";
    }

    // 로그인폼 이동
    @RequestMapping("/login")
    public String viewlogin() {
        return "/login/login";
    }

    //로그인 처리
    @ResponseBody
    @RequestMapping("/logintask")
    public String loginCheck(@RequestParam HashMap<String, Object> param,
                             @RequestParam("id_input") String memId,
                             @RequestParam("pwd_input") String memPw,
                             HttpSession session
                             ) {
        // 로그인 체크 결과
        MemberVO vo = service.loginCheck(param);
        String EncodedPw = service.requestPw(memId);
        String result = "fail";
        out.println("memPw : " + memPw);
        out.println("EncodedPw : " + EncodedPw);
        out.println("vo : " + vo);
        out.println("passwordEncoder.matches(memPw, EncodedPw)) : " + passwordEncoder.matches(memPw, EncodedPw));
        if(vo != null && passwordEncoder.matches(memPw, EncodedPw)) {
            session.setAttribute("sid", vo.getMemName());
            result = "success";
        }
        return result;
    }
    // 로그아웃
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
    // 아이디 비밀번호 찾기 폼 이동
    @RequestMapping("/findIdPw")
    public String findId() {
        return "/login/findForm";
    }

    // 아이디 찾기
    @ResponseBody
    @RequestMapping("/findIdtask")
    public String findIdtask(@RequestParam("email_input") String email_input,
                             @RequestParam("name_input") String name_input) {
        String ID = service.findId(email_input, name_input);
        out.println("ID : " + ID);
        return ID;
    }

    // 비밀번호 찾기 정보 검증
    @ResponseBody
    @RequestMapping("/findPwtask")
    public String findPwtask(@RequestParam("pw_id_input") String pw_id_input,
                             @RequestParam("pw_name_input") String pw_name_input,
                             @RequestParam("pw_email_input") String pw_email_input) {
        String PwCheck = service.findPw(pw_id_input, pw_name_input, pw_email_input);
        out.println("PW : " + PwCheck);
        return PwCheck;
    }

    // 비밀번호 찾기 폼 이동
    @RequestMapping("/findPwtask")
    public ModelAndView findPwtaskInComplete(HttpServletRequest request, String user_id, String e_mail,
                                                HttpServletResponse response_email) throws IOException{
        //랜덤한 난수 (인증번호)를 생성해서 이메일로 보내고 그 인증번호를 입력하면 비밀번호를 변경할 수 있는 페이지로 이동시킴
        Random r = new Random();
        int dice = r.nextInt(157211)+48271;
        String setfrom = "21artineer@gmail.com";
        String tomail = request.getParameter("pw_email_input");    //받는 사람의 이메일
        String title = "비밀번호 찾기 인증 이메일 입니다.";    //제목
        String content =
                System.getProperty("line.separator")+
                        System.getProperty("line.separator")+
                        "We Are Artineer!"
                        +System.getProperty("line.separator")+
                        System.getProperty("line.separator")+
                        "비밀번호 찾기 인증번호는 " +dice+ " 입니다. "
                        +System.getProperty("line.separator")+
                        System.getProperty("line.separator")+
                        "받으신 인증번호를 홈페이지에 입력해 주시면 다음으로 넘어갑니다."; // 내용

        try {

            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

            messageHelper.setFrom(setfrom); // 보내는사람 생략하면 정상작동을 안함
            messageHelper.setTo(tomail); // 받는사람 이메일
            messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
            messageHelper.setText(content); // 메일 내용

            mailSender.send(message);

        } catch (Exception e) {
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView();    //ModelAndView로 보낼 페이지를 지정하고, 보낼 값을 지정한다.
        mv.setViewName("/login/authChangePw");     //뷰의이름
        mv.addObject("dice", dice);
        mv.addObject("e_mail", e_mail);
        System.out.println("mv : "+mv);
        response_email.setContentType("text/html; charset=UTF-8");
        PrintWriter out_email = response_email.getWriter();
        out_email.println("<script>alert('이메일이 발송되었습니다. 인증번호를 입력해주세요.');</script>");
        out_email.flush();
        return mv;
    }


    //인증번호를 입력한 후에 확인 버튼을 누르면 자료가 넘어오는 컨트롤러
    @RequestMapping(value = "pass_injeung.do{dice},{e_mail}", method = RequestMethod.POST)
    public ModelAndView pass_injeung(String pass_injeung, @PathVariable String dice, @PathVariable String e_mail,
                                     HttpServletResponse response_equals) throws IOException {
        System.out.println("마지막 : pass_injeung : "+pass_injeung);
        System.out.println("마지막 : dice : "+dice);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/member/pass_change");
        mv.addObject("e_mail",e_mail);
        if (pass_injeung.equals(dice)) {
            //인증번호가 일치할 경우 인증번호가 맞다는 창을 출력하고 비밀번호 변경창으로 이동시킨다
            mv.setViewName("member/pass_change");
            mv.addObject("e_mail",e_mail);
            //만약 인증번호가 같다면 이메일을 비밀번호 변경 페이지로 넘기고, 활용할 수 있도록 한다.
            response_equals.setContentType("text/html; charset=UTF-8");
            PrintWriter out_equals = response_equals.getWriter();
            out_equals.println("<script>alert('인증번호가 일치하였습니다. 비밀번호 변경창으로 이동합니다.');</script>");
            out_equals.flush();
            return mv;
        }else if (pass_injeung != dice) {
            ModelAndView mv2 = new ModelAndView();
            mv2.setViewName("member/pass_email");
            response_equals.setContentType("text/html; charset=UTF-8");
            PrintWriter out_equals = response_equals.getWriter();
            out_equals.println("<script>alert('인증번호가 일치하지않습니다. 인증번호를 다시 입력해주세요.'); history.go(-1);</script>");
            out_equals.flush();
            return mv2;
        }
        return mv;
    }



//    @ResponseBody
//    @RequestMapping("/changePwTask")
//    public void findPwtaskComplete(MemberVO memberVO) {
//        service.updatePw(memberVO);
//        out.println(memberVO);
////        out.println("<script>alert('비밀번호가 변경되었습니다. /n다시 로그인 해주세요.'</script>");
////        return "/login/login";
//    }
}