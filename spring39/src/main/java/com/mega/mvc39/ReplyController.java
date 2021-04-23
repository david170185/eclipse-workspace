package com.mega.mvc39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("Reply_insert")
	public void insert(ReplyVO replyVO) throws Exception {
		dao.create(replyVO);
	}
	
	@RequestMapping("Reply_update")
	public void update(ReplyVO replyVO) throws Exception {
		dao.update(replyVO);	
	}
	
	@RequestMapping("Reply_delete")
	public void delete(ReplyVO replyVO) throws Exception {
		dao.delete(replyVO);	
	}
	

}
