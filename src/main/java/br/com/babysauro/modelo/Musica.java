package br.com.babysauro.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Musica")
public class Musica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer idMusica;
	
	@Column(name = "nome")
	private String nomeMusica;
	
	public Integer getIdMusica() {
		return idMusica;
	}

	public void setIdMusica(Integer idMusica) {
		this.idMusica = idMusica;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
}
