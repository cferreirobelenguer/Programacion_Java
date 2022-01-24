


/*
 * EJEMPLO DE POLIMORFISMO
 * Ejemplo de polimorfismo en el método imprimirDatos.
 * Superclase Persona y clase heredada Alumnos, cada función imprimir datos hace una
 * función distinta en cada clase. En persona crear dos constructores, uno sin parámetros y con datos predefinidos y
 * otro con parámetros.
 * Atributos para persona(nombre, apellidos, fecha de nacimiento, edad, dni, domicilio
 * domicilio es protected y el resto son atributos privados.
 * Atributos para alumno(los heredados y curso, número de matrícula);
 * Hacer getter y setter y toString de ambas clases
 */
package ejemplo_polimorfismo;
import java.util.*;
public class Persona {
	//Atributos privados, sólo pueden verse o modificarse en las clases heredades mediante Getter y Setter
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private int edad;
	private String dni;
	//Atributo protected puede verse en la propia clase y en las clases heredadas
	protected String domicilio;
	
	public Persona() {
		//Constructor de persona anónima sin parámetros
		this.nombre="Anónimo";
		this.apellidos="Anónimo2";
		this.fechaNacimiento="Sin Definir";
		this.edad=0;
		this.dni="xxxxxxxxx";
		this.domicilio="Sin especificar";
	}
	public Persona(String nombre, String apellidos, String fechaNacimiento, int edad, String dni,String domicilio) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.edad=edad;
		this.dni=dni;
		this.domicilio=domicilio;
		
	}
	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio=domicilio;
	}
	//toString()
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", edad=" + edad + ", dni=" + dni + "domicilio= "+domicilio+"]";
	}
	//Polimorfismo
	public void imprimirDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Fecha: "+fechaNacimiento);
		System.out.println("Edad: "+edad);
		System.out.println("Dni: "+dni);
		System.out.println("Domicilio: "+domicilio);
		
	}
	
	
}
