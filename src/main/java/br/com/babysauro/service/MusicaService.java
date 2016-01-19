package br.com.babysauro.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.babysauro.dao.MusicaDao;
import br.com.babysauro.modelo.Musica;

public class MusicaService implements Serializable {

	private static final long serialVersionUID = 7404048168288938487L;

	@Inject
	private MusicaDao musicaDao;
	
	public List<Musica> listaMusicas() {
		return musicaDao.listaMusicas();
	}
	
}
