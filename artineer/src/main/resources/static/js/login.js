// $(function () {
//     // 로그인 버튼 누르면 로그인 창 띄우기
//     $('#index_login').on('click', function () {
//         window.open("login.html", "login",
//             "top=200, left=500, width=400, height=450, directories='no', location=no, menubar=no, resizable=yes, status=yes, toolbar=no, scrollbar=no");
//     });
//
//     $('.sign_in_button').on('click', function () {
//         let inputid = document.getElementById('id_input');
//         let inputpw = document.getElementById('pwd_input');
//
//         let userid = 'root';
//         let userpw = '1234';
//
//         if (inputid.value == userid && inputpw.value == userpw) {
//             alert("로그인 성공");
//             window.close();
//         }
//         else
//             alert("아이디 혹은 비밀번호가 잘못 입력되었습니다.");
//     });
//
//     $('#join').on('click', function () {
//         window.open("join.html", "회원가입", "width=800, height=800, left=100, top=50");
//     });
//
// });
//
// function onKeyupPasswd(ev) {
//     var evKeyup = null;
//
//     if (ev)
//         evKeyup = ev;
//     else
//         evKeyup = window.event;
//
//     if (evKeyup.keyCode == 13) { // enter key code:13
//         document.getElementById("pwd_input").blur();
//         check();
//     }    // end if
//
// }    // end function onKeyupPasswd()

$(document).ready(function(){
    $('#sign_in_container').on('submit', function(){
        event.preventDefault();
        
        $.ajax({
            type:"post",
            url:"logintask",
            data:{"id_input":$('#id_input').val(),
                "pwd_input":$('#pwd_input').val()},
            dataType:'text',
            success:function(result){
                if(result == "success"){
                    alert("로그인 성공!\nindex 페이지로 이동합니다.");
                    location.href="/";
                }else{
                    alert("아이디 또는 비밀번호가 일치하지 않습니다.");
                }
            },
            error:function(data, textStatus){
                alert("전송 실패");
            }
        });
    });
});