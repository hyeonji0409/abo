package com.abo.artineer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abo.artineer.model.PagingVO;
import com.abo.artineer.model.ReferenceVO;
import com.abo.artineer.service.ReferenceService;

@Controller
public class ReferenceController {
	@Autowired
	ReferenceService service;
	
	
	//+ 페이징 추가 아좌좌
	@RequestMapping("/refList")
	public String RefPaging(PagingVO vo, Model model
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
		model.addAttribute("refList", service.selectBoard(vo));
		return "reference/ReferenceList";
	}
				 
	
	// 새글쓰기창으로 이동
		@RequestMapping("/reference/write")
		public String write() {
			return "reference/write";
		}
	
		
		//새글업로드
		@RequestMapping("/reference/insertReference")
		public String insertReference(ReferenceVO refVo) {
			service.insertReference(refVo);
			
			return "redirect:../refList";
			
		}

		//글 상세페이지로 이동
		@RequestMapping("/reference/detailReference/{refNo}")
		public String detailReference(@PathVariable int refNo, Model model) throws Exception {
			ReferenceVO ref = service.detailReference(refNo);
			model.addAttribute("ref",ref);
			service.hitUp(refNo);
			
			//System.out.println(noti.getNoticeTitle()); // 서비로부터 반환된 값 확인
			return "reference/detailReference";
		}
		
		// 글 삭제
		@RequestMapping("/reference/deleteReference/{refNo}")
		public String deleteReference(@PathVariable int refNo) {
			service.deleteReference(refNo);
			return "redirect:../refList";  // 
		}
		
		//글 수정
		@RequestMapping("/reference/updateReferenceForm/{refNo}")
		public String updateReferenceForm(@PathVariable int refNo, Model model) {
			ReferenceVO ref = service.detailReference(refNo);
			model.addAttribute("ref", ref);
			return "reference/updateReferenceForm";
		}
		
		// 글 수정 : 수정된 글 DB에 저장
		@RequestMapping("/reference/updateReference")
		public String detailReference(ReferenceVO refVo) {
			service.updateReference(refVo);	
			return "redirect:../refList";  // 공지사항 페이지로 포워딩
		}

}
