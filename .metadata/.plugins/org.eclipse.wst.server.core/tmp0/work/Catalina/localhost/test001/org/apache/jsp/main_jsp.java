/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-06-08 13:07:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import test001.DBConnection;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("test001.DBConnection");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang = \"ko\">\r\n");
      out.write("<!--폰트나 여러가지 링크 head에 적을 것-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset = \"utf-8\"/><html>\r\n");
      out.write("        <title>솔방울</title>\r\n");
      out.write("        \r\n");
      out.write("        <!--css 연동하는 거 -->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"main.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper/swiper-bundle.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("    	<!-- Link Bootstrap's CSS -->\r\n");
      out.write("    	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <!--자바스크립트 id로 찾아서 가져옴!!!!-->\r\n");
      out.write("    <!--대충 제목이랑 내용 경계선-->\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id = \"wrapper\">\r\n");
      out.write("        \r\n");
      out.write("            <div id =\"main_row1\">\r\n");
      out.write("                <div class = \"logo_box\">\r\n");
      out.write("                <button class = \"logo\" type=\"button\" onclick=\"location.href='main.jsp'\"><img src = \"pic/솔방울.png\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class = \"search\">\r\n");
      out.write("                    <input class = \"input\" type=\"text\" placeholder=\"검색어를 입력하세요.\">\r\n");
      out.write("                    <img class = \"searchpic\" src=\"pic/돋보기.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--로그인 전과 후의 차이 어찌 해결함-->\r\n");
      out.write("				<div class = \"main_btn\">\r\n");
      out.write("                	<button class = \"login_btn\"><a href = \"signup_new.jsp\">회원가입</a></button>\r\n");
      out.write("                	");

					String UserId = null;
                	if(session.getAttribute("UserId") != null){
                		UserId = (String)session.getAttribute("UserId");
                	}
                	if(UserId != null){
               		
      out.write("\r\n");
      out.write("                    <button class = \"login_btn\" ><a href = \"logout.jsp\">로그아웃</a></button>\r\n");
      out.write("                    \r\n");
      out.write("                 	");

                    }else {
                	
      out.write("\r\n");
      out.write("                	<button class = \"login_btn\"><a href = \"login.jsp\">로그인</a></button>\r\n");
      out.write("                	");

                    }
                	DBConnection best5 = new DBConnection();
                	String best[] = new String[5];
                	best = best5.best5();
                	
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-white\">\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("    				<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      					<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    				</button>\r\n");
      out.write("    				<div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\r\n");
      out.write("      					<ul class=\"navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll\" style=\"--bs-scroll-height: 100px; width:100%\">\r\n");
      out.write("        					<li class=\"nav-item\">\r\n");
      out.write("          						<a class=\"nav-link\" href = \"#certi_list\" >자격증</a>\r\n");
      out.write("								  <!--다른 페이지는 자격증 누르면 메인페이지로 이동할 예정-->\r\n");
      out.write("        					</li>\r\n");
      out.write("        					<li class=\"nav-item\">\r\n");
      out.write("								<a class=\"nav-link\" href=\"feedList.jsp\">자유 게시판</a>\r\n");
      out.write("						  </li>\r\n");
      out.write("        					<li class=\"nav-item\">\r\n");
      out.write("					");

                    if(UserId != null){
               		
      out.write("\r\n");
      out.write("          						<a class=\"nav-link\" href=\"Mypage.jsp\">마이페이지</a>\r\n");
      out.write("					");

                    }else{
                    
      out.write("\r\n");
      out.write("								<a class=\"nav-link\" href=\"login.jsp\">마이페이지</a>\r\n");
      out.write("					");
 } 
      out.write("\r\n");
      out.write("        					</li>\r\n");
      out.write("      					</ul>\r\n");
      out.write("    				</div>\r\n");
      out.write("  				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("            \r\n");
      out.write("			<!--요키칶찌 고오정임니다아ㅏㅇ-->\r\n");
      out.write("\r\n");
      out.write("            <div #swiperRef=\"\" class=\"swiper mySwiper\">\r\n");
      out.write("			     <div class=\"swiper-wrapper\">\r\n");
      out.write("			       	<div class=\"swiper-slide\">\r\n");
      out.write("			            <div class=\"card\">\r\n");
      out.write("			                <div class=\"card-body\" id = \"list_body\">\r\n");
      out.write("			                    <h5 class=\"card-title\" id = \"list_title\">자격증 TOP5</h5>\r\n");
      out.write("			                    <p class=\"card-text\" id = \"list_text\">\r\n");
      out.write("			                    	<ul class = \"swiper\">\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=정보처리기사\">정보처리기사</a></li>\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=시각디자인기사\">시각디자인기사</a></li>\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=컴퓨터활용능력\">컴퓨터활용능력</a></li>\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=워드프로세서\">워드프로세서</a></li>\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=자기비파괴검사\">자기비파괴검사기사</a></li>\r\n");
      out.write("			          				</ul>\r\n");
      out.write("			                    </p>\r\n");
      out.write("			                </div>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        <div class=\"swiper-slide\">\r\n");
      out.write("			            <div class=\"card\">\r\n");
      out.write("			                <div class=\"card-body\" id = \"list_body\" style = \"resize:none\">\r\n");
      out.write("			                    <h5 class=\"card-title\" id = \"list_title\">게시글 TOP5</h5>\r\n");
      out.write("			                    <p class=\"card-text\" id = \"list_text\">\r\n");
      out.write("			                    	<ul class = \"swiper\">\r\n");
      out.write("			            				<li><a href=\"comcon.jsp?title=");
      out.print(best[0]);
      out.write('"');
      out.write('>');
      out.print(best[0] );
      out.write("</a></li>\r\n");
      out.write("			            				<li><a href=\"comcon.jsp?title=");
      out.print(best[1]);
      out.write('"');
      out.write('>');
      out.print(best[1] );
      out.write("</a></li>\r\n");
      out.write("			            				<li><a href=\"comcon.jsp?title=");
      out.print(best[2]);
      out.write('"');
      out.write('>');
      out.print(best[2] );
      out.write("</a></li>\r\n");
      out.write("			            				<li><a href=\"comcon.jsp?title=");
      out.print(best[3]);
      out.write('"');
      out.write('>');
      out.print(best[3] );
      out.write("</a></li>\r\n");
      out.write("			            				<li><a href=\"comcon.jsp?title=");
      out.print(best[4]);
      out.write('"');
      out.write('>');
      out.print(best[4] );
      out.write("</a></li>\r\n");
      out.write("			          				</ul>\r\n");
      out.write("			                    </p>\r\n");
      out.write("			                </div>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        <div class=\"swiper-slide\">\r\n");
      out.write("			            <div class=\"card\">\r\n");
      out.write("			                <div class=\"card-body\" id = \"list_body\">\r\n");
      out.write("			                    <h5 class=\"card-title\" id = \"list_title\">어학정보</h5>\r\n");
      out.write("			                    <p class=\"card-text\" id = \"list_text\">\r\n");
      out.write("			                    	<ul class = \"swiper\">\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=TOEIC\">토익(TOEIC)</a></li>\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=TOPIK\">토픽(TOPIK)</a></li>\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=TEPS\">텝스(TEPS)</a></li>\r\n");
      out.write("			            				<li><a href=\"certi_info.jsp?title=토익스피킹\">토익스피킹</a></li>\r\n");
      out.write("			            				<li>-</li>\r\n");
      out.write("			          				</ul>\r\n");
      out.write("			                    </p>\r\n");
      out.write("			                </div>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			      </div>\r\n");
      out.write("			    	<div class=\"swiper-button-next\" style = \"color: #7c5214;\"></div>\r\n");
      out.write("			    	<div class=\"swiper-button-prev\" style = \"color: #7c5214;\"></div>\r\n");
      out.write("		    </div>\r\n");
      out.write("           \r\n");
      out.write("			<hr style=\"border:solid 1px #7c5214\"></hr>\r\n");
      out.write("            \r\n");
      out.write("            <!-- 카드크기 조절해야함 -->\r\n");
      out.write("			<div id=\"certi_list\" style=\"margin-bottom:100px;\">\r\n");
      out.write("            <div class=\"row row-cols-1 row-cols-md-4 g-4\" >\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=화학분석기사\"><img src=\"pic/화학분석기사.png\" class=\"card-img-top\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=화학분석기사\"><h5 class=\"card-title\">화학분석기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단 </p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=토양환경기사\"><img src=\"pic/토양환경기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=토양환경기사\"><h5 class=\"card-title\">토양환경기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title='정보처리기사'\"><img src=\"pic/정보처리기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title='정봋처리기사'\"><h5 class=\"card-title\">정보처리기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=품질경영기사\"><img src=\"pic/품질경영기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=품질경영기사\"><h5 class=\"card-title\">품질경영기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=전기기사\"><img src=\"pic/전기기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=전기기사\"><h5 class=\"card-title\">전기기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=일반기계기사\"><img src=\"pic/일반기계기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=일반기계기사\"><h5 class=\"card-title\">일반기계기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=정보통신기사\"><img src=\"pic/정보통신기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=정보통신기사\"><h5 class=\"card-title\">정보통신기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=항공산업기사\"><img src=\"pic/항공산업기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=항공산업기사\"><h5 class=\"card-title\">항공산업기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=토목,건축기사\"><img src=\"pic/토목,건축기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=토목,건축기사\"><h5 class=\"card-title\">토목,건축기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=시각디자인기사\"><img src=\"pic/시각디자인기사.PNG\" class=\"card-img-top\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=시각디자인기사\"><h5 class=\"card-title\">시각디자인기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단 </p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=MOS\"><img src=\"pic/MOS.PNG\" class=\"card-img-top\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=MOS\"><h5 class=\"card-title\">MOS</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : YBM 시사 </p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국제 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=컴퓨터활용능력\"><img src=\"pic/컴퓨터활용능력.PNG\" class=\"card-img-top\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=컴퓨터활용능력\"><h5 class=\"card-title\">컴퓨터활용능력</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단 </p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=TOEIC\"><img src=\"pic/토익.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=TOEIC\"><h5 class=\"card-title\">TOEIC</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : YBM 시사</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국제 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=식물보호기사\"><img src=\"pic/식물보호기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=식물보호기사\"><h5 class=\"card-title\">식물보호기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=소방설비기사(기계)\"><img src=\"pic/소방설비기사(기계).PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=소방설비기사(기계)\"><h5 class=\"card-title\">소방설비기사(기계)</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=소음진동기사\"><img src=\"pic/소음진동기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=소음진동기사\"><h5 class=\"card-title\">소음진동기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=철도차량기사\"><img src=\"pic/철도차량기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=철도차량기사\"><h5 class=\"card-title\">철도차량기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=자기비파괴검사기사\"><img src=\"pic/자기비파괴검사기사.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=자기비파괴검사기사\"><h5 class=\"card-title\">자기비파괴검사기사</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=워드프로세서\"><img src=\"pic/워드.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=워드프로세서\"><h5 class=\"card-title\">워드프로세서</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 대한상공회의소</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=TOPIK\"><img src=\"pic/토픽.PNG\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=TOPIK\"><h5 class=\"card-title\">TOPIK</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단</p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=TEPS\"><img src=\"pic/텝스.PNG\" class=\"card-img-top\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=TEPS\"><h5 class=\"card-title\">TEPS</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : 한국산업인력공단 </p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"certi_info.jsp?title=토익스피킹\"><img src=\"pic/토익스피킹.PNG\" class=\"card-img-top\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<a href=\"certi_info.jsp?title=토익스피킹\"><h5 class=\"card-title\">토익스피킹</h5></a>\r\n");
      out.write("							<p class=\"card-text\">시행기관 : YBM 시사 </p>\r\n");
      out.write("							<p class=\"card-text\">자격증 분류 : 국가기술 자격증</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("        <script src=\"https://unpkg.com/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   		<!-- Initialize Swiper -->\r\n");
      out.write("   		<script>\r\n");
      out.write("      		var swiper = new Swiper(\".mySwiper\", {\r\n");
      out.write("        	slidesPerView: 4,\r\n");
      out.write("        	centeredSlides: true,\r\n");
      out.write("        	spaceBetween: 50,\r\n");
      out.write("        \r\n");
      out.write("        	navigation: {\r\n");
      out.write("	          nextEl: \".swiper-button-next\",\r\n");
      out.write("	          prevEl: \".swiper-button-prev\",\r\n");
      out.write("        	},\r\n");
      out.write("      	});\r\n");
      out.write("    	</script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
