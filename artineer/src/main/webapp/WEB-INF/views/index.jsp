<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="js/jquery-3.6.0.min.js"></script>
<script src="js/login.js"></script>
<script src="js/dropdown.js"></script>
<script src="js/slideShow.js"></script>
<script src="js/gallery.js"></script>
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/menu.css">
<link rel="stylesheet" href="css/slideShow.css">
<!-- <link rel="stylesheet" href="css/gallery.css"> -->
<title>Artineer</title>

</head>

<body>
	<div id="wrap">
		<!-- TOP -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />

		<!-- 광고..? 넣어 말아... -->
		<section>
			<!-- section -->
			<article id="slideShow">
				<!--슬라이드쇼-->
				<!-- 슬라이드쇼 이미지 -->
				<div id="slideShowBox">
					<div id="slidePanel">
						<img src="image/welcome.png" class="slideImage"> <img
							src="image/welcome2.png" class="slideImage">
					</div>
				</div>
				<!--slideShowBox 끝-->
			</article>
		</section>
		<!-- 프로젝트 파일 연결 -->
		<div class="project_link">
			<div class="project_link_info">
				<a href="project.html">프로젝트 구경하기 >></a>
				<h4>다양하고 재미있는 프로젝트!!!</h4>
			</div>
			<div class="index_galleylist">
				<ul>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">MoneyDare</div>
								<div class="bottom">주식 자동화 프로그램</div>
								<img src="image/moneydare.png">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">Month_Diary</div>
								<div class="bottom">한달 취미 챌린지</div>
								<img src="image/lstm.png">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">TALE's GAME</div>
								<div class="bottom">초등학생 대상 코딩 스토리 게임</div>
								<img src="image/tale'sgame.png">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">마음만은 늘 함께</div>
								<div class="bottom">운동 커뮤니티 어플리케이션</div>
								<img src="image/garlic.jpg">
							</div>
					</a></li>
				</ul>
			</div>
		</div>
		<!-- 자료실 -->
		<div class="project_link">
			<div class="project_link_info">
				<a href="reference.html">강의자료 보러가기 >></a>
				<h4>스터디 시간에 공부한 자료들을 공유받아요</h4>
			</div>
			<div class="index_galleylist">
				<ul>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">Hello Python</div>
								<div class="bottom">야 너도 파이썬 할 수 있어!!</div>
								<img src="image/hello_python.png">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">Deep Learning</div>
								<div class="bottom">밑바닥부터 시작하는 딥러닝</div>
								<img src="image/deeplearning.png">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">HAPPY JAVA CLASS</div>
								<div class="bottom">Artineer Java Class</div>
								<img src="image/java.png">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">찍어먹는 Python</div>
								<div class="bottom">찍먹 파이썬 조건문편!!</div>
								<img src="image/python.png">
							</div>
					</a></li>
				</ul>
			</div>
		</div>
		<!-- 활동 사진 -->
		<div class="project_link">
			<div class="project_link_info">
				<a href="gallery.html">활동 사진 >></a>
				<h4>MT, 멘토링, 경진대회, 전시회 참여 사진</h4>
			</div>
			<div class="index_galleylist">
				<ul>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">2021 AI 전시회</div>
								<div class="bottom">AI 전시회</div>
								<img src="image/ai.jpg">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">2019 MT</div>
								<div class="bottom">in 부안</div>
								<img src="image/sea.jpg">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">2019 MT</div>
								<div class="bottom">in 부안</div>
								<img src="image/soju.jpg">
							</div>
					</a></li>
					<li><a href="#">
							<div class="index_screen">
								<div class="top">2018 멘토링</div>
								<div class="bottom">멘토멘티 팀 나누기</div>
								<img src="image/activity.jpg">
							</div>
					</a></li>
				</ul>
			</div>
		</div>
		<!-- 공부할 수 있는 사이트 연결 -->

		<!-- bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
	</div>
</body>

</html>