<%@ page import = "test001.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추천</title>
</head>
<body>
<%
				String title = null;
                if(request.getParameter("title") != null){
                	title = request.getParameter("title");
                }
                DBConnection good = new DBConnection();
                int n = good.getNumber(title);
                good.callgood(n);
                %>
                <script>
 				alert('해당 게시글을 추천했습니다. ');
 				location.href = "comcon.jsp?title=<%=title%>";
 				</script>
</body>
</html>