<%@page import="pack03.BookDAO"%>
<%@page import="pack03.BookVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.(책등록.jsp)
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String story = request.getParameter("story");
        String company = request.getParameter("company");    
    	// 중간내용 DB 전담으로 이동함.
    	//1. 가방 만들기.
    	BookVO bag = new BookVO();
    	//2. 가방에 넣기.
    	bag.setId(id);
    	bag.setTitle(title);
    	bag.setStory(story);
    	bag.setCompany(company);
    	// db전담하는 부품에서 db에 넣어달라고 할 예정.  	
    	BookDAO db = new BookDAO();
    	//db.create(id, title, story, company); // 가방에 넣어서 전달
    	db.create(bag);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
책 등록이 완료 되었습니다.
</body>
</html>