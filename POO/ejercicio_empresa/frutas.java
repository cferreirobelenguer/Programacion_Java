package ejercicio_metrica;

public class frutas extends productos{
	private String unidad;
	public frutas(String nombre, int precio, String unidad) {
		super(nombre,precio);
		this.unidad=unidad;
	}
	//Getter y Setter
	
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	//toString
	@Override
	public String toString() {
		return "Nombre= "+super.getNombre()+" Precio  $"+super.getPrecio()+", Unidad de venta=" + unidad + "";
	}
	

}
