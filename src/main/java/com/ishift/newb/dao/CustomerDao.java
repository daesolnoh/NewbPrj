package com.ishift.newb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ishift.newb.vo.CustomerVO;

@Mapper
public interface CustomerDao {
	
	public String getName();
	
	public String getGender();
	
	public List<CustomerVO> getCustList();
	

}
