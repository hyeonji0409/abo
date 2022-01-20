package com.abo.artineer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.abo.artineer.model.PagingVO;
import com.abo.artineer.model.ReferenceVO;

public interface IReferenceService {
	void insertReference(ReferenceVO refVo);			// 공지 등록
	void updateReference(ReferenceVO refVo);			// 글 수정
	void deleteReference(int refVo);		//글 삭제
	ReferenceVO detailReference(int refVo);// 글상세조회
	ArrayList<ReferenceVO> RefSearch(HashMap<String, Object> map); // 글 검색
	public int countBoard();// 게시물 총 갯수
	public List<ReferenceVO> selectBoard(PagingVO vo);// 페이징 처리 게시글 조회
	public int hitUp(int refVo) throws Exception;

}
