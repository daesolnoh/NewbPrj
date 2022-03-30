package com.ishift.newb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishift.newb.service.ToDoService;
import com.ishift.newb.vo.ToDoVo;

@RestController
@RequestMapping("/woobin") 
public class WoobinApiController {
	@Autowired
	private ToDoService toDoService; 
	
	
	//  테스트용....
	@GetMapping("/test") 
	public List<ToDoVo> getVoList() { 
		System.out.println("vo : " + toDoService.getToDoList());
		List<ToDoVo> toDoVoList = toDoService.getToDoList();
		return toDoVoList;
	}
	
	// 할 일 등록
	@PostMapping("/to-do") 
	public void insertToDo(ToDoVo toDoVo) {
		System.out.println(toDoVo);
		toDoService.insertToDo(toDoVo);
	}
	  
	// flag 변경
	@PutMapping("/to-do/{flagId}")
	public void put(@PathVariable int flagId) {
		System.out.println(flagId); 
		toDoService.updateFlag(flagId);
	}
	  
	// 할 일 삭제
	@DeleteMapping("/to-do/{delTargetId}")
	public void delete(@PathVariable int delTargetId) {
		// delete -> 리소스삭제 200 OK
		System.out.println(delTargetId); 
		toDoService.deleteToDo(delTargetId);
	}
}
