package productos;

public class Productos implements Comparable<Productos> {

	private String nombre;
	private int precio;
	
	public Productos (String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int compareTo (Productos p) {
		
		int res = 0;
		
		if (this.precio > p.precio) {
			res = -1;
		}
		else if (this.precio < p.precio) {
			res = 1;
		}
		
		return res;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
}
