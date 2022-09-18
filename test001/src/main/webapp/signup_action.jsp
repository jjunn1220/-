<%@ page import = "test001.DBConnection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.PrintWriter" %>
<jsp:useBean id = "user" class="test001.User" scope = "page"/>
<jsp:setProperty name = "user" property = "*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 중</title>
</head>
<body>

	<%
	if(user.getId() == null || user.getPassword() == null || user.getPassword_check() == null ||
			user.getName() == null || user.getYear() == null || user.getMonth() == null ||
			user.getDay() == null || user.getFr() == null || user.getSe() == null ||
			user.getTh() == null || user.getEmail() == null || user.getMajor() == null )
	{
		out.println("<script>");
		out.println("alert('입력이 안 된 사항이 있습니다. ')");
		out.println("history.back()");
		out.println("</script>");
	}
	else if(user.getPassword().equals(user.getPassword_check())){
		DBConnection join = new DBConnection();
		int access = join.signup(user);
		if(access == 1){
			out.println("<script>");
			out.println("alert('회원가입 성공!')");
			out.println("</script>");
			pageContext.forward("main.jsp");
		}
		else{
			out.println("<script>");
			out.println("alert('회원가입 실패!!')");
			out.println("history.back()");
			out.println("</script>");
		}
	}
	else{
		out.println("<script>");
		out.println("alert('비밀번호가 맞지 않음')");
		out.println("history.back()");
		out.println("</script>");
	}
	%>
	
</body>
</html>