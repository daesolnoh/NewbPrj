package com.ishift.newb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishift.newb.dao.CustomerDao;

import lombok.RequiredArgsConstructor;

@Service
public class CustomerSerivceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public String getName(){
		return ((CustomerSerivceImpl) customerDao).getName();
	}
}
