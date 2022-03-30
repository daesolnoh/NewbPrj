package com.ishift.newb.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ishift.newb.dao.NoteDao;

public class NoteServiceImpl implements NoteService {
	@Autowired
	private NoteDao noteDao;

	@Override
	public void joinMember(Map<String, String> param) {
		noteDao.joinMember(param);
	}

	@Override
	public Map<String, String> authMember(Map<String, String> param) {
		return noteDao.authMember(param);
	}

	@Override
	public void insertContent(Map<String, String> param) {
		noteDao.insertContent(param);
	}
}
