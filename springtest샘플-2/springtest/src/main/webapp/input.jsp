<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
</head>
<body bgcolor="green">
<!-- view부분!! -->
<h3>장바구니</h3>
<hr color="green">
<form action="cart2">
	내아이디: <input type="text" name="mid"><br>
	상품아이디: <input type="text" name="pid"><br>
	상품가격: <input type="text" name="price"><br>
	수량: <input type="text" name="pcount"><br>
	<input type="submit" value="장바구니로 저장">
</form>
</body>
</html>