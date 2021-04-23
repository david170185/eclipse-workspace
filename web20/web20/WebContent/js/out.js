/**
 * 설명 기입(주석)
 * 최종 수정 날짜 : 2021.2.23
 * 작성자 : 최용묵
 * 수정내용 : 함수 추가함 
 */

function site(name) { //직접 입력시 name 넣고 하단에서 name으로 변경(jsp naver 입력시)
	//기능을 여러개 추가하고 싶으면 함수 사용, 함수 중심
	//member.jsp 페이지에서 잘라낸 후 복사
	//자바스크립트는 변수를 선언하지 않아도 됨. var!(생략도 가능)
	//site = prompt('사이트 명을 입력하세요.') // 세미클론 보통은 안써도 됨. 직접 입력으로 변경시 막고 jsp 변경

	if(name == "naver"){ //equals 사용 안해도 됨.
		location.href = "http://www.naver.com" //주소 입력 후 특정한 페이지 접속
	}else if(name =="daum"){
		location.href = "http://www.daum.net"
	}else{
		alert('해당 사이트가 없습니다.')	
	}
	
}
function data() {
	s1 = prompt('숫자1입력')
	s2 = prompt('숫자2입력')
	
	n1 = parseInt(s1) // string -> int
	n2 = parseInt(s2)
	
	alert(n1 + n2) 
}
