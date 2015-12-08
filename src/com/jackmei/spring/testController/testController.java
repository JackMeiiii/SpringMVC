package com.jackmei.spring.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {
	@RequestMapping("/test")
	public ModelAndView test() {
		String str = "test实例";
		return new ModelAndView("message", "str", str);
	}
}
