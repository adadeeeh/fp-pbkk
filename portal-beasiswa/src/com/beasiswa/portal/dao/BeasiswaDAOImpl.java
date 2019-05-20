package com.beasiswa.portal.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beasiswa.portal.entity.Beasiswa;

@Repository
public class BeasiswaDAOImpl implements BeasiswaDAO {

	//inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Beasiswa> getBeasiswas() {
		
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create a query
		Query<Beasiswa> theQuery = currentSession.createQuery("from Beasiswa", Beasiswa.class);
		
		//execute query and get result list
		List<Beasiswa> beasiswas = theQuery.getResultList();
		
		//return the results
		return beasiswas;
	}

	@Override
	public void saveBeasiswa(Beasiswa theBeasiswa) {

		//get hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save or update beasiswa
		currentSession.saveOrUpdate(theBeasiswa);
	}

	@Override
	public Beasiswa getBeasiswa(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Beasiswa theBeasiswa = currentSession.get(Beasiswa.class, theId);
		
		return theBeasiswa;
	}

	@Override
	public void deleteBeasiswa(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//delete object with pk
		Query theQuery = currentSession.createQuery("delete from Beasiswa where id=:id");
		theQuery.setParameter("id", theId);
		
		theQuery.executeUpdate();
	}

}
