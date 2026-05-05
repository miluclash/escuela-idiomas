# Escuela Internacional de Idiomas

Aplicacion web de gestion academica para una escuela de idiomas, desarrollada con Spring Boot, JPA/Hibernate, Thymeleaf y MySQL.

Permite gestionar cursos e inscripciones de alumnos a traves de una interfaz web con operaciones CRUD.

**URL del proyecto desplegado:** https://escuela-idiomas-production.up.railway.app/inicio

## Requisitos previos

- Java 17 o superior
- MySQL 8.0+
- Maven 3.9+
- Git

## Tecnologias utilizadas

- Spring Boot 4.0.6
- Spring Data JPA / Hibernate
- Thymeleaf
- Bootstrap 5.3
- MySQL Connector/J 9.7
- Railway (despliegue en produccion)

## Estructura del proyecto

```
escuela-idiomas/
├── src/main/java/com/example/demo/
│   ├── DemoApplication.java          # Clase principal + CommandLineRunner (datos iniciales)
│   ├── Curso.java                    # Entidad JPA - Cursos
│   ├── Inscripcion.java              # Entidad JPA - Inscripciones
│   ├── CursoRepository.java          # Repositorio JPA
│   ├── InscripcionRepository.java    # Repositorio JPA
│   └── EscuelaController.java        # Controlador con todos los endpoints
├── src/main/resources/
│   ├── application.properties         # Configuracion de la app
│   ├── templates/                     # Plantillas Thymeleaf
│   │   ├── inicio.html
│   │   ├── listadoCursos.html
│   │   ├── listadoInscripciones.html
│   │   ├── altaCurso.html
│   │   ├── altaInscripcion.html
│   │   └── error.html
│   └── static/                        # Recursos estaticos (imagenes, CSS)
├── schema.sql                         # Script de creacion de la base de datos
├── system.properties                  # Version de Java para Railway
└── pom.xml
```

## Modelo de datos

### Curso
| Campo   | Tipo   | Descripcion              |
|---------|--------|--------------------------|
| id      | Long   | Clave primaria (auto)    |
| idioma  | String | Nombre del idioma        |
| nivel   | String | Nivel (A1, A2, B1, etc.) |
| horario | String | Franja horaria           |
| precio  | Double | Precio del curso         |

### Inscripcion
| Campo        | Tipo   | Descripcion                    |
|--------------|--------|--------------------------------|
| id           | Long   | Clave primaria (auto)          |
| nombreAlumno | String | Nombre del alumno              |
| apellidos    | String | Apellidos del alumno           |
| email        | String | Correo electronico             |
| idiomMaterno | String | Idioma materno del alumno      |
| curso        | Curso  | Relacion ManyToOne con Curso   |

## Endpoints

| Metodo | Ruta                 | Descripcion                          |
|--------|----------------------|--------------------------------------|
| GET    | /inicio              | Pagina principal con foto y enlaces  |
| GET    | /listadoCursos       | Tabla con todos los cursos           |
| GET    | /listadoInscripciones| Tabla con todas las inscripciones    |
| GET    | /altaCurso           | Formulario de alta de curso          |
| POST   | /altaCurso           | Guarda un nuevo curso en la BD       |
| GET    | /altaInscripcion     | Formulario de alta de inscripcion    |
| POST   | /altaInscripcion     | Guarda una nueva inscripcion en la BD|

## Instalacion y ejecucion en local

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/miluclash/escuela-idiomas.git
   cd escuela-idiomas
   ```

2. **Crear la base de datos ejecutando el script SQL:**
   ```bash
   mysql -u root -p < schema.sql
   ```

3. **Configurar `application.properties`** con tus credenciales locales de MySQL (usuario, contrasena, host, puerto y nombre de la base de datos).

4. **Ejecutar la aplicacion:**
   ```bash
   mvn spring-boot:run
   ```

5. **Acceder a la aplicacion** en `http://localhost:8080/inicio`

La aplicacion carga automaticamente 10 cursos y 10 inscripciones de ejemplo al arrancar mediante `CommandLineRunner`.

## Capturas de pantalla

### Pagina de inicio
![Inicio](capturas/inicio.png)
<img width="1894" height="868" alt="Captura de pantalla 2026-05-05 212230" src="https://github.com/user-attachments/assets/9cbc1cc3-2f1b-4300-9ed2-8afae95a900d" />


### Listado de cursos
![Cursos](capturas/listadoCursos.png)
<img width="1894" height="868" alt="Captura de pantalla 2026-05-05 212230" src="https://github.com/user-attachments/assets/686f6408-f81d-402a-8040-69011f0dc29a" />


### Listado de inscripciones
![Inscripciones](capturas/listadoInscripciones.png)
<img width="1894" height="868" alt="Captura de pantalla 2026-05-05 212230" src="https://github.com/user-attachments/assets/68b2859b-1c24-4219-9d36-af8c65b33c04" />


### Alta de curso
![Alta Curso](capturas/altaCurso.png)
<img width="1894" height="868" alt="Captura de pantalla 2026-05-05 212230" src="https://github.com/user-attachments/assets/0c653ee4-ef76-48ca-b349-64656222b6a0" />


### Alta de inscripcion
![Alta Inscripcion](capturas/altaInscripcion.png)
<img width="1894" height="868" alt="Captura de pantalla 2026-05-05 212230" src="https://github.com/user-attachments/assets/0d7280f6-0ae1-4060-b2cd-e9986d81e9d0" />


### Pagina de error personalizada
![Error](capturas/error.png)
<img width="1894" height="868" alt="Captura de pantalla 2026-05-05 212230" src="https://github.com/user-attachments/assets/2592c083-625d-42a6-986a-f5178e1920c9" />


## Despliegue en Railway

El proyecto esta desplegado en Railway con los siguientes servicios:
- **App Spring Boot** conectada al repositorio de GitHub (deploy automatico en cada push)
- **MySQL** como servicio de base de datos gestionado por Railway

Las variables de entorno (`MYSQLHOST`, `MYSQLPORT`, `MYSQLDATABASE`, `MYSQLUSER`, `MYSQLPASSWORD`, `PORT`) se configuran en Railway para conectar la app con la base de datos.

## Autor

**Michael Criollo Guaita**
DAW - IES Pio Baroja
