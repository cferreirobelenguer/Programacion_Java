
package ordenarAviones;

public class aviones implements Comparable <aviones>{

	
	//Atributos privados
	private String modelo;
	private int velocidad;
	private int nAsientos;
	//Función constructora
	public aviones(String modelo,int nAsientos,int velocidad) {
		this.modelo=modelo;
		this.velocidad=velocidad;
		this.nAsientos=nAsientos;
	}
	//Getter y Setter
	public String getModelo() {
		return modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getnAsientos() {
		return nAsientos;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void setnAsientos(int nAsientos) {
		this.nAsientos = nAsientos;
	}
	//Método para comparar aviones y ordenar ArrayList de mayor a menor velocidad
	//Source /Delegate Methods NO OLVIDAR PONER IMPLEMENTS COMPARABLE EN LA CLASE
	public int compareTo(aviones o) {
		if(this.velocidad>o.velocidad) {
			return 1;
		}else if(this.velocidad<o.velocidad){
			return -1;
		}else {
			return 0;
		}
	}
	//Método toString
	@Override
	public String toString() {
		return "Aviones [Modelo=" + modelo + ", Velocidad=" + velocidad + ", Número de asientos=" + nAsientos + "]";
	}

	

}
