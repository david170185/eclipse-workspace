package com.mega.mvc38;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // BbsDAO dao = new BbsDAO(); 한개만 객체 생성!, 싱글톤!
public class Cart2DAO {

	
	@Autowired
	SqlSessionTemplate my;


	public void create(Cart2VO bag) throws Exception {
		my.insert("cart2.cart2", bag);
	}
}
