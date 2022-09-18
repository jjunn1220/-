<%@ page import = "test001.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
<!--폰트나 여러가지 링크 head에 적을 것-->
    <head>
        <meta charset = "utf-8"/><html>
        <title>솔방울</title>
        
        <!--css 연동하는 거 -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Mypage.css">
        <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css"/>

    	<!-- Link Bootstrap's CSS -->
    	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        
    </head>

    <!--자바스크립트 id로 찾아서 가져옴!!!!-->
    <!--대충 제목이랑 내용 경계선-->
    <body>
        <div id = "wrapper">
        
            <div id ="main_row1">
                <div class = "logo_box">
                <button class = "logo" type="button" onclick="location.href='main.jsp'"><img src = "pic/솔방울.png"></button>
                </div>
                <div class = "search">
                    <input class = "input" type="text" placeholder="검색어를 입력하세요.">
                    <img class = "searchpic" src="pic/돋보기.png">
                </div>
                <!--로그인 전과 후의 차이 어찌 해결함-->
				<div class = "main_btn">
                	<button class = "login_btn"><a href = "signup_new.jsp">회원가입</a></button>
                	<%
					String UserId = null;
                	if(session.getAttribute("UserId") != null){
                		UserId = (String)session.getAttribute("UserId");
                	}
                	if(UserId != null){
               		%>
                    <button class = "login_btn" ><a href = "logout.jsp">로그아웃</a></button>
                    
                 	<%
                    }else {
                	%>
                	<button class = "login_btn"><a href = "login.jsp">로그인</a></button>
                	<%
                    }
                	%>
				</div>
            </div>

            <nav class="navbar navbar-expand-lg navbar-light bg-white">
				<div class="container-fluid">
    				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
      					<span class="navbar-toggler-icon"></span>
    				</button>
    				<div class="collapse navbar-collapse" id="navbarScroll">
      					<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px; width:100%">
        					<li class="nav-item">
          						<a class="nav-link" href = "main.jsp#certi_list" >자격증</a>
								  <!--다른 페이지는 자격증 누르면 메인페이지로 이동할 예정-->
        					</li>
        					<li class="nav-item">
								<a class="nav-link" href="feedList.jsp">자유 게시판</a>
						  </li>
        					<li class="nav-item">
					<%
                    if(UserId != null){
               		%>
          						<a class="nav-link" href="Mypage.jsp">마이페이지</a>
					<%
                    }else{
                    %>
								<a class="nav-link" href="login.jsp">마이페이지</a>
					<% } %>
        					</li>
      					</ul>
    				</div>
  				</div>
			</nav>

			<%
        	if(session.getAttribute("UserId") != null){
        		UserId = (String)session.getAttribute("UserId");
        	}
        	DBConnection UserInformation = new DBConnection();
        	String Information[] = new String[7];
        	Information = UserInformation.getUserInformation(UserId);
			%>
            <div class = mypagebox>
                <h3 class = "mypage_title">My Page</h3>
                <hr style = "border: solid 1px #74613F"></hr>
                <table class = "mypage_list">
                    <tr>
                        <td id="title">아이디</td>
                        <td id="detail"><%=Information[0] %></td>
                    </tr>
                    <tr>
                        <td id="title">비밀번호</td>
                        <td id="detail"><%=Information[1] %></td>
                    </tr>
                    <tr>
                        <td id="title">이름</td>
                        <td id="detail"><%=Information[2] %></td>
                    </tr>
                    <tr>
                        <td id="title">이메일</td>
                        <td id="detail"><%=Information[3] %></td>
                    </tr>
                    <tr>
                        <td id="title">연락처</td>
                        <td id="detail"><%=Information[4] %></td>
                    </tr>
                    <tr>
                        <td id="title">생년월일</td>
                        <td id="detail"><%=Information[5] %></td>
                    </tr>
                    <tr>
                        <td id="title">학과</td>
                        <td id="detail"><%=Information[6] %></td>
                        
                    <%
                    String Information2[] = new String[3];
                    DBConnection MypageIn = new DBConnection();
                    Information2 = MypageIn.getInformation(UserId);
                    %>
                    </tr>
                     <form action="MypageInput.jsp"> 
                    <tr style = "height:100px;">
                        <td id="title">자기소개</td>
                        <td>
                        	<textarea rows = "7" id="contentbox" name = "intro"><%= Information2[0] %></textarea>
                        </td>
                    </tr>
                    <tr style = "height:100px;">
                    	<td id="title">취득한 자격증</td>
                    	<td>
                    		<textarea rows = "7" id="contentbox" name = "certificate"><%= Information2[1] %></textarea>
                    	</td>
                    </tr>
                    <tr style = "height:100px;">
                    	<td id="title">수상경력</td>
                    	<td>
                    		<textarea rows = "7" id="contentbox" name = "price"><%= Information2[2] %></textarea>
                    	</td>
                    </tr>
                </table>
                <input type="submit" id = "mypage_btn" value="저장">
            </form>
            </div>
        </div>
    </body>
</html>