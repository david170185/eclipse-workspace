<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body bgcolor = "gold">
<!-- view 부분!! -->
<h3>회원가입</h3>
<hr color="red">
<form action="insert.mega">
   아이디: <input type="text" name="id"><br>
   패스워드: <input type="text" name="pw"><br>
   이름 : <input type="text" name="name"><br>
   전화번호 : <input type="text" name="tel"><br>   
   <input type="submit" value="회원가입 처리">
</form>
</body>
</html>