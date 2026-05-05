package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String idioma;
	private String nivel;
	private String horario;
	private double precio;
	public Curso() {
		super();
	}
	public Curso(String idioma, String nivel, String horario, double precio) {
		super();
		this.idioma = idioma;
		this.nivel = nivel;
		this.horario = horario;
		this.precio = precio;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", idioma=" + idioma + ", nivel=" + nivel + ", horario=" + horario + ", precio="
				+ precio + "]";
	}

	
}
