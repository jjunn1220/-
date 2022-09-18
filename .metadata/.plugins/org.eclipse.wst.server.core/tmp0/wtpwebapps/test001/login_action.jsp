<%@ page import = "test001.DBConnection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.PrintWriter" %>
<jsp:useBean id = "login" class="test001.login" scope = "page"/>
<jsp:setProperty name = "login" property = "*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인중</title>
</head>
<body>
	<%
	DBConnection join = new DBConnection();
	int result = join.login_DB(login);
	if(result == 1){
		session.setAttribute("UserId", login.getLoginid());
		out.println("<script>");
		out.println("alert('로그인 되었습니다.')");
		out.println("</script>");
		pageContext.forward("main.jsp");
	}
	else{
		out.println("<script>");
		out.println("alert('아이디나 패스워드가 잘못됐습니다.')");
		out.println("history.back()");
		out.println("</script>");
	}
	%>
</body>
</html>