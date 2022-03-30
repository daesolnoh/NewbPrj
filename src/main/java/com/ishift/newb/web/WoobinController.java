package com.ishift.newb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ishift.newb.service.ToDoService;
import com.ishift.newb.vo.ToDoVo;

@Controller 
public class WoobinController { 
	
	@Autowired
	private ToDoService toDoService;

	//  	/insertPage ver01
	@GetMapping("/insertPage") 
	public String insertPage() {  
		return "wbInsert.html";
	}
	
	// 등록 화면
	@RequestMapping(value = "insert")
	public String insert(Model model ) {  		
		return "wb/insertPage.html"; 
	}
	
	// 할 일 목록 화면
	@RequestMapping(value = "list")
	public String list(Model model ) { 
		List<ToDoVo> toDoVoList = toDoService.getToDoList();
		model.addAttribute("toDoVoList", toDoVoList); 
		return "wb/toDoList.html";  
	}
	 
	
}
