<%@ page import = "test001.DBConnection" %>
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
        <link rel="stylesheet" href="main.css">
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
                	DBConnection best5 = new DBConnection();
                	String best[] = new String[5];
                	best = best5.best5();
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
          						<a class="nav-link" href = "#certi_list" >자격증</a>
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
            
			<!--요키칶찌 고오정임니다아ㅏㅇ-->

            <div #swiperRef="" class="swiper mySwiper">
			     <div class="swiper-wrapper">
			       	<div class="swiper-slide">
			            <div class="card">
			                <div class="card-body" id = "list_body">
			                    <h5 class="card-title" id = "list_title">자격증 TOP5</h5>
			                    <p class="card-text" id = "list_text">
			                    	<ul class = "swiper">
			            				<li><a href="certi_info.jsp?title=정보처리기사">정보처리기사</a></li>
			            				<li><a href="certi_info.jsp?title=시각디자인기사">시각디자인기사</a></li>
			            				<li><a href="certi_info.jsp?title=컴퓨터활용능력">컴퓨터활용능력</a></li>
			            				<li><a href="certi_info.jsp?title=워드프로세서">워드프로세서</a></li>
			            				<li><a href="certi_info.jsp?title=자기비파괴검사">자기비파괴검사기사</a></li>
			          				</ul>
			                    </p>
			                </div>
			            </div>
			        </div>
			        <div class="swiper-slide">
			            <div class="card">
			                <div class="card-body" id = "list_body" style = "resize:none">
			                    <h5 class="card-title" id = "list_title">게시글 TOP5</h5>
			                    <p class="card-text" id = "list_text">
			                    	<ul class = "swiper">
			            				<li><a href="comcon.jsp?title=<%=best[0]%>"><%=best[0] %></a></li>
			            				<li><a href="comcon.jsp?title=<%=best[1]%>"><%=best[1] %></a></li>
			            				<li><a href="comcon.jsp?title=<%=best[2]%>"><%=best[2] %></a></li>
			            				<li><a href="comcon.jsp?title=<%=best[3]%>"><%=best[3] %></a></li>
			            				<li><a href="comcon.jsp?title=<%=best[4]%>"><%=best[4] %></a></li>
			          				</ul>
			                    </p>
			                </div>
			            </div>
			        </div>
			        <div class="swiper-slide">
			            <div class="card">
			                <div class="card-body" id = "list_body">
			                    <h5 class="card-title" id = "list_title">어학정보</h5>
			                    <p class="card-text" id = "list_text">
			                    	<ul class = "swiper">
			            				<li><a href="certi_info.jsp?title=TOEIC">토익(TOEIC)</a></li>
			            				<li><a href="certi_info.jsp?title=TOPIK">토픽(TOPIK)</a></li>
			            				<li><a href="certi_info.jsp?title=TEPS">텝스(TEPS)</a></li>
			            				<li><a href="certi_info.jsp?title=토익스피킹">토익스피킹</a></li>
			            				<li>-</li>
			          				</ul>
			                    </p>
			                </div>
			            </div>
			        </div>
			      </div>
			    	<div class="swiper-button-next" style = "color: #7c5214;"></div>
			    	<div class="swiper-button-prev" style = "color: #7c5214;"></div>
		    </div>
           
			<hr style="border:solid 1px #7c5214"></hr>
            
            <!-- 카드크기 조절해야함 -->
			<div id="certi_list" style="margin-bottom:100px;">
            <div class="row row-cols-1 row-cols-md-4 g-4" >
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=화학분석기사"><img src="pic/화학분석기사.png" class="card-img-top"></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=화학분석기사"><h5 class="card-title">화학분석기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단 </p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=토양환경기사"><img src="pic/토양환경기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=토양환경기사"><h5 class="card-title">토양환경기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title='정보처리기사'"><img src="pic/정보처리기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title='정봋처리기사'"><h5 class="card-title">정보처리기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=품질경영기사"><img src="pic/품질경영기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=품질경영기사"><h5 class="card-title">품질경영기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=전기기사"><img src="pic/전기기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=전기기사"><h5 class="card-title">전기기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=일반기계기사"><img src="pic/일반기계기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=일반기계기사"><h5 class="card-title">일반기계기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=정보통신기사"><img src="pic/정보통신기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=정보통신기사"><h5 class="card-title">정보통신기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=항공산업기사"><img src="pic/항공산업기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=항공산업기사"><h5 class="card-title">항공산업기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=토목,건축기사"><img src="pic/토목,건축기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=토목,건축기사"><h5 class="card-title">토목,건축기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=시각디자인기사"><img src="pic/시각디자인기사.PNG" class="card-img-top"></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=시각디자인기사"><h5 class="card-title">시각디자인기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단 </p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=MOS"><img src="pic/MOS.PNG" class="card-img-top"></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=MOS"><h5 class="card-title">MOS</h5></a>
							<p class="card-text">시행기관 : YBM 시사 </p>
							<p class="card-text">자격증 분류 : 국제 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=컴퓨터활용능력"><img src="pic/컴퓨터활용능력.PNG" class="card-img-top"></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=컴퓨터활용능력"><h5 class="card-title">컴퓨터활용능력</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단 </p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=TOEIC"><img src="pic/토익.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=TOEIC"><h5 class="card-title">TOEIC</h5></a>
							<p class="card-text">시행기관 : YBM 시사</p>
							<p class="card-text">자격증 분류 : 국제 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=식물보호기사"><img src="pic/식물보호기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=식물보호기사"><h5 class="card-title">식물보호기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=소방설비기사(기계)"><img src="pic/소방설비기사(기계).PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=소방설비기사(기계)"><h5 class="card-title">소방설비기사(기계)</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=소음진동기사"><img src="pic/소음진동기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=소음진동기사"><h5 class="card-title">소음진동기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=철도차량기사"><img src="pic/철도차량기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=철도차량기사"><h5 class="card-title">철도차량기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=자기비파괴검사기사"><img src="pic/자기비파괴검사기사.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=자기비파괴검사기사"><h5 class="card-title">자기비파괴검사기사</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=워드프로세서"><img src="pic/워드.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=워드프로세서"><h5 class="card-title">워드프로세서</h5></a>
							<p class="card-text">시행기관 : 대한상공회의소</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=TOPIK"><img src="pic/토픽.PNG" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=TOPIK"><h5 class="card-title">TOPIK</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단</p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=TEPS"><img src="pic/텝스.PNG" class="card-img-top"></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=TEPS"><h5 class="card-title">TEPS</h5></a>
							<p class="card-text">시행기관 : 한국산업인력공단 </p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card">
						<a href="certi_info.jsp?title=토익스피킹"><img src="pic/토익스피킹.PNG" class="card-img-top"></a>
						<div class="card-body">
							<a href="certi_info.jsp?title=토익스피킹"><h5 class="card-title">토익스피킹</h5></a>
							<p class="card-text">시행기관 : YBM 시사 </p>
							<p class="card-text">자격증 분류 : 국가기술 자격증</p>
						</div>
					</div>
				</div>
			</div>
        </div>
		</div>
        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

   		<!-- Initialize Swiper -->
   		<script>
      		var swiper = new Swiper(".mySwiper", {
        	slidesPerView: 4,
        	centeredSlides: true,
        	spaceBetween: 50,
        
        	navigation: {
	          nextEl: ".swiper-button-next",
	          prevEl: ".swiper-button-prev",
        	},
      	});
    	</script>
    </body>
</html>