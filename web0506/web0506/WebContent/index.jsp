<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>계산기를 만들어보자.</h3><!-- 제목 만들떄 사용 -->
<hr> <!-- 상단 줄 생성 -->
<h3>더하기 계산</h3>
<form action="cal.jsp">
	숫자1 : <input name="n1"> <br> <!-- br : 엔터 -->
	숫자2 : <input name="n2"> <br> <!-- input : 박스생성 -->
	<button type="submit">서버로 전송</button> 
</form>
<hr> <!-- 상단 줄 생성 -->
<h3>곱하기 계산</h3>
<form action="cal2.jsp">
	숫자1 : <input name="n1"> <br> <!-- br : 엔터 -->
	숫자2 : <input name="n2"> <br> <!-- input : 박스생성 -->
	<button type="submit">서버로 전송</button> 
</form>


</body>
</html>