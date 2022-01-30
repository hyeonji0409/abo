package com.abo.artineer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.abo.artineer.dao.INoticeDAO;
import com.abo.artineer.model.NoticeVO;
import com.abo.artineer.model.PagingVO;

@Service

public class NoticeService implements INoticeService {

	@Setter(onMethod_ = {@Autowired})
	@Qualifier("INoticeDAO")
	INoticeDAO dao;
	

	

	@Override
	public void insertNotice(NoticeVO notiVo) {
		dao.insertNotice(notiVo);

	}

	@Override
	public void updateNotice(NoticeVO notiVo) {
		dao.updateNotice(notiVo);
	}

	@Override
	public void deleteNotice(int noticeNo) {
		dao.deleteNotice(noticeNo);

	}
	
//공지사항 상세페이지
	@Override
	public NoticeVO detailNotice(int noticeNo) {
		// TODO Auto-generated method stub
		return dao.detailNotice(noticeNo);
	}
	//검색
	@Override
	public ArrayList<NoticeVO> noticeSearch(HashMap<String, Object> map) {
		return dao.noticeSearch(map);
	}
	
	@Override
	public int countBoard() {
		return dao.countBoard();
	}

	@Override
	public List<NoticeVO> selectBoard(PagingVO vo) {
		return dao.selectBoard(vo);
	}
	
	@Override
	public int hitUp(int noticeNo) throws Exception {
		return dao.hitUp(noticeNo);
	}



}
