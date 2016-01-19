package br.com.babysauro.dao;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.babysauro.modelo.Missa;

public class MissaDao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager entityManager;
	
	public List<Missa> lista() {
		
		String jpql = "select m from Missa m where m.data >= :hoje";
		
		TypedQuery<Missa> query = entityManager.createQuery(jpql, Missa.class);
		
		query.setParameter("hoje", Calendar.getInstance());
		
		return query.getResultList();
	}
}
