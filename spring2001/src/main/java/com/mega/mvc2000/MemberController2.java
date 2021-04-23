package com.mega.mvc2000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController2 {

	@RequestMapping("insert.mega")
	public void insert(MemberVO bag, MemberDAO2 dao) throws Exception {
		// public void login(String id, String pw, String name, String tel) {
		// 컨트롤러에 있는 메서드에 변수를 선언하면,
		// 스프링이 객체를 생성해준다.
		// MemberDAO dao = new MemberDAO();
		dao.create(bag);
		System.out.println("내가 호출됨..!!");
		System.out.println("컨트롤하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getPw());
		System.out.println("컨트롤러에서 받은 name: " + bag.getName());
		System.out.println("컨트롤러에서 받은 tel: " + bag.getTel());
	}
	// JDBC 프로그램 절차 4단계

	@RequestMapping("delete.mega")
	public void delete(MemberVO bag, MemberDAO2 dao) throws Exception {
		// public void login(String id, String pw, String name, String tel) {
		// 컨트롤러에 있는 메서드에 변수를 선언하면,
		// 스프링이 객체를 생성해준다.
		// MemberDAO dao = new MemberDAO();
		dao.delete(bag);
		System.out.println("내가 호출됨..!!");
		System.out.println("컨트롤하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getPw());

	}

}