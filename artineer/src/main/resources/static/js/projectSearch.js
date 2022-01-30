 $(document).ready(function(){
	$('#projectSearchForm').on('submit', function(){
		event.preventDefault();
		
		// serialize : 폼에 입력한 값을 쿼리스트링 방식의 데이터로 변환
		// type=prdName&keyword = 노트북
		var formData = $(this).serialize();
		
		
		$.ajax({
			type:"post",
			url:"projectSearch",
			data:formData,
			success:function(result){
				$('#searchResultBox').html(result);
			},
			error:function(data, textStatus){
				alert("전송 실패");
			}
		});
	});	
});