package com.ishift.newb.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data  
public class ToDoVo {
	private int id;
	private String title;
	private String content;
	private boolean flag; 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dead_line;
}
