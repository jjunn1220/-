/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-06-08 13:09:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import test001.DBConnection;
import java.util.ArrayList;
import test001.feedList;

public final class feedList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("test001.feedList");
    _jspx_imports_classes.add("test001.DBConnection");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("        <link rel=\"stylesheet\" href=\"feedList.css\">\r\n");
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
      out.write("                <map name=\"mapuse\">\r\n");
      out.write("                	<area shape=\"defalt\" href=\"main.jsp\">\r\n");
      out.write("                </map>\r\n");
      out.write("                \r\n");
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
      out.write("          						<a class=\"nav-link\" href = \"main.jsp#certi_list\" >자격증</a>\r\n");
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
      out.write("			</nav> \r\n");
      out.write("		<div class=\"container\" style = \"margin-top:3em;\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <table class=\"table table-striped\" style=\"text-align: center; border: 1px solid #dddddd\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th style=\"background-color: #5c3a07; text-align: center;  color: white;\">제목</th>\r\n");
      out.write("                        <th style=\"background-color: #5c3a07; text-align: center;  color: white;\">작성자</th>\r\n");
      out.write("                        <th style=\"background-color: #5c3a07; text-align: center;  color: white;\">작성일</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                \r\n");
      out.write("                ");

                DBConnection feedList_DB = new DBConnection();
                ArrayList<feedList> list = feedList_DB.getList();
                for(int i = 0; i < list.size(); i++){
                	
      out.write("\r\n");
      out.write("                	\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><a href=\"comcon.jsp?title=");
      out.print( list.get(i).getTitle() );
      out.write("\" style = \"color:black !important;\"> ");
      out.print( list.get(i).getTitle());
      out.write(" </a></td>\r\n");
      out.write("                        <td>");
      out.print( list.get(i).getWriter() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( list.get(i).getDate() );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                    }
                    
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("     </div>\r\n");
      out.write("    </div>\r\n");
      out.write("                <!-- 글쓰기 버튼 생성 -->\r\n");
      out.write("            ");

			if(UserId != null){
			
      out.write("\r\n");
      out.write("            <button onclick=\"location.href='feedAdd.jsp'\" class = \"write_btn\">글쓰기</button>\r\n");
      out.write("            ");
 }else {
            
      out.write("\r\n");
      out.write("            <button onclick=\"location.href='login.jsp'\" class = \"write_btn\">글쓰기</button>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
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
