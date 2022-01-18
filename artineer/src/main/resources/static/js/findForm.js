$(document).ready(function(){
    $('#findIdBtn').on('click', function(){
        event.preventDefault();
        $.ajax({
            type:"post",
            url:"findIdtask",
            data:{"email_input":$('#email_input').val(),
                "name_input":$('#name_input').val()},
            // dataType:'text',
            success:function(result){
                if(result != 0){
                    alert($('#name_input').val() + "님의 아이디는 " + result + " 입니다.");
                    $('#email_input').value("");
                    $('#name_input').value("");
                }else{
                    alert("일치하는 정보가 없습니다. \n정보를 확인해 주세요.");
                }
            },
            error:function(data, textStatus){
                alert("전송 실패");
            }
        });
    });
    $('#findPwBtn').on('click', function(){
        event.preventDefault();
        $.ajax({
            type:"post",
            url:"findIdtask",
            data:{"email_input":$('#email_input').val(),
                "name_input":$('#name_input').val()},
            // dataType:'text',
            success:function(result){
                if(result != 0){
                    alert($('#name_input').val() + "님의 아이디는 " + result + " 입니다.");
                    $('#email_input').value("");
                    $('#name_input').value("");
                }else{
                    alert("일치하는 정보가 없습니다. \n정보를 확인해 주세요.");
                }
            },
            error:function(data, textStatus){
                alert("전송 실패");
            }
        });
    });
});