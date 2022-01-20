<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/detailNotice.css">
<title>REFERENCE</title>
</head>
<body>
    <div id="wrap">

        <!-- TOP  -->
        <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />


        <div id="container">
            <div class="container_position">

                <!--글보기 table-->
                <div class="view_table_position">
                    <table class="view_table" cellspacing="0" border="0">
                        <tbody>
                            <tr class="table_title">
                                <th>제목</th>
                                <td colspan="3">${ref.refTitle }</td>
                            </tr>
                            <tr>
                                <th class="table_th">글쓴이</th>
                                <td class="table_name">${ref.memName }</td>
                                <th class="table_th" colspan="1">날짜</th>
                                <td class="table_date" colspan="1" align="center">${ref.createDate }</td>
                            </tr>
                            <tr>
                                <th class="table_th">첨부파일</th>
                                <td colspan="1" class="table_file">
                                    
                                </td>
                                <th class="table_th">조회수</th>
                                <td class="table_hit" colspan="1" align="center"align="right">${ref.noticeHit }</td>
                            </tr>
                            <tr>
                                <td class="table_view" colspan="8">
                                    <div>
                                        ${ref.refContent } </div>
                                </td>
                            </tr>
                            <tr class="view_edit">
                                <td align="left">댓글(${noti.comment})</td>
                                <td colspan="8" align="right">
                                    <button onclick="history.back(-1)" style="cursor:pointer;">목록</button>
                                    
                                    <button><a href ="<c:url value='/reference/updateReferenceForm/${ref.refNo}'/>"> 수정</a> </button>
                                    
                                    <!-- 상품 정보 삭제 : 삭제 여부 확인 처리 (자바스크립트로) -->
                                    <button><a href="javascript:deleteCheck();">삭제</a></button><br><br>
                                    <script type="text/javascript">
                                        function deleteCheck() {
                                            var answer = confirm("삭제하시겠습니까?");
                                            if (answer == true) {
                                                location.href = "/reference/deleteReference/${ref.refNo}";
                                            }
                                        }

                                    </script>

                                    <a href="<c:url value='/'/>">메인 화면으로 이동</a>
                                    </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
               </div>
                  <!-- BOTTOM  -->
                    <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
            </div>
         </body>
    </html>





