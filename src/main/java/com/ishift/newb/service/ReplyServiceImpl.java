package com.ishift.newb.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishift.newb.dao.ReplyDao;
import com.ishift.newb.vo.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@AllArgsConstructor
@Service
public class ReplyServiceImpl implements ReplyService {
	
	
	@Autowired
	private ReplyDao Dao;

	@Override
	public List<Map<String, Object>> getList() throws Exception {
		
		System.out.println("getList");
		
		return Dao.getReply();
	}

	
		@Override
		public int RegistList(ReplyVO vo) throws Exception {
			
			System.out.println("postList");
			 return Dao.RegistList(vo);
		}
}
