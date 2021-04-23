<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
</head>
<body bgcolor="red">
장바구니 등록이 완료되었습니다.!!
<hr color="gold">
등록된 내id: ${cart2VO.mid} <!-- 표현언어(Expression Languages:EL), 속성프린트 --><br>
등록된 상품id: ${cart2VO.pid}<br>           
등록된 상품가격: ${cart2VO.price}<br>           
등록된 상품수량: ${cart2VO.pcount}<br>
<hr color="gold">
<a href="input.jsp">장바구니</a>
<!-- 브라우저에서 요청할 수 있는 페이지만 들어갈 수 있음. webapp아래 파일만! -->
</body>
</html>