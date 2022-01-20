<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

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
				<a href="<c:url value='/listAllProject' />">프로젝트 구경하기 >></a>
				<h4>다양하고 재미있는 프로젝트!!!</h4>
			</div>
			<div class="index_galleylist">
				<ul>
					<c:forEach items="${projList}" var="proj" begin="0" end="3">
						<li><a href="#">
								<div class="index_screen">
									<div class="top">${proj.projTitle}</div>
									<div class="bottom">${proj.projContent}</div>
									<img src="image/moneydare.png">
								</div>
						</a></li>
					</c:forEach>
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
					<c:forEach items="${notiList}" var="noti" begin="0" end="3">
						<li><a href="#">
								<div class="index_screen">
									<div class="top">${noti.noticeTitle}</div>
									<div class="bottom">${noti.comment}</div>
									<img src="image/moneydare.png">
								</div>
						</a></li>
					</c:forEach>
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
					<c:forEach items="${projList}" var="proj" begin="0" end="3">
						<li><a href="#">
								<div class="index_screen">
									<div class="top">${proj.projTitle}</div>
									<div class="bottom">${proj.projContent}</div>
									<img src="image/moneydare.png">
								</div>
						</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!-- 공부할 수 있는 사이트 연결 -->

		<!-- bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
	</div>
</body>

</html>