<%@ page import="test001.DBConnection" %>
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
        <link rel="stylesheet" href="signup.css?jwkflejwal">
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
            <!--고오오오오오오오ㅓㅈ어ㅓ어어어어엉-->

            <div style="width: 90%; margin: auto; padding-top:3em;"> 
		    <h3>회원가입
		        <i class="fa-solid fa-camera-retro" style="font-size: 1.5em;" ></i></h3>
		    <form action="signup_action.jsp"> 
		    <table style="width: 100%; border-collapse: separate; border-spacing: 0.8em 2em;">
				<tr>
		            <td class="c1"><label for="id">아이디</label></td>
		            <td><input type="text" class = "inputtext" id="user_id" name="id"></td>
		        </tr>
		        
 
		        <tr>
		            <td class="c1"><label for="password">비밀번호</label></td>
		            <td><input type="password"id="password" name="password"></td>
		        </tr>
		        
		       	<tr>
		            <td class="c1"><label for="password">비밀번호 확인</label></td>
		            <td><input type="password"id="password_check" name="password_check"></td>
		        </tr>
		        

		        
		        <tr>
		            <td class="c1"><label for="name">이름</label></td> 
		            <td><input type="text" class = "inputtext" id="name" name="name"></td>
		        </tr>


		        <tr>    
		        	<td class="c1"><label for="day">생년월일</label></td>
		        	<td>
		            <select name="year" id="year">
		                    <option value="1990">1990</option>
		                    <option value="1991">1991</option>
		                    <option value="1992">1992</option>
		                    <option value="1993">1993</option>
		                    <option value="1994">1994</option>
		                    <option value="1995">1995</option>		                    
		                    <option value="1996">1996</option>
		                    <option value="1997">1997</option>
		                    <option value="1998">1998</option>
		                    <option value="1999">1999</option>
		                    <option value="2000">2000</option>
		                    <option value="2001">2001</option>	
		                    <option value="2002">2002</option>
		                    <option value="2003">2003</option>
		             		<option value="2004">2004</option>
		                    <option value="2005">2005</option>				                    
		            </select>년
		          
		            <select name="month" id="month">
		                    <option value="1">1</option>
		                    <option value="2">2</option>
		                    <option value="3">3</option>
		                    <option value="4">4</option>
		                    <option value="5">5</option>
		                    <option value="6">6</option>		                    
		                    <option value="7">7</option>
		                    <option value="8">8</option>
		                    <option value="9">9</option>
		                    <option value="10">10</option>
		                    <option value="11">11</option>
		                    <option value="12">12</option>			                    
		            </select>월
		             
		            <select name="day" id="day">
		                    <option value="1">1</option>
		                    <option value="2">2</option>
		                    <option value="3">3</option>
		                    <option value="4">4</option>
		                    <option value="5">5</option>
		                    <option value="6">6</option>		                    
		                    <option value="7">7</option>
		                    <option value="8">8</option>
		                    <option value="9">9</option>
		                    <option value="10">10</option>
		                    <option value="11">11</option>
		                    <option value="12">12</option>
		                    <option value="13">13</option>
		                    <option value="14">14</option>
		                    <option value="15">15</option>
		                    <option value="16">16</option>
		                    <option value="17">17</option>
		                    <option value="18">18</option>		                    
		                    <option value="19">19</option>
		                    <option value="20">20</option>
		                    <option value="21">21</option>
		                    <option value="22">22</option>
		                    <option value="23">23</option>
		                    <option value="24">24</option>	
		                    <option value="25">25</option>
		                    <option value="26">26</option>
		                    <option value="27">27</option>
		                    <option value="28">28</option>
		                    <option value="29">29</option>
		                    <option value="30">30</option>		                    
		                    <option value="31">31</option>	                 
		            </select>일
		       	</tr>
		       		
		       	<tr>
		            <td class="c1"><label for="address">연락처</label></td>
		            <td>
			            <input type="tel" id="addres" name="fr">-
			            <input type="tel" id="addres" name="se">-
			            <input type="tel" id="addres" name="th">
		            </td>
		        </tr>	
		       			        
		        <tr>
		            <td class="c1"><label for="email">이메일</label></td>
		            <td><input type="email" id="email" name="email"></td>
		        </tr>
		        
		        <tr>
		            <td class="c1"><label for="major">학과</label></td>
		            <td><input type="text" class = "inputtext" id="major" name="major"></td>
		        </tr>
		        
		        <tr></tr>
		        
		        <tr>
		            <td colspan="2" style="text-align: center;">
		            <input type="submit"value="가입하기">              
		            </td>
		        </tr>
		    </table>
		    </form>
		</div>  
        </div>
    </body>
</html>