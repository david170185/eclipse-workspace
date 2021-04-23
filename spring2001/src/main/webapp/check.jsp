<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
       //1. 앞페이지에서 넘어온 id/pw를 받아주어야 함.
       //=> Control 부분!!
       String id = request.getParameter("id");
       String pw = request.getParameter("pw");
       String pw2 = request.getParameter("pw2");
       
       
       //2. 로그인 처리->결과는 true/false
       //=> Model 부분!!
       boolean result = false; //로그인이 안되었을 때
       if(id.equals("root") && pw.equals("1234") && pw2.equals("1234")){
          result = true;
       }
       //3. 결과에 따라 클라이언트에게 보여주는 부분을
       //   다르게 만든다.
       //=> view 부분!!
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   if(result){
      out.print("로그인 성공"); //PringWriter out = new PrintWriter();
   }else{
      out.print("로그인 실패");
   }
%>
</body>
</html>\