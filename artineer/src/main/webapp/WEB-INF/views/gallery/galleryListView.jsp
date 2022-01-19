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
                    <h1>Gallery</h1>
                    <h4>Artineer 활동사진 입니다</h4>
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
            <button id="write_btn"><a href="write.html">새 글</a></button>
        </div>

        <!-- gallery -->
        <div class="gallerylist">
            <ul>
            	<%-- <c:forEach items="${galList}" var="gal">
	                <li><a href="<c:url value='/gallery/detailViewGallery/${gal.galNo}' />">
	                        <div class="screen">
	                            <div class="top">${gal.galTitle}</div>
	                            <div class="bottom">${gal.galContent}</div>
	                            <img src="image/ai.jpg">
	                        </div>
	                        <div>
	                            <h3>글쓴이 : ${gal.memName} | 날짜 : ${gal.createDate}</h3>
	                        </div>
	                    </a>
	                </li>
               </c:forEach> --%>
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
        <div class="search">
            <select name="search" id="search">
                <option value="제목+내용">제목+내용</option>
                <option value="제목">제목</option>
                <option value="내용">내용</option>
                <option value="글쓴이">글쓴이</option>
            </select>
            <input type="text" style="width: 200px; height:20px">
            <button id="confirm">검색</button>
        </div>
        
        <!-- bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
		
    </div>
</body>

</html>