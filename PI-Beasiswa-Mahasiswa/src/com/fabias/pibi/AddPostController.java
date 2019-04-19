package com.fabias.pibi;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddPostController {
	
	@RequestMapping(value ="/addNotes")
	public String showForm() {
		return "add-note";
	}
	
	@RequestMapping(value ="/adminPage")
	public String addNotes(HttpServletRequest request, Model model) {
//		int num = 0;
//		String noted = request.getParameter("noted");
//		num = num + 1;
//		
//		model.addAttribute("Note", noted);
//		model.addAttribute("Number", num);
		
		return "admin-page";
	}
	
	@RequestMapping(value ="/loginAdmin")
	public String showLogin() {
		return "login-admin";
	}
	
	@RequestMapping(value ="/viewBeas")
	public String showBeas() {
		return "view-beasiswa";
	}
	
	@RequestMapping(value ="/viewMhs")
	public String showMhs() {
		return "view-mhs";
	}
	
	@RequestMapping(value ="/addPost")
	public String addPosts() {
		return "add-post";
	}
	
	@RequestMapping(value ="/editBeas")
	public String editBeas() {
		return "edit-beasiswa";
	}
	
	
	@RequestMapping(value ="/noteLists")
	public String noteListed(HttpServletRequest request, Model model) {
		
		String noted = request.getParameter("myNotes");
		
		model.addAttribute("listed", noted);
		
		return "view-note";
	}

}
