<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Artineer</title>
    <script src="<c:url value='/js/jquery-3.6.0.min.js' />"></script>
    <script src="<c:url value='/js/login.js' />"></script>
    <link rel="stylesheet" href="/css/login.css">
</head>

<body>
<div class="login_wrap">
    <!-- login container -->
    <div class="login_container">
        <div class="header__logo">
            <a href="<c:url value='/' /> " id="logo">
                <img src="image/logo.png">
            </a>
            <h1>ARTINEER</h1>
        </div>
        <form class="sign_in_container" id="sign_in_container">
            <div class="id_input">
                <input placeholder="아이디 입력" name="id_input" id="id_input">
            </div>
            <div class="pwd_input">
                <input placeholder="비밀번호 입력" type="password" name="pwd_input" id="pwd_input" onkeyup=onKeyupPasswd(event)>
            </div>
<%--            <button class="sign_in_button">로그인</button>--%>
            <input type="submit" class="sign_in_button" value="로그인">
        </form>
        <!-- id / pw 찾기 -->
        <div class=" id_pw_search">
            <a href="<c:url value='/findIdPw' />">아이디 / 비밀번호 찾기</a> &nbsp;
            <a href="<c:url value='/join' /> " id="join">회원가입</a>
        </div>
    </div>
</div>
</body>

</html>