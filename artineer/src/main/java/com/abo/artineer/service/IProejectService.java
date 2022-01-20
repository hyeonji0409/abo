package com.abo.artineer.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.abo.artineer.model.MemInfoVO;
import com.abo.artineer.model.MemberVO;
import com.abo.artineer.model.ProjectVO;

public interface IProejectService {
	
	ArrayList<ProjectVO> listAllProject();
	void createProject(ProjectVO projvo); // 글 등록
	ProjectVO detailViewProject(String projNo); // 글 상세조회
	void updateProject(ProjectVO projvo); // 글 수정
	void deleteProject(String projNo); // 글 삭제
	ArrayList<ProjectVO> projectSearch(HashMap<String, Object> map); // 글 검색

	MemberVO getMemberInfo(String memId); // 회원정보 가져오기
	
	void updateHit(int projHit); // 조회수 증가
}
