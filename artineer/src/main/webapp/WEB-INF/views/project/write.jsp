<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="/ckeditor/ckeditor.js"></script>
<link rel="stylesheet" href="/css/write.css">
<title>Write</title>
</head>


<body>
	<div id="wrap">

		<!-- TOP -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />
		<form name="form" method="post" action="<c:url value='/createProject' />">
			<div class="container">
				<div class="content">
	
					<div class="row justify-content-md-center">
						<div class="col-sm-9">
							<div class="input-group mb-3">
								<input type="text" id="projTitle" name="projTitle" placeholder="제목을 입력하세요">
							</div>
							<!-- <div class="input-group mb-3">
								<select class="custom-select" id="inputGroupSelect03">
									<option selected>분류</option>
									<option value="1">One</option>
									<option value="2">Two</option>
									<option value="3">Three</option>
								</select>
							</div> -->
						</div>
					</div>
	
					<hr>
	
					<div class="row justify-content-md-center">
						<div class="col_c" style="margin-bottom: 30px">
							<div class="input-group">
								<textarea class="form-control" id="p_content" name="projContent"></textarea>
								<script type="text/javascript">
									CKEDITOR.replace('p_content', {
										height : 350
									});
								</script>
							</div>
						</div>
					</div>
	
					<div class="inputFile">
	                    <input id="inputFile" type="file" name="profile">
	                </div>
	                
	                <button type="submit" class="btn btn-primary" id="writeBtn">글쓰기</button>
	                <button type="reset" class="btn btn-primary" id="writeBtn">취소</button>
				</div>
			</div>
		</form>


		<!-- bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />

	</div>
</body>
</html>