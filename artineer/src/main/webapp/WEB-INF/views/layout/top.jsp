<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="/js/jquery-3.6.0.min.js"></script>
    <script src="/js/login.js"></script>
    <script src="/js/dropdown.js"></script>
    <script src="/js/slideShow.js"></script>
    <script src="/js/gallery.js"></script>
    <link rel="stylesheet" href="/css/common.css">
    <link rel="stylesheet" href="/css/index.css">
    <link rel="stylesheet" href="/css/menu.css">
    <link rel="stylesheet" href="/css/slideShow.css">
    <link rel="stylesheet" href="/css/reference.css">
    <link rel="stylesheet" href="/css/gallery.css">
    <link rel="stylesheet" href="/css/detailNotice.css">
    <title>Artineer</title>

</head>
<body>
	<header id="headerBox">
		<!-- header -->
		<div id="logoBox">
			<a href="index.html"><img src="/image/logo.png" id="logoImage"></a>

		</div>
		<div id="topMenuBox">
			<div class="topMenu">
				<ul id="topMenuItem">
					<li><a href="about.html">About</a></li>
					<li class="menu1"><a href="#">Notice</a>
						<ul class="sub">
							<li><a href="notice/listNotice">공지사항</a></li>
							<li><a href="meeting_note.html">회의록</a></li>
						</ul></li>
					<li class="menu1"><a href="#">Activity</a>
						<ul class="sub">
							<li><a href="mento.html">멘토링</a></li>
							<li><a href="project.html">프로젝트</a></li>
							<li><a href="reference.html">자료실</a></li>
						</ul></li>
					<li><a href="gallery.html">Gallery</a></li>
				</ul>
			</div>
			<div class="topMenu" id="top_menu">
				<ul id="topMenuJoin">
					<li><a href="javascript:void(0);" id="join"
						onclick="showPopUp()">회원가입</a></li>
					<li><a href="#" id="index_login">로그인</a></li>
				</ul>
			</div>
		</div>
	</header>

</body>
</html>