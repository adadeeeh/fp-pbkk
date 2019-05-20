package com.beasiswa.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
