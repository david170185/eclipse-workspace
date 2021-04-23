<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h3> 개인정보 검색 화면</h3>
<hr>

<c:forEach var="vo" items="${list}">
개인 id: ${vo2.id}<br>
개인 pw: ${vo2.pw}<br>
개인 name: ${vo2.name}<br>
개인 tel: ${vo2.tel}<br>
<hr>
</c:forEach>

</body>
</html>