package com.ishift.newb.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ishift.newb.service.NoteService;

@RestController
public class NoteController {
	@Autowired
	private NoteService noteService;

	@RequestMapping(value = "/login", method = { RequestMethod.GET })
	public ModelAndView login() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("/guhyeon/login.html");

		return mv;
	}

	@RequestMapping(value = "/loginProg", method = { RequestMethod.POST })
	public Map<String, String> loginProg(@RequestParam Map<String, String> param) {

		Map<String, String> result = noteService.authMember(param);

		if (result.isEmpty()) {
			result.put("ID", "error");
		}

		return result;

	}

	@RequestMapping(value = "/join", method = { RequestMethod.GET })
	public ModelAndView join() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("/guhyeon/join.html");

		return mv;
	}

	@RequestMapping(value = "/joinProg", method = { RequestMethod.POST })
	public String joinProg(@RequestParam Map<String, String> param) {

		if (!param.isEmpty()) {
			noteService.joinMember(param);
			return "success";
		}

		return "failed";

	}

	@RequestMapping(value = "/main", method = { RequestMethod.GET })
	public ModelAndView main(@RequestParam(value = "userId") String userId) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("/guhyeon/main.jsp");
		mv.addObject("userId", userId);

		return mv;
	}

	@RequestMapping(value = "/mainProg", method = { RequestMethod.POST })
	public String mainProg(@RequestParam Map<String, String> param) {

		if (!param.isEmpty()) {
			noteService.insertContent(param);
			return "success";
		}

		return "failed";

	}
}
