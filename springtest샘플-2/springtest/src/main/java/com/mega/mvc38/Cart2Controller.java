package com.mega.mvc38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cart2Controller {

	@Autowired //싱글톤으로 만든 주소 넣어주세요.!(주입, Injection)
	Cart2DAO dao;
	
	@RequestMapping("cart2")
	public void insert(Cart2VO cart2VO) throws Exception {
		dao.create(cart2VO);		
	}
}
