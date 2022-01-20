package com.abo.artineer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.abo.artineer.dao.IReferenceDAO;
import com.abo.artineer.model.PagingVO;
import com.abo.artineer.model.ReferenceVO;
@Service
public class ReferenceService implements IReferenceService {
	@Autowired
	@Qualifier("IReferenceDAO")
	IReferenceDAO dao;

	@Override
	public void insertReference(ReferenceVO refVo) {
		dao.insertReference(refVo);

	}

	@Override
	public void updateReference(ReferenceVO refVo) {
		dao.updateReference(refVo);

	}

	@Override
	public void deleteReference(int refVo) {
		dao.deleteReference(refVo);

	}

	@Override
	public ReferenceVO detailReference(int refVo) {
		// TODO Auto-generated method stub
		return dao.detailReference(refVo);
	}

	@Override
	public ArrayList<ReferenceVO> RefSearch(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.RefSearch(map);
	}

	@Override
	public int countBoard() {
		// TODO Auto-generated method stub
		return dao.countBoard();
	}

	@Override
	public List<ReferenceVO> selectBoard(PagingVO vo) {
		// TODO Auto-generated method stub
		return dao.selectBoard(vo);
	}

	@Override
	public int hitUp(int refVo) throws Exception {
		// TODO Auto-generated method stub
		return dao.hitUp(refVo);
	}

}
