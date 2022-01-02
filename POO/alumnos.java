
package alumnosNotas;
/* Ejercicio de alumnos, atributos de nombre, dirección
 * y nota media. Ponemos un primer constructor que pida por parámetro 
 * todos los datos del objeto, y un segundo constructor que sólo pida
 * la nota media y el resto se hace sobrecarga de datos (sin asignar).
 * Crear los métodos getter y setter de todos los atributos privados,
 * y el método que comprueba si la nota media está comprendida entre 
 * 0 a 10.
 * La ciudad es un dato estático (Madrid)
 */
public class alumnos {
	public static String ciudad="Madrid";
	private String nombre;
	String direccion;
	private double notaMedia;
	
	//Constructor con parámetros de todos los datos
	public alumnos(String nombre, String direccion, double notaMedia) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.notaMedia=notaMedia;
	}
	//Constructor con nota como parámetro, y sobrecarga de datos 
	public alumnos(double notaMedia) {
		this("sin asignar", "sin asignar",notaMedia);
		
	}
	public static void incluirCiudad() {
		System.out.println("Ciudad del alumno: "+ciudad);
	}
	//getter y setter
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	public void comprobarNota() {
		if((this.notaMedia>=0)&&(this.notaMedia<=10)){
			System.out.println("Nota correcta");
		}else {
			System.out.println("Nota incorrecta");
		}
	}
	//Método toString
	@Override
	public String toString() {
		return "Datos de alumnos:\nNombre=" + nombre + "\nDirección=" + direccion + "\nNota media=" + notaMedia;
	}

	
	public static void main(String[] args) {
		alumnos alumno=new alumnos("Carla","calle Margaritas",4.5);
		alumnos alumno2=new alumnos(5.5);
		alumnos alumno3=new alumnos("Pepe","calle Talia", 6.5);
		alumnos alumno4=new alumnos(7.5);
		alumnos alumno5=new alumnos(8);
		alumnos alumno6=new alumnos(-8);
		
		System.out.println(alumno.toString());
		alumno.comprobarNota();
		alumnos.incluirCiudad();
		System.out.println("__________________");
		System.out.println(alumno2.toString());
		alumno2.comprobarNota();
		alumnos.incluirCiudad();
		System.out.println("__________________");
		alumno3.comprobarNota();
		System.out.println(alumno3.toString());
		alumnos.incluirCiudad();
		System.out.println("__________________");
		System.out.println(alumno4.toString());
		alumno4.comprobarNota();
		alumnos.incluirCiudad();
		System.out.println("__________________");
		System.out.println(alumno6.toString());
		alumno6.comprobarNota();
		alumno6.incluirCiudad();
	
	}

}
