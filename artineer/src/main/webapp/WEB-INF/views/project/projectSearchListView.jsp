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
<script src="/js/projectSearch.js"></script>
<title>Artineer</title>
</head>

<body>

	<c:choose>
		<c:when test="${empty projList }">
			<tr align="center">
				<td colspan="6">찾는 상품이 없습니다.</td>
			</tr>
		</c:when>

		<c:otherwise>
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
		</c:otherwise>
	</c:choose>

</body>

</html>