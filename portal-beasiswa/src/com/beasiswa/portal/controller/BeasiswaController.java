package com.beasiswa.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beasiswa.portal.dao.BeasiswaDAO;
import com.beasiswa.portal.entity.Beasiswa;

@Controller
@RequestMapping("/beasiswa")
public class BeasiswaController {

	//inject beasiswa dao
	@Autowired
	private BeasiswaDAO beasiswaDAO;
	
	@RequestMapping("/list")
	public String listBeasiswa(Model theModel) {
		
		//get beasiswas from dao
		List<Beasiswa> theBeasiswas = beasiswaDAO.getBeasiswas();
		
		//add beasiswas to the model
		theModel.addAttribute("beasiswas", theBeasiswas);
		
		return "list-beasiswa";
	}
}
