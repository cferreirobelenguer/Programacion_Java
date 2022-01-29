
package cargoJefes;

abstract public class Persona {
	//Atributo de la superclase
	private String nombre;
	public Persona(String nombre) {
		//Constructor
		this.nombre=nombre;
	}
	//Método abstracto que va a heredar de las subclases 
	public abstract String getDescription();
	
	//Getter y setter
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
}
