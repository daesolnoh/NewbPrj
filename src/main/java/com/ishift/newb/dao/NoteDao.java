package com.ishift.newb.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoteDao {
	public void joinMember(Map<String, String> param);

	public Map<String, String> authMember(Map<String, String> param);

	public void insertContent(Map<String, String> param);
}
