package com.questionpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.questionpro.pojo.UserPojo;


@CrossOrigin
@Controller
public class HomeController {
	
	
	@PostMapping("/login")
	@ResponseBody
	public boolean login(@RequestBody UserPojo userPojo) {
		if(userPojo.getEmail().equals("ayush@gmail.com") && userPojo.getPassword().equals("xyz")) {
			return true;
		}
		return false;
	}
	
}
