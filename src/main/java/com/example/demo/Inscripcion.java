package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Inscripcion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nombreAlumno;
	private String apellidos;
	private String email;
	private String idiomMaterno;
	
	@ManyToOne
	private Curso curso;

	public Inscripcion() {
		super();
	}

	public Inscripcion(String nombreAlumno, String apellidos, String email, String idiomMaterno, Curso curso) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.apellidos = apellidos;
		this.email = email;
		this.idiomMaterno = idiomMaterno;
		this.curso = curso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdiomMaterno() {
		return idiomMaterno;
	}

	public void setIdiomMaterno(String idiomMaterno) {
		this.idiomMaterno = idiomMaterno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Inscripcion [id=" + id + ", nombreAlumno=" + nombreAlumno + ", apellidos=" + apellidos + ", emial="
				+ email + ", idiomMaterno=" + idiomMaterno + ", curso=" + curso + "]";
	}
	
	
	
}
