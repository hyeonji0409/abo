package com.abo.artineer.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;import org.apache.ibatis.javassist.compiler.ast.Keyword;
import org.apache.tomcat.util.http.fileupload.UploadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.abo.artineer.model.MemberVO;
import com.abo.artineer.model.ProjectVO;
import com.abo.artineer.service.ProjectService;

@Controller
public class ProjectController {
	private static final String ARTICLE_IMAGE_REPO = "D:/Full_Stackc_Study/spring_study/upload";

	@Autowired
	ProjectService service;

	@RequestMapping("/listAllProject")
	public String listAllProject(Model model) {
		ArrayList<ProjectVO> projList = service.listAllProject();
		model.addAttribute("projList", projList);

		return "project/projectListView";
	}

	// 글 등록 폼으로 이동
	@RequestMapping("/write")
	public String projectWrite(HttpSession session, HttpServletResponse write, ProjectVO proj) throws Exception {
		String memId = (String) session.getAttribute("memId");
		proj.setMemId(memId);

		System.out.println("memId 출력: " + proj.getMemId());

		// 로그인 되어있는지 확인하는 부분. 안되어있으면 경고 메시지 출력 -> loginform 이동
		if (memId == null) {
			write.setContentType("text/html; charset=UTF-8");
			PrintWriter out_write = write.getWriter();
			out_write.println("<script>alert('회원만 사용 가능한 기능입니다.');</script>");
			out_write.flush();

			return "index";

		} else {
			// 로그인이 되어있는 경우
			return "project/write";
		}
	}

	

	// 글 등록
	@RequestMapping("/createProject")
	public String createProject(ProjectVO proj, HttpSession session) {
		String memId = (String) session.getAttribute("memId");
		proj.setMemId(memId);		

		service.createProject(proj);
		return "redirect:./listAllProject";
	}

	// 글 상세보기
	@RequestMapping("/detailViewProject/{projNo}")
	public String detailViewProject(@PathVariable String projNo, Model model, HttpServletRequest request) {
		ProjectVO proj = service.detailViewProject(projNo);
//		service.updateHit(Integer.parseInt(request.getParameter("projHit")));
		model.addAttribute("proj", proj);
		return "project/projectDetailView";
	}

	// 글 수정 화면 페이지로 이동
	@RequestMapping("/updateProjectForm/{projNo}")
	public String updateProjectForm(@PathVariable String projNo, Model model) {
		ProjectVO proj = service.detailViewProject(projNo);
		model.addAttribute("proj", proj);
		return "project/updateWrite";
	}

	// 글 수정
	@RequestMapping("/updateProject")
	public String updateProject(ProjectVO proj) {
		service.updateProject(proj);
		return "redirect:./listAllProject"; // 전체 글 조회로 이동
	}

	// 게시물 삭제
	@RequestMapping("/deleteProject/{projNo}")
	public String deleteProject(@PathVariable String projNo) {
		service.deleteProject(projNo);
		return "redirect:../listAllProject";
	}

	// 검색
	@ResponseBody
	@RequestMapping("/projectSearch")
	public ArrayList<ProjectVO> projectSearch(@RequestParam HashMap<String, Object> param, Model model, @RequestParam("keyword") String keyword) {
		ArrayList<ProjectVO> projList = service.projectSearch(param);
		model.addAttribute("projList", projList);
		
		System.out.println("검색중");
		System.out.println(keyword + "키워드");
		return projList;
	}
	
	@RequestMapping("/listSearchProject/{ctgId}")
	public String listSearchProject(@PathVariable String ctgId, Model model) {
		ArrayList<ProjectVO> projList = service.listSearchroject(ctgId);
		model.addAttribute("projList", projList);
		
		return "project/projectSearchListView";
	}
}
