<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<!--달러 사용을 위해서는 제이쿼리 다운로드 필요  -->
<script type="text/javascript">
//document.ready() 다큐먼트가 완료되면 나를 실행
//body 부분을 먼저 브라우저가 읽고와서 body안에 있는 요소들을
//브라우저가 인식한 후에 설정을 하게됨
	$(function() {
		//바디 부분을 브라우저가 먼저 읽고와서
		//ram에 트리구조로 body부분을 만들어서 포함관계를 알 수 있음.
		//부모, 자식간의 관계가 성립
		//Document Object Model(DOM) tree
		//실행할 내용을 이름없는 함수에 바로 넣어준다.
		alert('body 태그 안에있는 요소들을 모두 읽어서 브라우저가 인식하고 있음')
			//button 태그를 클릭했을 때 입력값으로 들어온
			//함수 부분을 실행해주세요..!
			//콜백함수(아래실행시 뒤로가서 실행)
			//태그이름$('태그이름'), 클래스이름$('.클래스이름')
			//아이디이름 $('#아이디이름')
		$('#button1').click(function() { //button1로 인식 불가 #넣어야함
			data = $('#data2').val() //data2로 설정
			alert('입력된 값은' + data)
		})
		$('#button2').click(function() { //button1로 인식 불가 #넣어야함
			data = $('#data3').val() //data2로 설정
			alert('입력된 값은' + data)
		})
	}) 
</script>
</head>
<body>
<input id="data">
<input id="data2">
<button id="button1">뭐할꺼니??</button>
<hr color="green">
<input id="data3">
<button id="button2">어디로 갈꺼니??</button>
<hr>
</body>
</html>