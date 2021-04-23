<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 주요객체 : window, history, document, location -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/out.js"></script> <!-- js 파일과 연결(link용), 다운로드 또는 인터넷 연결해서 사용 가능(https://jqueryui.com/) -->
<script type="text/javascript"><!-- link용과 반드시 별도로 생성 -->
	//site('naver') //직접 입력, 버튼으로 변경 시 닫아주어야 함. 
	//data() //data를 먼저 넣으면 실행 가능, 흐름이 정확하지 않아 사이트가 넘어가 실행 불가
	function cal(){ //계산기 function 추가
		//alert('나는 계산기 기능이에요.')
		console.log('나는 계산기 기능이에요...') //콘솔에 나오게 하는 코드 + 클릭 카운트 //에러발생시 콘솔에 표시됨
	}
</script> 
</head>
<body>
<!-- 버튼 생성 -->
<button type="button" onclick="site('naver')">네이버 사이트로 이동해보자.</button><br> <!-- //바깥 2중 따옴표 안쪽 싱글 따옴표 -->
<button type="button" onclick="site('daum')">다음 사이트로 이동해보자.</button><br>
<button type="button" onclick="cal()">계산기 기능을 사용 해보자.</button>
</body>
</html>