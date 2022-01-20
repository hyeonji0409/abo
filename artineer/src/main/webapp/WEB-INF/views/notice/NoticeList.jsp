<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
  	<link rel="stylesheet" href="/css/reference.css">
    <title>공지사항</title>
</head>

<body>
	<div id="wrap">
		<!-- TOP -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />

	       <div id="container">

            <div id="center">

                <div class="containter_table">
                    <center>
                        <div class="table_title">

                            <h1 style="color:rgba(51,51,51);">공지사항</h1>
                            <h3 style="color:rgba(51,51,51);">Notice</h3>

                        </div>

                        <div id="writeBtn">
                            <!-- 카테고리 찾기 -->
                            <select class="select_ctg" name="select_ctg">
                                <option value="7">최신순</option>
                                <option value="6">오래된순</option>
                            </select>
                            
                            
                            <!-- 글쓰기 버튼 -->
                            <button id="write_btn"> <a href ="/notice/write">새 글</a></button>

                        </div>



                        <table class="table" border="0.5" cellspacing="0">

                            <caption>
                            <colgroup>
                                <col width=100px>
                                <col width=450px>
                                <col width=150px>
                                <col width=150px>
                                <col width=100px>
                            </colgroup>

                            <thead>
                                <tr>
                                    <th scope="col">번호</th>
                                    <th scope="col">제목</th>
                                    <th scope="col">글쓴이</th>
                                    <th scope="col">날짜</th>
                                    <th scope="col">조회수</th>
                                </tr>
                            </thead>
                            </caption>
                            <tbody class="sub_news" border="1" cellspacing="0">

						<c:forEach items="${notiList }" var="noti">
                                <tr>
                                    <td>${noti.noticeNo }</td>
                                    <td class="title">
                                        <a href="<c:url value='/notice/detailNotice/${noti.noticeNo}'/>">${noti.noticeTitle }
                                            <font color="black">(${noti.comment })</font>
                                        </a>
                                    </td>
                                    <td class="name">${noti.memName }</td>
                                    <td class="date">${noti.createDate }</td>
                                    <td class="hit">${noti.noticeHit }</td>
                                    </tr>
                                   </c:forEach>
                                  
              

                                <td colspan="5">

                                        <div class='before'>
                                            <a style='color:rgba(51,51,51)'>◀</a>
                                        </div>

                                        <a href=?_page=1> 1 </a>&nbsp;&nbsp;
                                        <a href=?_page=2> 2 </a>&nbsp;&nbsp;
                                        <a href=?_page=3> 3 </a>&nbsp;&nbsp;
                                        <a href=?_page=4> 4 </a>&nbsp;&nbsp;
                                        <a href=?_page=5> 5 </a>&nbsp;&nbsp;

                                        <div class='next'>
                                            <a style='color:rgba(51,51,51)' href=?_page=6>▶</a>
                                        </div>
                                    </div>
                                </td>
                                </tr>
                            </tbody>
                    </center>
                    </table>

                    <table class="search_table">
                        <form action="">
                            <tr>

                                <td>
                                    <select class="search_mode" name="search_mode">
                                        <option value="3">제목+내용</option>
                                        <option value="1">제목</option>
                                        <option value="2">내용</option>
                                    </select>
                                </td>
                                <td class="search_text"><input type="text" name="search_text" size="10"></td>
                                <td class="search_btn"><input type="submit" value="검색"></td>

                            </tr>
                        </form>
                    </table>


                </div>

            </div>
		<!-- 공부할 수 있는 사이트 연결 -->

		<!-- bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
	</div>
</body>

</html>