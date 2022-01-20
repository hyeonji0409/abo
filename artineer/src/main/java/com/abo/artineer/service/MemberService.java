package com.abo.artineer.service;

import com.abo.artineer.dao.IMemberDAO;
import com.abo.artineer.model.MemberVO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService implements IMemberService {
<<<<<<< HEAD
	@Autowired
    @Qualifier("IMemberDAO")
    IMemberDAO dao;

	@Autowired
=======
    @Autowired
    @Qualifier("IMemberDAO")
    IMemberDAO dao;

    @Autowired
>>>>>>> bch
    private PasswordEncoder passwordEncoder;

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
        String encodedPassword = passwordEncoder.encode(memberVO.getMemPw());
        memberVO.setMemPw(encodedPassword);
        dao.join(memberVO);
    }
    @Override
    public String requestPw(String memId) {
        return dao.requestPw(memId);
    }
    @Override
    public String findId(String memEmail, String memName) {
        return dao.findId(memEmail, memName);
    }
    @Override
    public String findPw(String memId, String memName, String memEmail) {
        return dao.findPw(memId, memName, memEmail);
    }

    @Override
    public void updatePw(MemberVO memberVO) {
        String encodedPassword = passwordEncoder.encode(memberVO.getMemPw());
        memberVO.setMemPw(encodedPassword);
        dao.updatePw(memberVO);
    }
}