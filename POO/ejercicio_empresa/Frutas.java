package ejercicio_empresa;

public class Frutas extends Productos{
	//Atributos de la clase Frutas
	
	private int unidadVenta;
	
	public Frutas(String nombre, int precio, int unidadVenta) {
		//Constructor con parámetros
		//Hereda el atributo nombre de Productos
		super(nombre,precio);
		
		this.unidadVenta=unidadVenta;
	}
	//Getter y Setter

	public int getUnidadVenta() {
		return unidadVenta;
	}

	public void setUnidadVenta(int unidadVenta) {
		this.unidadVenta = unidadVenta;
	}
	//toString

	@Override
	public String toString() {
		return " ///Nombre: "+getNombre()+" /// Precio: $" + getPrecio() + "/// Unidad de venta=" + unidadVenta + "kilo/s";
	}
	
}
