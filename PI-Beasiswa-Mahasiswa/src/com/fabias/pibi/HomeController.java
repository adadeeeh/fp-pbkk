package com.fabias.pibi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String showMyPage2() {
		return "homepage";
	}
	
	@RequestMapping("/")
	public String showMyPage1() {
		return "homepage";
	}

}
