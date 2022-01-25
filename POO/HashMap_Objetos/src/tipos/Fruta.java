package tipos;
import productos.*;

public class Fruta extends Productos {

	private String ud_venta;
	
	public Fruta (String nombre, int precio, String ud_venta) {
		
		super(nombre, precio);
		this.ud_venta = ud_venta;
		
	}
	
	public String toString() {
		
		return "Nombre: " + getNombre() + " /// Precio: " + "$" + getPrecio() + " /// Unidad de venta: " + getUd_venta();
	
	}
	
	public String getUd_venta() {
		return this.ud_venta;
	}
	
}
