package br.com.babysauro.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BandaMissa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer idBandaMissa;
	
	@Column
	private String nomeBanda;

	public Integer getIdBandaMissa() {
		return idBandaMissa;
	}

	public void setIdBandaMissa(Integer idBandaMissa) {
		this.idBandaMissa = idBandaMissa;
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
		
}
