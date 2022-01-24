

package ejercicio_empresa;

public class Bebidas extends Productos{
	//Atributos privados pertenecientes a la clase Bebidas
	
	private double litros;
	
	public Bebidas(String nombre, double litros,int precio) {
		//Constructor con parámetros
		//Hereda el atributo nombre de Productos
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
		return " ///Nombre: "+getNombre()+" /// Precio: $" + getPrecio()+"/// Litros:" + litros  + " ";
	}
	
}
