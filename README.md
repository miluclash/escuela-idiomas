Escuela Internacional de Idiomas
Aplicacion web de gestion academica para una escuela de idiomas, desarrollada con Spring Boot, JPA/Hibernate, Thymeleaf y MySQL.
Permite gestionar cursos e inscripciones de alumnos a traves de una interfaz web con operaciones CRUD.
URL del proyecto desplegado: https://escuela-idiomas-production.up.railway.app/inicio
Requisitos previos

Java 17 o superior
MySQL 8.0+
Maven 3.9+
Git

Tecnologias utilizadas

Spring Boot 4.0.6
Spring Data JPA / Hibernate
Thymeleaf
Bootstrap 5.3
MySQL Connector/J 9.7
Railway (despliegue en produccion)

Estructura del proyecto
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
Modelo de datos
Curso
CampoTipoDescripcionidLongClave primaria (auto)idiomaStringNombre del idiomanivelStringNivel (A1, A2, B1, etc.)horarioStringFranja horariaprecioDoublePrecio del curso
Inscripcion
CampoTipoDescripcionidLongClave primaria (auto)nombreAlumnoStringNombre del alumnoapellidosStringApellidos del alumnoemailStringCorreo electronicoidiomMaternoStringIdioma materno del alumnocursoCursoRelacion ManyToOne con Curso
Endpoints
MetodoRutaDescripcionGET/inicioPagina principal con foto y enlacesGET/listadoCursosTabla con todos los cursosGET/listadoInscripcionesTabla con todas las inscripcionesGET/altaCursoFormulario de alta de cursoPOST/altaCursoGuarda un nuevo curso en la BDGET/altaInscripcionFormulario de alta de inscripcionPOST/altaInscripcionGuarda una nueva inscripcion en la BD
Instalacion y ejecucion en local

Clonar el repositorio:

bash   git clone https://github.com/miluclash/escuela-idiomas.git
   cd escuela-idiomas

Crear la base de datos ejecutando el script SQL:

bash   mysql -u root -p < schema.sql

Configurar application.properties con tus credenciales locales de MySQL (usuario, contrasena, host, puerto y nombre de la base de datos).
Ejecutar la aplicacion:

bash   mvn spring-boot:run

Acceder a la aplicacion en http://localhost:8080/inicio

La aplicacion carga automaticamente 10 cursos y 10 inscripciones de ejemplo al arrancar mediante CommandLineRunner.
Capturas de pantalla
Pagina de inicio
Mostrar imagen
Listado de cursos
Mostrar imagen
Listado de inscripciones
Mostrar imagen
Alta de curso
Mostrar imagen
Alta de inscripcion
Mostrar imagen
Pagina de error personalizada
Mostrar imagen
Despliegue en Railway
El proyecto esta desplegado en Railway con los siguientes servicios:

App Spring Boot conectada al repositorio de GitHub (deploy automatico en cada push)
MySQL como servicio de base de datos gestionado por Railway

Las variables de entorno (MYSQLHOST, MYSQLPORT, MYSQLDATABASE, MYSQLUSER, MYSQLPASSWORD, PORT) se configuran en Railway para conectar la app con la base de datos.
Autor
Michael Criollo Guaita
DAW - IES Pio BarojaCompartirContenidoStarting Container
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::       pastedC:\Users\potit\Documents\workspace-spring\escuela-idiomas>docker inspect mysql_alumnos
[
    {
        "Id": "2e64db7959071e96bac601c2b01552a23e7535a050d966fac35c01098213a4ab",
        "Created": "2026-01-16T09:01:53.292651909Z",
        "Path": "docker-entrypoint.sh",
        "Args": [
     pasted
19s
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/43/maven-parent-43.pom
[INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/43/maven-parent-43.pom (50 kB at 1.5 MB/s)
[INFO] Downloading from cepasted[INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/4.0.6/spring-boot-maven-plugin-4.0.6.jar
[INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/4.0.6/spring-boot-mpastedC.F.G.S DAW Juan Antonio García
0 Programación. UT8-RA9-PrácticaJPA
Práctica UT8
Desarrolla una aplicación web con Spring Boot, JPA/Hibernate, Thymeleaf y MySQL que
gestione [cada alumno el tema asignado en el excel].ExcelPrácticaUT8
Requisitos:
• Base de datos MySQL con script de creación (scpasted
