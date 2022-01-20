package com.abo.artineer.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.abo.artineer.dao.IProjectDAO;
import com.abo.artineer.model.ProjectVO;

@Service
public class ProjectService implements IProejectService{

	@Autowired
	@Qualifier("IProjectDAO")
	IProjectDAO dao;
	
	@Override
	public ArrayList<ProjectVO> listAllProject() {
		return dao.listAllProject();
	}

	@Override
	public void createProject(ProjectVO projvo) {
		dao.createProject(projvo);
		
	}

	@Override
	public ProjectVO detailViewProject(String projNo) {
		return dao.detailViewProject(projNo);
	}

	@Override
	public void updateProject(ProjectVO projvo) {
		dao.updateProject(projvo);
	}

	@Override
	public void deleteProject(String projNo) {
		dao.deleteProject(projNo);		
	}

	@Override
	public ArrayList<ProjectVO> projectSearch(HashMap<String, Object> map) {
		return dao.projectSearch(map);
	}


}
