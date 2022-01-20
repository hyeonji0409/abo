$(document).ready(function(){
    $('#changePwBtn').on('click', function(){
        event.preventDefault();
        $.ajax({
            type:"post",
            url:"changePwTask",
            data:{"changePw":$('#changePw').val(),
                  "changePwId":$('#changePwId').val()},
            // dataType:'text',
            success:function(result){
                alert("비밀번호가 변경되었습니다. \n변경된 비밀번호로 로그인 해주세요.");
                location.href = "/login";
            },
            error:function(data, textStatus){
                alert("전송 실패");
            }
        });
    });
});