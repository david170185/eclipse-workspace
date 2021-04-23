<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function plus() {
   num1 = parseInt(document.getElementById('n1').value)
   num2 = parseInt(document.getElementById('n2').value)
   sum = num1 + num2
   alert(sum)
}

function img() {
   img = document.getElementById("img").value
   result = document.getElementById('result')
   loca = '<img src = "resources/img/' + img + '.jpg">'
   result.innerHTML = loca
	
}
</script>
</head>
<body>
숫자1: <input id="n1"><br>
숫자2: <input id="n2"><br>
<button onclick="plus()">더하기</button>
<br>
<br>
보고싶은 이미지 이름: <input id= "img"><br>
<button onclick="img()">이미지 호출</button>
<div id="result"></div>
</body>
</html>