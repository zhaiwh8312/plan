package com.convenient.plan.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope(value="prototype")
public class IndexController {
	
	@RequestMapping(value="/index")
	public ModelAndView doIndex() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("view/plan/index.jsp");
		
		return mav;
	}
}
