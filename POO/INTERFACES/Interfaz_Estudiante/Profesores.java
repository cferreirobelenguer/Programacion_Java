package ejercicio_estudiante;

public class Profesores implements Comparable <Profesores>{
	
	//Atributos
	private String nombre;
	private int tutor;
	private String cargo;
	public Profesores(String nombre, int tutor) {
		// Constructor
		this.cargo="Profesor";
		this.nombre=nombre;
		this.tutor=tutor;
	}
	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public int getTutor() {
		return tutor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTutor(int tutor) {
		this.tutor = tutor;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	//toString
	@Override
	public String toString() {
		return "Datos de profesores [Nombre=" + nombre + ", Curso del que es tutor=" + tutor + ", Profesión=" + cargo + "]";
	}
	@Override
	//Método para ordenar alfabéticamente los nombres de los profesores
	public int compareTo(Profesores o) {
		Profesores otroProfe=(Profesores) o;
		return this.nombre.compareTo(otroProfe.nombre);
	}
	
}
