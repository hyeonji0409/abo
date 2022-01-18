package com.abo.artineer.dao;

import com.abo.artineer.model.MemberVO;
import java.util.HashMap;

public interface IMemberDAO {
    MemberVO loginCheck(HashMap<String, Object> map); // 로그인
    String idCheck(String memId); // 아이디 중복 조회
    void join(MemberVO memberVO); // 회원가입
    String requestPw(String memId); // 패스워드 조회
}