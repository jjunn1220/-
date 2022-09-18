<%@ page import = "test001.DBConnection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.PrintWriter" %>
<jsp:useBean id = "feedAdd" class="test001.feddAdd" scope = "page"/>
<jsp:setProperty name = "feedAdd" property = "*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 등록 중</title>
</head>
<body>
	<%
	String UserId = null;
	if(session.getAttribute("UserId") != null){
		UserId = (String)session.getAttribute("UserId");
	}
	
	if(UserId != null){
		DBConnection feed = new DBConnection();
		int result = feed.feedAdd_DB(feedAdd, UserId);
		if(result == 1){
			out.println("<script>");
			out.println("alert('글을 업로드 했습니다.')");
			out.println("history.back()");
			out.println("</script>");
			pageContext.forward("feedList.jsp"); //이거 글 목록으로 이동해야함
		}
		else{
			out.println("<script>");
			out.println("alert('글쓰기에 오류 발생.')");
			out.println("history.back()");
			out.println("</script>");
		}
	}
	else{
		pageContext.forward("login.jsp");
	}
	%>
</body>
</html>