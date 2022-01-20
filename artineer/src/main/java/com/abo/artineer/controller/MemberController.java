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
    public String findPwtaskInComplete() {
        return "index";
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