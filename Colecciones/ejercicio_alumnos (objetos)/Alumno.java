package alumnos;
/*
 * Ejercicio para trabajar ArrayList con funciones en test para añadir elementos, mostrar longitud, ordenar,mostrar elementos y borrar
 * Crear clase Alumno con interfaz Comparable para ordenar ArrayList por nacionalidad, los atributos de Alumno son nombre y 
 * nacionalidad, hacer método toString
 */
public class Alumno implements Comparable<Alumno>{
	protected String nombre;
	protected String nacionalidad;
	//Constructor con parámetros de nombre y nacionalidad
	public Alumno(String nombre,String nacionalidad) {
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
	}
	//Getter y Setter
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad=nacionalidad;
	}
	public String nombre() {
		return nombre;
	}
	public void setNombre() {
		this.nombre=nombre;
	}
	//toString
	@Override
	public String toString() {
		return "Datos de alumno [Nombre=" + nombre + ", Nacionalidad=" + nacionalidad + "]";
	}
	//Se ordena el ArrayList por nacionalidad
	@Override
	public int compareTo(Alumno o) {
		return this.nacionalidad.compareTo(o.nacionalidad);
	}
	

}
