<%@page import="shop.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	MemberDB db = new MemberDB();
    	ArrayList<MemberVO> list = db.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for (int i = 0; i < list.size(); i++) { //ArrayListTest4 참조
	MemberVO bag2 = list.get(i);
%>
<%=bag2.getId() %>, <%=bag2.getPw() %>, <%=bag2.getName() %>, <%=bag2.getTel() %><br>


<% } %> <!-- java 코드는 퍼센트 안에 작성 -->
</body>
</html>