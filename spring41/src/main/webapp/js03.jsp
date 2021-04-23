<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function web() {
	site = document.getElementById('site').value
	if (site == 'naver') {
		location.href = 'http://www.' + site + '.com'		
	}else if (site == 'google') {
		location.href = 'http://www.' + site + '.com'
	}else if (site == 'daum') {
		location.href = 'http://www.' + site + '.net'	
	}else {
		alert("해당 사이트 없음")
	}
}

function pay() {
	store = document.getElementById('store').value
	money1 = parseInt(document.getElementById('money').value)
	choice = document.getElementById('choice').value
	
	if(choice == 1) {
		choice = '계좌이체'
			result = document.getElementById('result')
			result.innerHTML = store + "에서" + money1 + "원" + choice + "로 결제 하셨습니다."
	}else if(choice == 2) {
		choice = '신용카드'
			result = document.getElementById('result')
			result.innerHTML = store + "에서" + (money1+1000) + "원" + choice + "로 결제 하셨습니다."		
		
	}else if(choice == 3) {
		choice = '휴대폰 결제'
			result = document.getElementById('result')
			result.innerHTML = store + "에서" + (money1+500) + "원" + choice + "로 결제 하셨습니다."		 
	}
}
</script>
</head>
<body>
사이트 입력 : <input id="site"><br>
<button onclick="web()">사이트 이동 버튼</button>
<hr>
구매상점 : <input id = "store"><br>
결제금액 : <input id = "money"><br>
결제수단 : <input id = "choice"><br>
1 : 계좌이체 2:신용카드 3: 휴대폰결제<br>
<button onclick="pay()">결제 예상 금액</button>
<hr>
<div id="result" style="background:purple; width:500px; height:200px; font-size: 20px; color:white;"></div>
</body>
</html>