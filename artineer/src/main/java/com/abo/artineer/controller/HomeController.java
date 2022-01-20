package com.abo.artineer.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abo.artineer.model.NoticeVO;
import com.abo.artineer.model.PagingVO;
import com.abo.artineer.service.NoticeService;





@Controller
public class HomeController {

	
	@Autowired
	NoticeService service;
	
	@RequestMapping("/")
	public String viewindex() {
		return "index";
	}
	 
		
		
	//공지사항 조회 
	//@RequestMapping("/notice/listNotice")
	//	public String listNotice(Model model) {
	//	ArrayList<NoticeVO> notiList = service.listNotice();
	//	model.addAttribute("notiList", notiList);
    //   return "notice/NoticeList";
	//    }
	
	//+ 페이징 추가 아좌좌
	@RequestMapping("/notiList")
	public String NoticePaging(PagingVO vo, Model model
			, @RequestParam(value="nowPage", required=false)String nowPage
			, @RequestParam(value="cntPerPage", required=false)String cntPerPage) {
		
		int total = service.countBoard();
		if (nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "10";
		} else if (nowPage == null) {
			nowPage = "1";
		} else if (cntPerPage == null) { 
			cntPerPage = "10";
		}
		System.out.println("total : "+total);
		vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		model.addAttribute("paging", vo);
		model.addAttribute("notiList", service.selectBoard(vo));
		return "notice/NoticeList";
	}
				 
	
	// 새글쓰기창으로 이동
		@RequestMapping("/notice/write")
		public String write() {
			return "notice/write";
		}
	
		
		//새글업로드
		@RequestMapping("/notice/insertNotice")
		public String insertNotice(NoticeVO noti) {
			service.insertNotice(noti);
			
			return "redirect:../notiList";
			
		}

		//글 상세페이지로 이동
		@RequestMapping("/notice/detailNotice/{noticeNo}")
		public String detailNotice(@PathVariable int noticeNo, Model model) throws Exception {
			NoticeVO noti = service.detailNotice(noticeNo);
			model.addAttribute("noti", noti);
			service.hitUp(noticeNo);
			
			//System.out.println(noti.getNoticeTitle()); // 서비로부터 반환된 값 확인
			return "notice/detailNotice";
		}
		
		// 글 삭제
		@RequestMapping("/notice/deleteNotice/{noticeNo}")
		public String deleteNotice(@PathVariable int noticeNo) {
			service.deleteNotice(noticeNo);
			return "redirect:../notiList";  // 
		}
		
		//글 수정
		@RequestMapping("/notice/updateNoticeForm/{noticeNo}")
		public String updateNoticeForm(@PathVariable int noticeNo, Model model) {
			NoticeVO noti = service.detailNotice(noticeNo);
			model.addAttribute("noti", noti);
			return "notice/updateNoticeForm";
		}
		
		// 글 수정 : 수정된 글 DB에 저장
		@RequestMapping("/notice/updateNotice")
		public String detailNotice(NoticeVO noti) {
			service.updateNotice(noti);	
			return "redirect:../notiList";  // 공지사항 페이지로 포워딩
		}
		
		
		// 상품 검색 
		@ResponseBody
		@RequestMapping("/notice/noticeSearch")
		public ArrayList<NoticeVO> noticeSearch(@RequestParam HashMap<String, Object> param, 
																		Model model){
			
			ArrayList<NoticeVO> notiList = service.noticeSearch(param);
			model.addAttribute("notiList", notiList);
			

			
			return notiList;
		}	
		
	}
		

