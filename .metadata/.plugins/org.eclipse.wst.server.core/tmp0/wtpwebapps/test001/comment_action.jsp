<%@ page import = "test001.DBConnection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.io.PrintWriter" %>
<jsp:useBean id = "comment" class="test001.comment" scope = "page"/>
<jsp:setProperty name = "comment" property = "*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글업로드 중</title>
</head>
<body>
<%
String UserId = null;
String title = null;

if(session.getAttribute("UserId") != null){
	UserId = (String)session.getAttribute("UserId");
}
if(UserId != null){
     if(request.getParameter("title") != null){
     	title = request.getParameter("title");
     }
     DBConnection getComment = new DBConnection();
     int result = getComment.comment_insert(comment, title, UserId);
     if(result == 1){
    	%>
 		<script>
 		alert('댓글이 작성되었습니다. ');
 		location.href = "comcon.jsp?title=<%=title%>";
 		</script>
 		<%
     }
     
}
else {
	%>
		<script>
		alert('로그인 해주세요. ');
		location.href = "main.jsp";
		</script>
		<%
}
%>
</body>
</html>