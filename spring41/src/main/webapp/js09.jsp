<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> -->
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	//버튼을 클릭했을 떄
	//data에 들어있는 value를 가지고 와서 출력
	$(function() {
		$('#button1').click(function() {
			data = $('#data').val()
			alert(data)
		})
		$('#button2').click(function() {
			data2 = $('#data2').val()
			alert(data2)
		})
		$('#button3').click(function() {
			data3 = $('#data3').val()
			alert(data3.length)
		})
	})
</script>
</head>
<body>
<input id="data" value="밥먹으로 가자!">
<button id="button1">뭐할꺼니??</button>
<hr>
<input id="data2" value="집으로 가자!">
<button id="button2">오늘 끝나고 어디로 갈까?</button>
<hr>
<input id="data3" value="apple">
<button id="button3">아이디 길이 체크</button>
</body>
</html>