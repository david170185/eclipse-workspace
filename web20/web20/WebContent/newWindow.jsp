<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Dialog - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script> <!-- 인터넷 주소를 연결하여 함수를 가져옴  -->
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> <!-- 다운로드 : https://jquery.com/, 도구더보기, 다른이름으로 저장, js에 넣기 -->
  <script>/* CDN(content delivery network) 다운로드 안할때 사용 :  */
  $( function() {
    $( "#dialog" ).dialog(); /* # == id */
  } );
  </script>
</head>
<body>
 
<div id="dialog" title="환영합니다.">
  <p>회원가입이 완료 되었습니다. 감사합니다.</p>
</div>
 
 
</body>
</html>