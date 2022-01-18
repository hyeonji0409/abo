<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Join</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/join.css">
  <script src="js/jquery-3.6.0.min.js"></script>
  <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
  <script src="js/checkForm.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/memIdCheck.js"></script>
</head>
<body>
<div id="wrap">
  <div id="joinBox" class="input-form col-md-12 mx-auto">
    <div class="header__logo">
      <img src="image/logo.png">
      <h1>ARTINEER</h1>
    </div>
    <hr>
    <form name="newMemberForm" id="joinForm" method="post" action="/joinComplete">
      <!-- method="post" action="newMemberOk.jsp" -->
      <table align="center">
        <tr>
          <td>성명</td>
          <td><input type="text" name="memName" id="memName"></td>
        </tr>
        <tr>
          <td>아이디</td>
          <td><input type="text" name="memId" id="memId" border=0 size="25" placeholder="6~12자 사이로 입력해 주세요">
            <input type="button" value="ID중복체크" id="idCheck" class="btn btn-dark btn-outline-white btn-sm">
          </td>
        </tr>
        <tr>
          <td>비밀번호</td>
          <td><input type="password" name="memPw" id="memPw" size="25"
                     placeholder="8~20자 사이로 입력해 주세요">
          </td>
        </tr>
        <tr>
          <td>비밀번호 확인</td>
          <td><input type="password" name="memPwdCheck" id="memPwdCheck" size="25"
                     placeholder="비밀번호와 똑같이 입력해 주세요"></td>
        </tr>
        <tr>
          <td>생년월일 </td>
          <td>
            <input type="text" name="memBirth" id="memBirth" size="4">년
            <select name="memBirthMonth" id="memBirthMonth">
              <option value="1">1
              <option value="2">2
              <option value="4">3
              <option value="4">4
              <option value="5">5
              <option value="6">6
              <option value="7">7
              <option value="8">8
              <option value="9">9
              <option value="10">10
              <option value="11">11
              <option value="12">12
            </select> 월
            <select name="memBirthDay" id="memBirthDay">
              <option value="1">1
              <option value="2">2
              <option value="4">3
              <option value="4">4
              <option value="5">5
              <option value="6">6
              <option value="7">7
              <option value="8">8
              <option value="9">9
              <option value="10">10
              <option value="11">11
              <option value="12">12
              <option value="13">13
              <option value="14">14
              <option value="15">15
              <option value="16">16
              <option value="17">17
              <option value="18">18
              <option value="19">19
              <option value="20">20
              <option value="21">21
              <option value="22">22
              <option value="23">23
              <option value="24">24
              <option value="25">25
              <option value="26">26
              <option value="27">27
              <option value="28">28
              <option value="29">29
              <option value="30">30
              <option value="31">31
            </select> 일
            <input type="radio" name="solar" value="양력" checked>양력
            <input type="radio" name="solar" value="음력">음력
          </td>
        </tr>
        <tr>
          <td>휴대폰번호 </td>
          <td><select name="memHP" id="memHP">
            <option value="010" selected>010
          </select>
            - <input type="text" name="memHP2" id="memHP2" size="4" maxlength="4">
            - <input type="text" name="memHP3" id="memHP3" size="4" maxlength="4">
          </td>
        </tr>
        <tr>
          <td>주소 </td>
          <td><input type="text" name="memZipcode" id="memZipcode" readonly>

            <input type="button" value="우편번호찾기" id="zipcodeButton"><br>
            <input type="text" name="memAddress1" id="memAddress1" size="40" readonly><br>
            <input type="text" name="memAddress2" id="memAddress2" size="40" placeholder="상세 주소 입력"><br>
          </td>
        </tr>
        <tr>
          <td>성별</td>
          <td>
            <input type="radio" name="memGender" value="M" checked>남
            <input type="radio" name="memGender" value="F">여
          </td>
        </tr>
        <tr>
          <td valign="top">관심분야</td>
          <td>
            <select name="job" id="job">
              <option value="" selected disabled>관심분야 선택
              <option value="프론트엔드">프론트엔드
              <option value="백엔드">백엔드
              <option value="보안">보안
              <option value="게임">게임
              <option value="그래픽">그래픽
              <option value="하드웨어">하드웨어
            </select>
          </td>
        </tr>
        <tr>
          <td valign="top">기수</td>
          <td><input type='text' name="memYear" id="memYear" size="40" placeholder="기수 (숫자만 입력, 2022년 가입자는 6기)"></td>
        </tr>
        <tr>
          <td><input type='hidden' name="memLevel" id="memLevel" size="5" value="4"></td>
        </tr>
        <tr>
          <td valign="top">이메일</td>
          <td>
            <input type='text' name="memEmail" id="memEmail" size="16">@
            <input type='text' name="memEmail2" id="memEmail2">
            <select name="memEmail3" id="memEmail3">
              <option value="">직접입력</option>
              <option value="daum.net">daum.net</option>
              <option value="empal.com">empal.com</option>
              <option value="gmail.com">gmail.com</option>
              <option value="hanmail.net">hanmail.net</option>
              <option value="msn.com">msn.com</option>
              <option value="naver.com">naver.com</option>
              <option value="nate.com">nate.com</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>이메일 수신 여부 &nbsp;</td>
          <td>
            <input type="radio" name="emailRcv" value="Y">예
            <input type="radio" name="emailRcv" value="N">아니오
          </td>
        </tr>
        <tr>
          <!-- <td>동의</td>
             <td>
                 <label><input type="checkbox" id="agreement1" value="모든 약관에 동의">모든 약관에 동의</label>
                  <label><input type="checkbox" id="agreement2" value="개인 정보 이용 동의">개인 정보 이용 동의</label>
             </td> -->
        </tr>
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="회원가입" class="btn btn-primary btn-outline-white btn-sm"
                   id="Submit">
            <input type="reset" value="취    소" class="btn btn-primary btn-outline-white btn-sm"
                   id="Cancel">
          </td>
        </tr>
      </table>
    </form>
  </div>
</div>
</body>
</html>