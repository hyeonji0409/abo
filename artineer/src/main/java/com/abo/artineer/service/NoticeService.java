package com.abo.artineer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.abo.artineer.dao.INoticeDAO;
import com.abo.artineer.model.NoticeVO;

@Service
public class NoticeService implements INoticeService {
	
	@Autowired
	@Qualifier("INoticeDAO")
	INoticeDAO dao;

	@Override
	public ArrayList<NoticeVO> listNotice() {
		return dao.listNotice();
	}

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

}
