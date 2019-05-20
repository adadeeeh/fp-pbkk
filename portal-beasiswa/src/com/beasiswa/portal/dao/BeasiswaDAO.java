package com.beasiswa.portal.dao;

import java.util.List;

import com.beasiswa.portal.entity.Beasiswa;

public interface BeasiswaDAO {

	public List<Beasiswa> getBeasiswas();

	public void saveBeasiswa(Beasiswa theBeasiswa);
}
