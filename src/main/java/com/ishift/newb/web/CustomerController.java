package com.ishift.newb.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ishift.newb.service.CustomerService;
import com.ishift.newb.vo.CustomerVO;

@RestController
public class CustomerController {
		
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/kkh", method={RequestMethod.GET})
	public void test() {
		
		System.out.println("HELLO");
		
		if (customerService.getName() != null) {
			System.out.println(customerService.getName());
		} else {
			System.out.println("빈 값");
		}
		
	}
	
	@RequestMapping(value="/nds")
	public String genderList() {
		System.out.println(customerService.getGender());
		return null;
	}
	
	@RequestMapping("/custJsonlist")
	public String custJsonlist(Model m,HttpServletResponse resp) {
		// service로 부터 select 결과 받아오기
		List<CustomerVO> list = customerService.getCustService();
		System.out.println();
		System.out.println("Size :"+list.size());
		List<Map<String, String>> jlist = new ArrayList<>();

		for(CustomerVO e: list) {
			Map<String, String> map = new HashMap<>();
			map.put("name",e.getName());
			map.put("gender",e.getGender());
			jlist.add(map);
		}

		String result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(jlist);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
