package com.beasiswa.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beasiswa.portal.entity.Beasiswa;
import com.beasiswa.portal.service.BeasiswaService;

@Controller
@RequestMapping("/beasiswa")
public class BeasiswaController {

	//inject beasiswa service
	@Autowired
	private BeasiswaService beasiswaService;
	
	@GetMapping("/list")
	public String listBeasiswa(Model theModel) {
		
		//get beasiswas from dao
		List<Beasiswa> theBeasiswas = beasiswaService.getBeasiswas();
		
		//add beasiswas to the model
		theModel.addAttribute("beasiswas", theBeasiswas);
		
		return "list-beasiswa";
	}
	
	@GetMapping("/form")
	public String form(Model themodel) {
		
		//create model attribute to bind form data
		Beasiswa theBeasiswa = new Beasiswa();
		
		themodel.addAttribute("beasiswa", theBeasiswa);
		
		return "beasiswa-form";
	}
	
	@PostMapping("/saveBeasiswa")
	public String saveBeasiswa(@ModelAttribute("beasiswa") Beasiswa theBeasiswa) {
		
		//save beasiswa using service
		beasiswaService.saveBeasiswa(theBeasiswa);
		
		return "redirect:/beasiswa/list";
	}
}
