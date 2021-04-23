<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"> // 스크립트 내 범위 생성
	/* 자바스크립트라는 언어는 변수의 값이 들어갈 때
		변수에 들어갈 데이터의 타입이 결정된다.
		=> 오토타입핑(auto-typing)
		<-> String[] week; // 자바는 선언할 때!
	*/
   week = ["월", "화", "수", "목", "금", "토", "일"] //싱글, 더블 따옴표 무관
   alert(week)
   for (var i = 0; i < week.length; i++) {
	   console.log(week[i])
      if (week[i] == "목") {
         alert("오늘은 목요일. 와 내일 금요일이다!")
      }
   }
</script>
</head>
<body>
   <!-- 
1. 자바 스크립트로 요일을 배열에 넣어서
2. 전체 요일을 프린트
3. 만약 목요일이면, '와 내일 금요일이다!' 프린트!
 -->
</body>
</html>