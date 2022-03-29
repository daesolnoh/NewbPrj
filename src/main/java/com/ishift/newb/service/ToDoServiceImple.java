package com.ishift.newb.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishift.newb.dao.ToDoDao;
import com.ishift.newb.vo.ToDoVo;

@Service
public class ToDoServiceImple implements ToDoService {

	@Autowired
	private ToDoDao toDoDao;
	
	@Override
	public String getTitle(){
		return toDoDao.getTitle();
	}

	@Override
	public ToDoVo getToDo(int id) {
		return toDoDao.getToDo(id);
	}

	@Override
	public List<ToDoVo> getToDoList() {
		return toDoDao.getToDoList();
	}

	@Override
	public int insertToDo(ToDoVo toDoVo) {
		return toDoDao.insertToDo(toDoVo);
	}
	
	@Override
	public int updateFlag(int id) {
		boolean flag = toDoDao.getToDo(id).isFlag();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag", !flag);
		map.put("id", id);
		return toDoDao.updateFlag(map);
	}

	@Override
	public int deleteToDo(int id) {
		return toDoDao.deleteToDo(id);
	}

}
