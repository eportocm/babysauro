package br.com.babysauro.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.babysauro.modelo.Musica;

public class MusicaDao {

	@Inject
	private EntityManager entityManager;
	
	public List<Musica> listaMusicas() {
		return entityManager.createQuery("from Musica", Musica.class).getResultList();
	}
}
