package tipos;
import productos.*;

public class Higiene extends Productos {

	private int contenido;
	
	public Higiene (String nombre, int precio, int contenido) {
		
		super(nombre, precio);
		this.contenido = contenido;
		
	}
	
	public String toString() {
		
		return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + "ml /// Precio: " + "$" + getPrecio(); 
	
	}
	
	public int getContenido() {
		return this.contenido;
	}
	
}