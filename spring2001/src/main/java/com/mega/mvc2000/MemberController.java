package com.mega.mvc2000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("login.mega")
	public String login(String id, String pw, String pw2) { //반환값을 가질때는 String으로 변경!!
		System.out.println("내가 호출됨..!!");
		System.out.println("컨트롤하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		System.out.println("컨트롤러에서 받은 pw2: " + pw2);
		
	    boolean result = false; //로그인이 안되었을 때
	    if(id.equals("root") && pw.equals("1234") && pw2.equals("1234")){
	       result = true;
	    }
	    if (result) {
			return "ok";//views 아래에 있는 ok.jsp를 호출함
		}else {
			return "no";
		}
	    
	       
	       
	}
	
}
