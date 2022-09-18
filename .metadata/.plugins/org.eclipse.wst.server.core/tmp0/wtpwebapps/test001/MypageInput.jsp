<%@ page import = "test001.DBConnection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id = "mypage" class="test001.Mypageinput" scope = "page"/>
<jsp:setProperty name = "mypage" property = "*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

		String UserId = null;
		if(session.getAttribute("UserId") != null){
			UserId = (String)session.getAttribute("UserId");
		}
		DBConnection Mypage = new DBConnection();
		int access = Mypage.inputMypage(mypage, UserId);
		
		if(access == 1){
			out.println("<script>");
			out.println("alert('저장했습니다.')");
			out.println("</script>");
			pageContext.forward("Mypage.jsp");
		}
		%>
</body>
</html>