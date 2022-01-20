<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Artineer</title>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/changePw.js"></script>

    <link rel="stylesheet" href="css/findForm.css">
    <style>
        #changePw, #changePwCheck {
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
        </div>
        <form class="sign_in_container" id="sign_in_container">
            <div class="header__logo">
                <a href="index.html" id="logo">
                    <img src="image/logo.png">
                </a>
                <h1>비밀번호 변경</h1>
            </div>
            <div class="id_input">
                <input type="text" placeholder="비밀번호를 변경할 아이디" id="changePwId" name="changePwId" value="${member.memId}">
                <input type="password" placeholder="변경할 비밀번호" id="changePw" name="changePw">
                <input type="password" placeholder="비밀번호 확인" id="changePwCheck" name="changePwCheck">
                <button class="sign_in_button" id="changePwBtn">비밀번호 변경</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>