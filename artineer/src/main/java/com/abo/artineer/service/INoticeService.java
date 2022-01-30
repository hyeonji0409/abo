package com.abo.artineer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abo.artineer.model.NoticeVO;
import com.abo.artineer.model.PagingVO;



public interface INoticeService {
	

	void insertNotice(NoticeVO notiVo);			// 공지 등록
	void updateNotice(NoticeVO notiVo);			// 글 수정
	void deleteNotice(int noticeNo);		//글 삭제
	NoticeVO detailNotice(int noticeNo);// 공지 상세 조회
	ArrayList<NoticeVO> noticeSearch(HashMap<String, Object> map); // 글 검색
	public int countBoard();// 게시물 총 갯수
	public List<NoticeVO> selectBoard(PagingVO vo);// 페이징 처리 게시글 조회
	public int hitUp(int noticeNo) throws Exception;
	
}
