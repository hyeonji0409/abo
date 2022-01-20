package com.abo.artineer.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abo.artineer.model.ProjectVO;
import com.abo.artineer.service.ProjectService;

@Controller
public class ProjectController {
	
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
	public String projectWrite() {
		return "project/write";
	}
	
	// 글 등록
	@RequestMapping("/createProject")
	public String createProject(ProjectVO proj) {
		service.createProject(proj);
		return "redirect:./listAllProject";
	}
	
	// 글 상세보기
	@RequestMapping("/detailViewProject/{projNo}")
	public String detailViewProject(@PathVariable String projNo, Model model) {
		ProjectVO proj = service.detailViewProject(projNo);
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
	@RequestMapping("/search")
	public ArrayList<ProjectVO> search(@RequestParam HashMap<String, Object> param, Model model) {
		ArrayList<ProjectVO> projList = service.projectSearch(param);
		model.addAttribute("projList", projList);
		return projList;
	}
}
