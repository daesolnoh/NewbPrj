package com.ishift.newb.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ishift.newb.vo.ReplyVO;



@Mapper
public interface ReplyDao {

	
	public List<Map<String, Object>> getReply() throws Exception;
	
	
	public int RegistList(ReplyVO vo) throws Exception;
}
