<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프로젝트 - ${proj.projTitle }</title>
<link rel="stylesheet" href="/css/write.css">
</head>
<body>
	<div id="wrap">

		<!-- TOP -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />

		<div class="readContent">
			<table class="roadContent" border="1">
				<tr>
					<td class="sub_title">글 번호</td>
					<td>${proj.projNo }</td>
					<td class="sub_title">조회수</td>
					<td>${proj.projHit }</td>
				</tr>
				<tr>
					<td class="sub_title">작성자</td>
					<td>${proj.memName }</td>
					<td class="sub_title">작성일</td>
					<td>${proj.createDate }</td>
				</tr>
				<tr>
					<td class="sub_title">제목</td>
					<td colspan="3" class="title">${proj.projTitle }</td>
				</tr>
				<tr>
					<td colspan="4" id="content"><textarea class="form-control" id="p_content" name="projContent">${proj.projContent }</textarea></td>
				</tr>
				<%-- <tr>
				<td colspan="2">
	                <a href="<c:url value='/updateProjectForm/${prd.prdNo }' />"><button>수정</button></a>
	                <a href="javascript:deleteCheck();"><button>삭제</button></a>
                </td>
			</tr> --%>
			</table>
		</div>

		<div class="crud">
			<a href="<c:url value='/updateProjectForm/${proj.projNo }' />">수정</a>
			<a href="javascript:deleteCheck();">삭제</a> 
			<a href="<c:url value='/listAllProject' />"><button>목록</button></a>
		</div>

		<script type="text/javascript">
			function deleteCheck() {
				var answer = confirm("삭제하시겠습니까?");

				if (answer == true) {
					location.href = "/deleteProject/${proj.projNo}";
				}
			}
		</script>

		<!-- bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />

	</div>

</body>
</html>