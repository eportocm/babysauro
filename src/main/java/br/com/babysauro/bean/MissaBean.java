package br.com.babysauro.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.babysauro.modelo.Missa;
import br.com.babysauro.service.MissaService;

@ViewScoped
@Named
public class MissaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private MissaService missaService;
	
	private List<Missa> missas;
	
	@PostConstruct
	public void init() {
		lista();
	}
	
	public void lista() {
		missas = missaService.lista();
	}
	
	public List<Missa> getMissas() {
		return missas;
	}
}
