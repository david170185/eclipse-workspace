<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //설정된 여러 세션값들 중 하나만 제거하는 경우
    //session.removeAttribute("id");
    //세션 자체를 끊어버리는 경우(보편적)
    session.invalidate();
    
    //서버가 브라우저에 무언가를 명령할 때 사용하는 내장된 객체
    //request : 서버에서 받을때, response : 서버에서 명령할때(회신)
    //1)쿠키 심을 때, 2)특정한 페이지를 요청하라고 할 때
    response.sendRedirect("login.jsp");   
    %>
