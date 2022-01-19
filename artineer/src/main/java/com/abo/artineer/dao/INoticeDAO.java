package com.abo.artineer.dao;

import java.util.ArrayList;

import com.abo.artineer.model.NoticeVO;

public interface INoticeDAO {
	
	ArrayList<NoticeVO> listNotice(); // 공지 글 리스트 조회
	void insertNotice(NoticeVO notiVo);			// 공지 등록
	void updateNotice(NoticeVO notiVo);			// 글 수정
	void deleteNotice(int noticeNo);		//글 삭제
	NoticeVO detailNotice(int noticeNo);// 글상세조회

}
