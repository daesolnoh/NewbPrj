package com.ishift.newb.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface NoteService {
	void joinMember(Map<String, String> param);

	Map<String, String> authMember(Map<String, String> param);

	void insertContent(Map<String, String> param);
}
