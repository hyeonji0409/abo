<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="TF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Artineer</title>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/login.js"></script>
    <link rel="stylesheet" href="css/findForm.css">
    <style>
        #id_input, #name_input, #pw_id_input, #pw_name_input, #pw_email_input {
            height: 30px;
            width: 300px;
            margin: 10px;
        }
    </style>
</head>

<body>
<div class="login_wrap">
    <!-- login container -->
    <div class="login_container">
        <div class="header__logo">
            <a href="index.html" id="logo">
                <img src="image/logo.png">
            </a>
            <h1>ARTINEER</h1>
        </div>
        <form class="sign_in_container" id="sign_in_container">
            <div class="header__logo">
                <a href="index.html" id="logo">
                    <img src="image/logo.png">
                </a>
                <h1>아이디 찾기</h1>
            </div>
            <div class="id_input">
                <input placeholder="e-mail 또는 아이디 입력" id="id_input" name="id_input">
                <input placeholder="이름" id="name_input" name="name_input">
                <input type="button" class="sign_in_button" value="아이디 찾기">
            </div>
            <br><br><br><br>
            <div class="header__logo">
                <a href="index.html" id="logo">
                    <img src="image/logo.png">
                </a>
                <h1>비밀번호 찾기</h1>
            </div>
            <div class="pwd_input">
                <input placeholder="아이디" type="text" id="pw_id_input" name="pw_id_input" onkeyup=onKeyupPasswd(event)><br>
                <input placeholder="이름" type="text" id="pw_name_input" name="pw_name_input" onkeyup=onKeyupPasswd(event)><br>
                <input placeholder="이메일" type="text" id="pw_email_input" name="pw_email_input" onkeyup=onKeyupPasswd(event)>
            </div>
            <%--            <button class="sign_in_button">로그인</button>--%>
            <input type="button" class="sign_in_button" value="비밀번호 찾기">
        </form>
        <!-- 로그인 / 회원가입 -->
        <div class=" id_pw_search">
            <a href="<c:url value='/login' />">로그인하러 가기</a> &nbsp;
            <a href="<c:url value='/join' /> " id="join">회원가입</a>
        </div>
    </div>
</div>
</body>
</html>