package com.ishift.newb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishift.newb.dao.CustomerDao;
import com.ishift.newb.vo.CustomerVO;

@Service
public class CustomerSerivceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public String getName(){
		return ((CustomerSerivceImpl) customerDao).getName();
	}

	@Override
	public String getGender() {
		return customerDao.getGender();
	}
	
	@Override
	public List<CustomerVO> getCustService(){
		return customerDao.getCustList();
	}
}
