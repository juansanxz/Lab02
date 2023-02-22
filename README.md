# Laboratorio 2 - CVDS1
* Santiago Arévalo Rojas
* Juan Felipe Sánchez Pérez

## PATTERNS - FACTORY

### LA HERRAMIENTA MAVEN
1. ¿Cuál es su mayor utilidad?

Maven es una herramienta que permite simplificar el proceso de creación y compilación de proyectos en Java. Tiene como principal objetivo permitir al desarrollador comprender el estado de un proyecto en desarrollo en el periodo de tiempo
más corto. Para cumplir con esta meta, Maven tiene cuatro áreas de interés:

	1. Hacer el proceso de construcción más sencillo.
	2. Proveer un sistema de construcción uniforme.
	3. Proveer información de calidad del proyecto.
	4. Estimula las mejores practicas del desarrollo.

2. Fases de Maven

Las fases de maven son las que componen los ciclos de vida. Algunas fases representadas en cada uno de los lifecycle son:
	* Cleam
	* Compile
	* Package
	* Install
	* Deploy

3. Ciclo de vida de la construcción

El ciclo de vida default es el encargado de la construcción y despliegue del proyecto, y está compuesto por las siguientes fases que se ejecutan de forma secuencial para completar el ciclo de vida: 
validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, 
process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy.

Cada fase de construcción se compone de objetivos de pluggins, los cuales contribuyen en la construcción y gestión del proyecto.


4. ¿Para que sirven los pluggins?

Los pluggins son artefactos que proporcionan objetivos a maven. Se componen de una serie de tareas a ejecutarse que apoyan la construcción del software en desarrollo.

5. ¿Qué es y para que sirve el repositorio central de Maven?

El repositorio central es una herramienta que funciona para manejar el versionamiento de proyectos. Es la ubicación predeterminada para descargar las bibliotecas de dependencias que se usarán en el proyecto.

* ¿Cuál(es) de las anterioresinstruccionesse ejecutan y funcionan correctamente y por qué?
Todas se ejecutan correctamente, pero la última opción, Hexagon, permite ejecutar satisfactoriamente lo esperado, ya que es una clase existente. 

## EJERCICIO DE LAS FIGURAS

### CREAR UN PROYECTO CON MAVEN
1. Buscar cómo se crea un proyecto maven con ayuda de los arquetipos(archetypes).
Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype",con lossiguientes
parámetros: 
* Grupo: edu.eci.cvds
* Id del Artefacto: Patterns
* Paquete: edu.eci.cvds.patterns
* archetypeArtifactId: maven-archetype-quickstart

`mvn -B archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -Dpackage=edu.eci.cvds.patterns -DarchetypeArtifactId=maven-archetype-quickstart`

2. Cambie al directorio Patterns:
$ cd Patterns
Para ver el conjunto de archivos y directorios creados por el comando mvn ejecute el comando tree.
$ tree
En algunos sistemas operativos, este comando no funciona correctamente o puede requerir un parámetro (por ejemplo: tree /f). En caso que funcione, la
salida muestra la estructura del proyecto,similar a como se muestra a continuación:



salida muestra la estructura del proyecto,similar a como se muestra a continuación:
