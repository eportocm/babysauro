package br.com.babysauro.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.babysauro.modelo.Musica;
import br.com.babysauro.service.MusicaService;

@Named
@ViewScoped
public class MusicaBean implements Serializable {

	private static final long serialVersionUID = -6125570024992063283L;
	
	@Inject
	private MusicaService musicaService;
	
	private List<Musica> musicas = new ArrayList<Musica>();
	
	private List<Musica> musicasFiltro = new ArrayList<Musica>();
	
	@PostConstruct
	public void init() {
		
		musicas = musicaService.listaMusicas();
		
	}
	
	public List<Musica> getMusicas() {
		return musicas;
	}
	
	public List<Musica> getMusicasFiltro() {
		return musicasFiltro;
	}
	
	public void setMusicasFiltro(List<Musica> musicasFiltro) {
		this.musicasFiltro = musicasFiltro;
	}
}
