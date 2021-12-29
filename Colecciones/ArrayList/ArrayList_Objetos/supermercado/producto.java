
package supermercado;

public class producto {
	
	
	//Atributos
	private String producto;
	private int cantidad;
	private double precio;
	private double total;
	//Función constructora
	public producto(String producto,int cantidad,double precio,double total) {
		this.producto=producto;
		this.cantidad=cantidad;
		this.precio=precio;
		this.total=total;
	}
	//Getter y Setter
	public String getProducto() {
		return producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public double getTotal() {
		return total;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	//Función toString
	@Override
	public String toString() {
		return "*******Cantidad*****Precio******Total\n"+ producto + "     " + cantidad + "       " + precio + "€       " + total+"€";
	}
	
	
}
