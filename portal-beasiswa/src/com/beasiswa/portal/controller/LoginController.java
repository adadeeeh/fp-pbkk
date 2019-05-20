package com.beasiswa.portal.controller;

@Controller
public class LoginController {
	
	@GetMapping("/showLoginPage")
	public String showLoginPage() {
		
		return "plain-login";
	}

}
