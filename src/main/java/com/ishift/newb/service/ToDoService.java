package com.ishift.newb.service;

import java.util.List;

import com.ishift.newb.vo.ToDoVo;

public interface ToDoService {

	String getTitle();
	
	ToDoVo getToDo(int id);
	
	List<ToDoVo> getToDoList();
	
	int insertToDo(ToDoVo toDoVo);
	
	int updateFlag(int id);
	
	int deleteToDo(int id);
	
}
