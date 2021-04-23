<%@page import="shop.board"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String writer = request.getParameter("writer");    
    	board db = new board ();
    	db.update(id, title, writer);
    %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= id %> 님의 제목이 <%= title %>, 저자가 <%= writer %>로 변경 되었습니다.
</body>
</html>