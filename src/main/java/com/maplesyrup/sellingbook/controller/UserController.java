package com.maplesyrup.sellingbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


	public UserController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping("index.do")	
	public String index(){
		System.out.println("hihihi");

		return "main/index";
	}
}