<%@page import="shop.MemberVO"%>
<%@page import="shop.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.(member.jsp)
        String id = request.getParameter("id");    
    	// 중간내용 DB 전담으로 이동함.
    	// db전담하는 부품에서 db에 넣어달라고 할 예정.
    	MemberDB db = new MemberDB();
    	db.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 탈퇴가 완료 되었습니다.
</body>
</html>