package com.ishift.newb.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ishift.newb.vo.ReplyVO;

@Service
public interface ReplyService {
	
	public List<Map<String, Object>> getList() throws Exception;
	
	
	public int RegistList(ReplyVO vo) throws Exception;
}
