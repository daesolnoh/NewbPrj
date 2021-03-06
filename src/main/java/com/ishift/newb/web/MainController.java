package com.ishift.newb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/daesol")
	public String daesolPage() {
		return "daesol.html";
	}
	
	@GetMapping("/jinsu")
	public String jinsuPage() {
		return "jinsu.html";
	}
	
	@GetMapping("/guhyeon")
	public String koohyunPage() {
		return "guhyeon/login.html";
	}
	
	@GetMapping("/woobin")
	public String woobinPage() {
		return "woobin.html";
	}
}
