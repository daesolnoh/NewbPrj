package com.ishift.newb.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ishift.newb.service.ReplyService;
import com.ishift.newb.vo.ReplyVO;

@RestController
public class ReplyController {
	
	
	@Resource
	private ReplyService service;

	
	  @RequestMapping(value="/reply") 
	  public ModelAndView getList(Map<String,Object> map) throws Exception {
	  
		  ModelAndView mav = new ModelAndView();
		  
	  List<Map<String,Object>> list = service.getList();
	  
	  System.out.println("list====>"+list);
	  
	  mav.addObject("reply",list);
	  mav.setViewName("reply");
	  
	  return mav;
	 
	
	  }
	  
	  @PostMapping(value="/reply/post", consumes="application/json")
	  public  ResponseEntity<?> PostList(@RequestBody ReplyVO vo) throws Exception {
		  
		  System.out.println("param:"+vo);
		  
		 int result =service.RegistList(vo);
		 
		 if(result == 1) {
				return new ResponseEntity<String>("Create Success", HttpStatus.OK);
			}else {
				return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		
	  }
	
	
	
}
