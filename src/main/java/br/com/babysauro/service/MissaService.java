package br.com.babysauro.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.babysauro.dao.MissaDao;
import br.com.babysauro.modelo.Missa;

public class MissaService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private MissaDao missaDao;
	
	public List<Missa> lista() {
		return missaDao.lista();
	}
}
