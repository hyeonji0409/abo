package com.abo.artineer.service;

import com.abo.artineer.model.MemberVO;
import java.util.HashMap;

public interface IMemberService {
    MemberVO loginCheck(HashMap<String, Object> map);
    String idCheck(String memId); // 아이디 중복 조회
    void join(MemberVO memberVO); // 회원가입
    String requestPw(String memId); // 패스워드 조회
    String findId(String memEmail, String memName); // 아이디 찾기
    String findPw(String memId, String memName, String memEmail); // 비밀번호 찾기
    String findEmail(String memId, String memName, String memEmail); // 이메일 가져오기
    void updatePw(MemberVO memberVO); // 비밀번호 변경
}