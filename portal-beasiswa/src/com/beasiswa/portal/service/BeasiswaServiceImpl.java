package com.beasiswa.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beasiswa.portal.dao.BeasiswaDAO;
import com.beasiswa.portal.entity.Beasiswa;


@Service
public class BeasiswaServiceImpl implements BeasiswaService {

	//inject beasiswa dao
	@Autowired
	private BeasiswaDAO beasiswaDAO;
	
	@Override
	@Transactional
	public List<Beasiswa> getBeasiswas() {
		return beasiswaDAO.getBeasiswas();
	}

	@Override
	@Transactional
	public void saveBeasiswa(Beasiswa theBeasiswa) {
		
		beasiswaDAO.saveBeasiswa(theBeasiswa);
	}

	@Override
	@Transactional
	public Beasiswa getBeasiswa(int theId) {
		
		return beasiswaDAO.getBeasiswa(theId);
	}

	@Override
	@Transactional
	public void deleteBeasiswa(int theId) {

		beasiswaDAO.deleteBeasiswa(theId);
	}

}
