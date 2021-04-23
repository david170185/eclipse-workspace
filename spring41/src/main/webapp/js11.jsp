<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
   $(function() {
      $('#pw2').keyup(function() { //keyup 작성할때마다 결과값 산출
         pw1 = $('#pw1').val()
         pw2 = $('#pw2').val()
         div = $('div')
         if(pw1 == pw2){
            div.append('<h3 style=color:red;>암호 일치</h3>')
         }else{
            div.append('<h3 style=color:blue;>암호 불일치</h3>') //apend 결과값 클릭시 매번 산출
         }
      }) //pw2
      
      $('#add').click(function() { //click 시 결과값 산출
          reply = $('#reply').val()
          div = $('div')
          div.append('- ' + reply + '<br>')
          $('#reply').val('')
   	  }) //add
   	  
   	  $('#ma').click(function() { //click 시 결과값 산출
          ma = $('#ma').val()
          div = $('div')
          div.append('- ' + ma + '<br>')
	  }) //ma
	  
   	  $('#apple').click(function() { //click 시 결과값 산출
          apple = $('#apple').val()
          div = $('div')
          img = '<img width=100 height=100 img src=resources/img/' + apple + '>'
          div.append('- ' + img + '<br>')
	  }) //ma
	  
}) //root   
</script>
<!-- $('div').html('체크한 결과') -->
</head>
<body>
비밀번호1: <input id="pw1"><br>
비밀번호2: <input id="pw2"><br>
<button>패스워드 일치하는지 확인</button>
<hr>
댓글<input id='reply'><br>
<input type = "button" value="댓글추가" id='add'> <!-- add를 눌렀을때 reply를 달아라 -->
<hr>
<input id="ma" type="button" value='ma.jsp' style='background:yellow; font-size=20px;'>
<input id="apple" type="button" value='apple.png' style='background:pink; font-size=20px;'>
<hr color="red" size="5">
<div></div>
</body>
</html>