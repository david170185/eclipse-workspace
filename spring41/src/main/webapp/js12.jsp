<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- $('div').html('체크한 결과') -->
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
   $('#add').click(function() {
      re = $('#reply').val()
      div = $('div')
      div.append('-' + re + '<br>')
   })
   $('#ma').click(function() {
      ma = $('#ma').val()
      div = $('div')
      img = '<img width=150 height=150 src=resources/img/'+ ma + '>'
      div.append(img+'<br>')
   })
   $('#프린트').click(function() {
      re = $('#reply').val()
            프린트 = $('#프린트').val()
      div = $('div')
      img = '<img width=150 height=150 src=resources/img/'+ 프린트 + '>'
      div.append(img + " " + re + '<br>')
   })
})
</script>
</head>
<body>
댓글: <input id='reply'>
<button id="add">댓글추가</button>
<button id="ma" value="ma.jpg">이미지추가</button>
<button id="프린트" value="ma.jpg">이미지+댓글</button>
<hr color="pink" size="5">
<div></div>
<hr>

</body>
</html>