

package examen_ord;

public class Bicicleta {
	//Se puede implementar porque se crean objetos de esta clase  en PruebaBicis
	//Declaración de atributos
	private int cod_bici;
	private int velocidad=0;
	private float precio;
	private String modelo;
	
	//Constructor
	public Bicicleta(int cod_bici, float precio, String modelo) {
		this.cod_bici=cod_bici;
		this.precio=precio;
		this.modelo=modelo;
	}


	public int getCod_bici() {
		return cod_bici;
	}

	public void setCod_bici(int cod_bici) {
		this.cod_bici = cod_bici;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//toString
	@Override
	public String toString() {
		return "Datos de bicicleta [Código=" + cod_bici + ", Velocidad=" + velocidad + ", Precio=" + precio + ", Modelo="
				+ modelo + "]";
	}
	//Función que recibe como parámetro una velocidad y aumenta su velocidad a esa
	public void pedalear(int velocidad_) {
		this.velocidad=velocidad_;
	}

	
	
	
}
