package com.abo.artineer.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.FormFieldPart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abo.artineer.model.NoticeVO;
import com.abo.artineer.model.ProjectVO;
import com.abo.artineer.service.NoticeService;
import com.abo.artineer.service.ProjectService;

@Controller
public class HomeController {

	@Autowired
	NoticeService service;
	@Autowired
	ProjectService proService;

	@RequestMapping("/")
	public String viewindex(Model model) {
		ArrayList<ProjectVO> projList = proService.listAllProject();
		model.addAttribute("projList", projList);

		ArrayList<NoticeVO> notiList = service.listNotice();
		model.addAttribute("notiList", notiList);
		return "index";
	}

	// 공지사항 조회
	@RequestMapping("/notice/listNotice")
	public String listNotice(Model model) {
		ArrayList<NoticeVO> notiList = service.listNotice();
		model.addAttribute("notiList", notiList);

		return "notice/NoticeList";
	}

	// 새글쓰기창으로 이동
	@RequestMapping("/notice/write")
	public String write() {
		return "notice/write";
	}

	// 새글업로드
	@RequestMapping("/notice/insertNotice")
	public String insertNotice(NoticeVO noti) {
		service.insertNotice(noti);

		return "redirect:./listNotice";

	}

	// 글 상세페이지로 이동
	@RequestMapping("/notice/detailNotice/{noticeNo}")
	public String detailNotice(@PathVariable int noticeNo, Model model) {
		NoticeVO noti = service.detailNotice(noticeNo);
		model.addAttribute("noti", noti);

		System.out.println(noti.getNoticeTitle()); // 서비로부터 반환된 값 확인
		return "notice/detailNotice";
	}

	// 글 삭제
	@RequestMapping("/notice/deleteNotice/{noticeNo}")
	public String deleteNotice(@PathVariable int noticeNo) {
		// System.out.println(prdNo); // 상품번호 전달되는지 확인
		service.deleteNotice(noticeNo);
		return "redirect:../listNotice"; // 전체 상품 조회 페이지로 포워딩
	}

	// 글 수정
	@RequestMapping("/notice/updateNoticeForm/{noticeNo}")
	public String updateNotice(@PathVariable int noticeNo, Model model) {
		// 상품번호 전달하고, 해당 상품 정보 받아오기
		NoticeVO noti = service.detailNotice(noticeNo); // 상세 상품 조회 메소드 그대로 사용
		model.addAttribute("noti", noti);
		return "notice/updateNoticeForm";
	}

	// 글 수정 : 수정된 글 DB에 저장
	@RequestMapping("/notice/updateNotice")
	public String detailNotice(NoticeVO noti) {
		service.updateNotice(noti);
		return "redirect:./listNotice"; // 전체 상품 조회 페이지로 포워딩
	}

}
