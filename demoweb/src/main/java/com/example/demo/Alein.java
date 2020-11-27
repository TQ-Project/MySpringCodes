package com.example.demo;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Alein {

//	@ResponseBody
//	@RequestMapping("home")
//	public String show() {
//		return "home";
//	}
	
	

//	@RequestMapping("home")
//	public ModelAndView display(@RequestParam("name") String myName)
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("name",myName);
//		mv.setViewName("home");
//		return mv;
//	}
	
	@RequestMapping("home")
	public ModelAndView display(Person person)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",person);
		mv.setViewName("home");
		return mv;
	}
	
}
