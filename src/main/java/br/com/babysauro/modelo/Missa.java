package br.com.babysauro.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Missa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer idMissa;
	
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	@Column
	private String missa;
	
	@Column
	private String banda;
	
	@Column
	private String obs;
	
	@Column
	private String periodo;
	
	@ManyToOne
	@JoinColumn(name = "idBandaMissa")
	private BandaMissa bandaMissa;

	public Integer getIdMissa() {
		return idMissa;
	}

	public void setIdMissa(Integer idMissa) {
		this.idMissa = idMissa;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getMissa() {
		return missa;
	}

	public void setMissa(String missa) {
		this.missa = missa;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public BandaMissa getBandaMissa() {
		return bandaMissa;
	}

	public void setBandaMissa(BandaMissa bandaMissa) {
		this.bandaMissa = bandaMissa;
	}
}
