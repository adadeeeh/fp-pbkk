package com.beasiswa.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	

	@GetMapping("/form") public String form(Model themodel) {
	
	//create model attribute to bind form data
	Beasiswa theBeasiswa = new Beasiswa();
	
	themodel.addAttribute("beasiswa", theBeasiswa);
	
	return "beasiswa-form"; }
	
	
	@PostMapping("/saveBeasiswa")
	public String saveBeasiswa(@ModelAttribute("beasiswa") Beasiswa theBeasiswa) {
		
		//save beasiswa using service
		beasiswaService.saveBeasiswa(theBeasiswa);
		
		return "redirect:/beasiswa/list";
	}
	
	@GetMapping("/formUpdate")
	public String formUpdate(@RequestParam("id") int theId, Model theModel) {
		
		//get beasiswa
		Beasiswa theBeasiswa = beasiswaService.getBeasiswa(theId);
		
		//set beasiswa as a model attribute
		theModel.addAttribute("beasiswa", theBeasiswa);
		
		//send form
		return "beasiswa-form";
	}
	
	@GetMapping("/delete")
	public String deleteBeasiswa(@RequestParam("id") int theId) {
		
		beasiswaService.deleteBeasiswa(theId);
		
		return "redirect:/beasiswa/list";
	}
	
	/*
	 * @GetMapping("/detail") public String detail()
	 */
	
	@GetMapping("/detailBeasiswa")
	public String detailBeasiswa(@RequestParam("id") int theId, Model theModel) {
		
		Beasiswa theBeasiswa = beasiswaService.getBeasiswa(theId);
		
		//set beasiswa as a model attribute
		theModel.addAttribute("beasiswa", theBeasiswa);
		
		return "detail-beasiswa";
	}
	
	/*
	 * @RequestMapping("/showForm") public String showForm(Model theModel) {
	 * 
	 * //create hobbit object Beasiswa theBeasiswa = new Beasiswa();
	 * 
	 * //add hobbit object to the model theModel.addAttribute("beasiswa",
	 * theBeasiswa);
	 * 
	 * return "beasiswa-form"; }
	 * 
	 * @RequestMapping("/processForm") public String
	 * processForm(@ModelAttribute("beasiswa") Beasiswa theBeasiswa) {
	 * 
	 * return "list-beasiswa"; }
	 */
	 
}
