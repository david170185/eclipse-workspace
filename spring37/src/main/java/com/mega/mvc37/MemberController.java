package com.mega.mvc37;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //어노테이션, 표시
public class MemberController {
	@Autowired
	MemberDAO m; //싱글톤으로 만들어진 객체의 주소를 넣어주세요

	@RequestMapping("insert.mega")
	public void insert(MemberVO bag) throws Exception { //MemberDAO dao 하면 new 가된거임
		System.out.println("(싱글톤)dao의 주소 >>" + m);
	    System.out.println("(프로토타입)vo의 주소 >>" + bag);
		// public void insert(String id,String pw,String name,String tel)
		// 컨트롤러에 이쓴ㄴ 메서드에 변수를 선언하면,
		// 스프링이 객체를 생성해준다.
		// MemberDAO dao = new MemberDAO();
		m.create(bag);
		System.out.println("입력한 id는" + bag.getId());
		System.out.println("입력한 pw는" + bag.getPw());
		System.out.println("입력한 name는" + bag.getName());
		System.out.println("입력한 tel는" + bag.getTel());
		
		//JDBC 절차 4단계
	}
	
	@RequestMapping("delete.mega")
	public void delete(MemberVO bag, MemberDAO dao) throws Exception { //MemberDAO dao 하면 new 가된거임
		// public void insert(String id,String pw,String name,String tel)
		// 컨트롤러에 이쓴ㄴ 메서드에 변수를 선언하면,
		// 스프링이 객체를 생성해준다.
		// MemberDAO dao = new MemberDAO();
		dao.delete(bag);
		System.out.println("입력한 id는" + bag.getId());
	}

	@RequestMapping("login.mega")
	public String login(String id, String pw, String pw2) {
		System.out.println("내가호출됨...!!");
		System.out.println("컨트롤하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		System.out.println("컨트롤러에서 받은 pw2: " + pw2);

		boolean result = false; // 로그인이 안되었을 때
		if (id.equals("root") && pw.equals("1234")) {
			result = true;
		}
		if (result) {
			return "ok"; //view아래에 있는 ok.jsp를 호출함
		} else {
			return "no";
		}
	}
}
