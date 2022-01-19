<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Artineer</title>
    <script src="js/jquery-3.6.0.min.js"></script>

    <link rel="stylesheet" href="css/findForm.css">
    <style>
        #changePw{
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
                <h1>인증번호 입력</h1>
            </div>
            <div class="id_input">
                <input type="text" placeholder="이메일로 인증코드가 전송됐습니다." id="memberAuthCode" name="memberAuthCode">
                <button class="sign_in_button" id="authBtn">확인</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>