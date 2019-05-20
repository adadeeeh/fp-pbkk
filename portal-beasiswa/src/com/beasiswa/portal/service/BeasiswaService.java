package com.beasiswa.portal.service;

import java.util.List;

import com.beasiswa.portal.entity.Beasiswa;

public interface BeasiswaService {

	public List<Beasiswa> getBeasiswas();
	
	public void saveBeasiswa(Beasiswa theBeasiswa);

	public Beasiswa getBeasiswa(int theId);

	public void deleteBeasiswa(int theId);
}
