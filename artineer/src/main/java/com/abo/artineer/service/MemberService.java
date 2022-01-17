package com.abo.artineer.service;

import com.abo.artineer.dao.IMemberDAO;
import com.abo.artineer.model.MemberVO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService implements IMemberService {
    @Setter(onMethod_ = {@Autowired})
    @Qualifier("IMemberDAO")
    IMemberDAO dao;

    @Override
    public MemberVO loginCheck(HashMap<String, Object> map) {
        return dao.loginCheck(map);
    }

    @Override
    public String idCheck(String memId) {
        return dao.idCheck(memId);
    }
    @Override
    public void join(MemberVO memberVO) {
        dao.join(memberVO);
    }
}