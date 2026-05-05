package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private InscripcionRepository inscripcion;
	
	@Autowired
	private CursoRepository curso;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Curso ingles = new Curso("Inglés","B2","Mañana",20.99);
		Inscripcion i1 = new Inscripcion("Michael","Criollo Guaita","michael@escuela.com","Español",ingles);
		
		Curso frances = new Curso("Francés", "A1", "Tarde", 18.99);
		Inscripcion i2 = new Inscripcion("Lucía", "Martínez López", "lucia@escuela.com", "Español", frances);

		Curso aleman = new Curso("Alemán", "C1", "Noche", 25.99);
		Inscripcion i3 = new Inscripcion("Carlos", "Pérez Ruiz", "carlos@escuela.com", "Español", aleman);

		Curso italiano = new Curso("Italiano", "A2", "Mañana", 17.99);
		Inscripcion i4 = new Inscripcion("Sophie", "Dupont Blanc", "sophie@escuela.com", "Francés", italiano);

		Curso japones = new Curso("Japonés", "B1", "Tarde", 29.99);
		Inscripcion i5 = new Inscripcion("Ahmed", "Al-Rashid Omar", "ahmed@escuela.com", "Árabe", japones);

		Curso chino = new Curso("Chino", "A1", "Mañana", 27.99);
		Inscripcion i6 = new Inscripcion("Elena", "Rodríguez Vega", "elena@escuela.com", "Español", chino);

		Curso portugues = new Curso("Portugués", "B2", "Noche", 16.99);
		Inscripcion i7 = new Inscripcion("Liam", "O'Brien Kelly", "liam@escuela.com", "Inglés", portugues);

		Curso arabe = new Curso("Árabe", "A2", "Tarde", 22.99);
		Inscripcion i8 = new Inscripcion("Yuki", "Tanaka Mori", "yuki@escuela.com", "Japonés", arabe);

		Curso ruso = new Curso("Ruso", "C2", "Mañana", 24.99);
		Inscripcion i9 = new Inscripcion("María", "González Sanz", "maria@escuela.com", "Español", ruso);

		Curso coreano = new Curso("Coreano", "B1", "Noche", 26.99);
		Inscripcion i10 = new Inscripcion("Lars", "Eriksson Berg", "lars@escuela.com", "Sueco", coreano);
		
		curso.save(ingles); inscripcion.save(i1);
		curso.save(frances); inscripcion.save(i2);
		curso.save(aleman); inscripcion.save(i3);
		curso.save(italiano); inscripcion.save(i4);
		curso.save(japones); inscripcion.save(i5);
		curso.save(chino); inscripcion.save(i6);
		curso.save(portugues); inscripcion.save(i7);
		curso.save(arabe); inscripcion.save(i8);
		curso.save(ruso); inscripcion.save(i9);
		curso.save(coreano); inscripcion.save(i10);
		
	}

}
