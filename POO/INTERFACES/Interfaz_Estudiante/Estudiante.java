

package ejercicio_estudiante;

public class Estudiante implements Comparable {
	
	//Atributos
	private String nombre;
	private int edad;
	private int curso;
	
	public Estudiante(String nombre, int edad, int curso) {
		// Constructor
		this.nombre=nombre;
		this.edad=edad;
		this.curso=curso;
		
	}
	//Getter y Setter
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getCurso() {
		return curso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Datos de estudiante: [Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + curso + "]";
	}
	//Método que permite ordenar por edad
	@Override
	public int compareTo(Object arg0) {
		//Se transforma el Object a la clase Estudiante
		Estudiante otroEstudiante=(Estudiante) arg0;
		if(this.edad>otroEstudiante.edad) return 1;
		if(this.edad<otroEstudiante.edad) return -1;
		return 0;
	}
	
}
