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
<script src="/js/gallery.js"></script>
<script src="/js/login.js"></script>
<script src="/js/dropdown.js"></script>
<script src="/js/projectSearch.js"></script>
<link rel="stylesheet" href="/css/common.css">
<link rel="stylesheet" href="/css/index.css">
<link rel="stylesheet" href="/css/menu.css">
<link rel="stylesheet" href="/css/gallery.css">
<title>Artineer</title>
</head>

<body>
	<div id="wrap">

		<!-- TOP -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />

		<section>
			<div id="ctg">
				<div class="galleryInfo">
					<h1>Project</h1>
					<h4>직접 만든 프로젝트를 공유해보세요~</h4>
				</div>
			</div>
		</section>

		<!-- 카테고리 & 글쓰기 버튼 -->
		<div class="writeBtn">
			<!-- 카테고리 찾기 -->
			<select class="select_mode" name="select_mode">
				<option value="7">최신순</option>
				<option value="6">오래된순</option>
			</select>

			<!-- 글쓰기 버튼 -->
			<button id="write_btn">
				<a href="<c:url value='/write' />">새 글</a>
			</button>
		</div>

		<div id="searchResultBox"></div>


		<!-- gallery -->
		<div class="gallerylist">
			<ul>
				<c:forEach items="${projList}" var="proj">
					<li><a
						href="<c:url value='/detailViewProject/${proj.projNo}' />">
							<div class="screen">
								<div class="top">${proj.projTitle}</div>
								<div class="bottom">${proj.projContent}</div>
								<img src="image/ai.jpg">
							</div>
							<div>
								<h3>글쓴이 : ${proj.memId} | 날짜 : ${proj.createDate}</h3>
							</div>
					</a></li>
				</c:forEach>
			</ul>
		</div>
		<!-- pagination -->
		<div class="paginationBox">
			<ul class="pagination" id="pagination">
				<li><a href="#">&laquo;</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">&raquo;</a></li>
			</ul>
		</div>

		<!-- 검색 -->
		<form id="projectSearchForm">
			<div class="search">
				<select name="search" id="search">
					<option value="제목+내용">제목+내용</option>
					<option value="prjTitle">제목</option>
					<option value="projContent">내용</option>
					<option value="memId">글쓴이</option>
				</select> <input type="text" name="keyword"
					style="width: 200px; height: 20px">
				<button id="confirm">검색</button>
			</div>
		</form>

		<!-- bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />

	</div>
</body>

</html>