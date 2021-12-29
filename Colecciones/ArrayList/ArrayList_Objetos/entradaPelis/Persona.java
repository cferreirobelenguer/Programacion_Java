
package entradaPelis;

public class Persona {

	//atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private double precio;
	//Función constructora
	public Persona(String nombre, String apellidos, int edad, double precio) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.precio=precio;
	}
	//Getter and Setter
	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	//ToString
	@Override
	public String toString() {
		return "Datos de usuario:\n Nombre=" + nombre + "\nApellidos=" + apellidos + "\nEdad=" + edad + "\nPrecio=" + precio
				+ "\n";
	}


}
