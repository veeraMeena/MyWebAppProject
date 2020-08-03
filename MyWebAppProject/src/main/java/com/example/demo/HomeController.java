package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView  home(Employee emp) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",emp);
		mv.setViewName("home");
		return mv;
	}
}
