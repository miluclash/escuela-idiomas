package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EscuelaController {
	@Autowired
	private InscripcionRepository inscripcionRepository;
	@Autowired
	private CursoRepository cursoRepository;
	
	//GET /inicio → página principal con foto y enlaces
	@GetMapping("/inicio")
	public String mostrarInicio(Model model) { 
		return "inicio";
	}
	
	//GET /listadoCursos → tabla con todos los cursos
	/*Necesita sacar todos los cursos de la BD y pasárselos a la vista */
	@GetMapping("/listadoCursos")
	public String listadoCursos(Model model) {
		model.addAttribute("cursos",cursoRepository.findAll());
		return "listadoCursos";
	}
	
	//GET /listadoInscripciones → tabla con todas las inscripciones
	/*Necesita sacar todas las inscripciones de la BD y pasárselos a la vista */
	@GetMapping("/listadoInscripciones")
	public String listadoInscripciones(Model model) {
		model.addAttribute("inscripciones", inscripcionRepository.findAll());
		return "listadoInscripciones";
	}

	
	//GET /altaCursos → formulario de alta.
	@GetMapping("/altaCurso")
	public String altaCurso(Model model) {
		model.addAttribute("curso", new Curso());
		return "altaCurso";
	}
	
	//GET /altaInscripcion → formulario de alta.
	@GetMapping("/altaInscripcion")
	public String altaInscripcion(Model model) {
		model.addAttribute("inscripcion", new Inscripcion());
		  model.addAttribute("cursos", cursoRepository.findAll());
		return "altaInscripcion";
	}
	
	//POST curso
	@PostMapping("/altaCurso")
	public String guardarCurso(@ModelAttribute Curso curso) {
		cursoRepository.save(curso);
		return "redirect:/listadoCursos";
	}
	
	//POST inscripcion
		@PostMapping("/altaInscripcion")
		public String guardarInscripcion(@ModelAttribute Inscripcion inscripcion) {
			inscripcionRepository.save(inscripcion);
			return "redirect:/listadoInscripciones";
		}
	
	
}
