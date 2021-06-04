package com.empresa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "auto")
public class Auto {
	
	@Column(name = "idauto")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idauto;
	private String modelo;
	private String anio;
	
	@Column(name = "fecharegistro")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecharegistro;
	
	private double costo;
	

	public int getIdauto() {
		return idauto;
	}


	public void setIdauto(int idauto) {
		this.idauto = idauto;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getAnio() {
		return anio;
	}


	public void setAnio(String anio) {
		this.anio = anio;
	}


	public Date getFechaRegistro() {
		return fecharegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fecharegistro = fechaRegistro;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}




	
}
