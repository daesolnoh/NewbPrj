package com.ishift.newb.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ishift.newb.vo.ToDoVo;

@Mapper
public interface ToDoDao {
	
	public String getTitle();
	public ToDoVo getToDo(int id);
	public List<ToDoVo> getToDoList();
	public int insertToDo(ToDoVo toDoVo);
	
	public int updateFlag(Map<String,Object> map);
	public int deleteToDo(int id);

}
