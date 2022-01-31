
package ejercicio_metrica;

public class bebidas extends productos {
	private double litros;
	public bebidas(String nombre, double litros, int precio) {
		super(nombre,precio);
		this.litros=litros;
	}
	//Getter y Setter

	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	//toString
	@Override
	public String toString() {
		return "Nombre= "+super.getNombre()+" Precio  $"+super.getPrecio()+" , Litros=" + litros + "ml ";
	}
	

}
