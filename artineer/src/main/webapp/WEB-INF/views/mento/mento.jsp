<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">

    <title> 멘토링 </title>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/reference.js"></script>
    <script src="js/dropdown.js"></script>
    <script src="js/mento.js"></script>
    <link rel="stylesheet" href="css/reference.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/menu.css">
    <link rel="stylesheet" href="css/mento.css">
</head>

<body>

<div id="wrap">
    <!-- TOP -->
    <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />


    <main id="main">
        <section class="instructor_list_section">
            <div class="mento_title">
                <h1 style="color:rgba(51,51,51);" id="mentoring">멘토링</h1>
                <h3 style="color:gray">당신의 멘토를 찾아라!</h3>
            </div>

            <div class="view">
                <div class="part-filter-box list-box">
                    <form action='a.jsp'>
                        <div class="part-box-title">분야별 멘토</div>
                        <div class="selecot-item-list">
                            <div class="select-item">
                                <input id="Programming" name="pro" type="checkbox">
                                <label for="Programming">개발/프로그래밍</label>
                            </div>

                            <div class="select-item">
                                <input id="network" name="net" type="checkbox">
                                <label for="network">보안/네트워크</label>
                            </div>

                            <div class="select-item">
                                <input id="data" name="dt" type="checkbox">
                                <label for="data">데이터 사이언스</label>
                            </div>

                            <div class="select-item">
                                <input id="create" name="cre" type="checkbox">
                                <label for="create">크리에이티브</label>
                            </div>

                            <div class="select-item">
                                <input id="english" name="eng" type="checkbox">
                                <label for="english">외국어</label>
                            </div>

                            <div class="select-item">
                                <input id="resume" name="resum" type="checkbox">
                                <label for="resume">자기소개서</label>
                            </div>

                            <div class="select-item">
                                <input id="myeon" name="mj" type="checkbox">
                                <label for="myeon">면접</label>
                            </div>
                            <br>
                            <br>
                            <div class="filter_reset">
                                <!-- <center> -->
                                <input id="reset-btn" type="reset" value="필터초기화">
                            </div>
                            <!-- </center> -->
                        </div>
                    </form>
                </div>

                <div id="mento-box">
                    <div class="mento-list" >
                        <ul>
                            <li class="list-positions">
                                <div class="mentor-image">
                                    <figure class="image is-1by1">
                                        <img class="is-rounded" src="image/mento_dd.jpg" alt="멘토 이미지">
                                    </figure>
                                </div>
                                <div class="mentor-info">
                                    <h3 class="mentor-title">백엔드개발자 취직, 이력서 &amp; 상담 및 고민</h3>
                                    <p class="mentor-username">by.뚱인데요</p>
                                    <div class="card-bottom">
                                        <div class="buttons">
                                            <a href="#" class="button">프로필</a>&nbsp;&nbsp;
                                            <button class="button e-mentoring" data-id=566>내용 보기</button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>


                    <div class="mento-list">
                        <ul>
                            <li class="list-positions">
                                <!---->
                                <div class="mentor-image">
                                    <figure class="image is-1by1">
                                        <img class="is-rounded" src="image/mento_jay.jpg" alt="멘토 이미지">
                                    </figure>
                                </div>
                                <div class="mentor-info">
                                    <h3 class="mentor-title">자바스크립트. 프론트엔드 취업/이직</h3>
                                    <p class="mentor-username">by.유정은</p>
                                    <div class="card-bottom">
                                        <div class="buttons">
                                            <a href="#" class="button">프로필</a>&nbsp;&nbsp;
                                            <button class="button e-mentoring" data-id=566>내용 보기</button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <div class="mento-list">
                        <ul>
                            <li class="list-positions">
                                <!---->
                                <div class="mentor-image">
                                    <figure class="image is-1by1">
                                        <img class="is-rounded" src="image/mento_im.jpg" alt="멘토 이미지">
                                    </figure>
                                </div>
                                <div class="mentor-info">
                                    <h3 class="mentor-title">python 취업/이직/개발자로드맵 등</h3>
                                    <p class="mentor-username">by.임창균</p>
                                    <div class="card-bottom">
                                        <div class="buttons">
                                            <a href="#" class="button">프로필</a>&nbsp;&nbsp;
                                            <button class="button e-mentoring" data-id=566>내용 보기</button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <div class="mento-list">
                        <ul>
                            <li class="list-positions">
                                <!---->
                                <div class="mentor-image">
                                    <figure class="image is-1by1">
                                        <img class="is-rounded" src="image/obong1.jpg" alt="멘토 이미지">
                                    </figure>
                                </div>
                                <div class="mentor-info">
                                    <h3 class="mentor-title">신입, 주니어 서버개발자 커리어 멘토링</h3>
                                    <p class="mentor-username">by.고병채</p>
                                    <div class="card-bottom">
                                        <div class="buttons">
                                            <a href="#" class="button">프로필</a>&nbsp;&nbsp;
                                            <button class="button e-mentoring" data-id=566>내용
                                                보기</button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <div class="mento-list">
                        <ul>
                            <li class="list-positions">
                                <!---->
                                <div class="mentor-image">
                                    <figure class="image is-1by1">
                                        <img class="is-rounded" src="image/dear.jpg" alt="멘토 이미지">
                                    </figure>
                                </div>
                                <div class="mentor-info">
                                    <h3 class="mentor-title">파이썬, 장고, 개발 면접 관련 멘토링</h3>
                                    <p class="mentor-username">by.정현지</p>
                                    <div class="card-bottom">
                                        <div class="buttons">
                                            <a href="#" class="button">프로필</a>&nbsp;&nbsp;
                                            <button class="button e-mentoring" data-id=566>내용
                                                보기</button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <div class="mento-list">
                        <ul>
                            <li class="list-positions">
                                <!---->
                                <div class="mentor-image">
                                    <figure class="image is-1by1">
                                        <img class="is-rounded" src="image/obong2.jpg" alt="멘토 이미지">
                                    </figure>
                                </div>
                                <div class="mentor-info">
                                    <h3 class="mentor-title">Python / Django / Web Programming
                                        멘토링</h3>
                                    <p class="mentor-username">by.도경수</p>
                                    <div class="card-bottom">
                                        <div class="buttons">
                                            <a href="#" class="button">프로필</a>&nbsp;&nbsp;
                                            <button class="button e-mentoring" data-id=566>내용
                                                보기</button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <div class="mento-list">
                        <ul>
                            <li class="list-positions">
                                <!---->
                                <div class="mentor-image">
                                    <figure class="image is-1by1">
                                        <img class="is-rounded" src="image/jing.jpg" alt="멘토 이미지">
                                    </figure>
                                </div>
                                <div class="mentor-info">
                                    <h3 class="mentor-title">이직 10번 이상 하면서 피해야할 회사 및 커리어 관리
                                    </h3>
                                    <p class="mentor-username">by.김도영</p>
                                    <div class="card-bottom">
                                        <div class="buttons">
                                            <a href="#" class="button">프로필</a>&nbsp;&nbsp;
                                            <button class="button e-mentoring" data-id=566>내용 보기</button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <div class="mento-list">
                        <ul>
                            <li class="list-positions">
                                <!---->
                                <div class="mentor-image">
                                    <figure class="image is-1by1">
                                        <img class="is-rounded" src="image/gom.jpg" alt="멘토 이미지">
                                    </figure>
                                </div>
                                <div class="mentor-info">
                                    <h3 class="mentor-title">데이터 멘토링</h3>
                                    <p class="mentor-username">by.이민혁</p>
                                    <div class="card-bottom">
                                        <div class="buttons">
                                            <a href="#" class="button">프로필</a>&nbsp;&nbsp;
                                            <button class="button e-mentoring" data-id=566>내용 보기</button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <td colspan="5">

                    <div class='list'>
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
            </div>
</section>
</main>
<!-- bottom -->
<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
</body>
</html>