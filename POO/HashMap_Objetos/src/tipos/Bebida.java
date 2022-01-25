package tipos;
import productos.*;

public class Bebida extends Productos {

	private double litros;
	
	public Bebida (String nombre, int precio, double litros) {
		
		super(nombre, precio);
		this.litros = litros;
		
	}
	
	public String toString() {
		
		return "Nombre: " + getNombre() + " /// Litros: " + getLitros() + " /// Precio: " + "$" + getPrecio(); 
	
	}
	
	public double getLitros() {
		return this.litros;
	}
	
}
