<%@page import="lol.join_membershipVO"%>
<%@page import="lol.join_membershipDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		//입력해서 전송된 데이터를 받아야 한다.
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String tel = request.getParameter("tel");
			
	        join_membershipVO bag = new join_membershipVO();

	         bag.setId(id);
	         bag.setPw(pw);
	         bag.setTel(tel);

	         //db전담하는 부품에 db에 넣어달라고 요청 예정.
			join_membershipDAO db = new join_membershipDAO();
			db.update(bag);
	%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= id %>님의 패스워드가 <%= pw %>, 전화번호가 <%= tel %>(으)로 수정이 완료되었습니다.
</body>
</html>