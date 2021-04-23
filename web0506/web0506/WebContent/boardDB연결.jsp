<%@page import="shop.BoardVO"%>
<%@page import="shop.BoardDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%

        String id = request.getParameter("id");  
    	BoardDB db = new BoardDB();
    	BoardVO bag = db.read(id);
    	//1. bag 변수 미리 만들어 두었다가 BoardVO bag;
    	//2. read한 결과를 만들어두었던 bag에 넣음. bag = db.read(id)
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 검색이 완료 되었습니다.
<hr> <!-- 표현식, expression -->
검색된 id: <%= bag.getId() %><br>
검색된 title: <%= bag.getTitle() %><br>
검색된 content: <%= bag.getContent() %><br>
검색된 writer: <%= bag.getWriter() %><br>

</body>
</html>