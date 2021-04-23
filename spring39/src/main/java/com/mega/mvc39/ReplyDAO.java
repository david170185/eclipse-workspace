package com.mega.mvc39;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReplyDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void create(ReplyVO bag) throws Exception {
		my.update("Reply.update", bag);
	}
	
	public void update(ReplyVO bag) throws Exception {
		my.update("Reply.update", bag);
	}
	
	public void delete(ReplyVO bag) throws Exception {
		my.delete("Reply.delete", bag);
	}
	
}
