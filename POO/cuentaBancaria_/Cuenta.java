
package cuentaBancaria_;
import java.util.*;
public class Cuenta {
	static Scanner sc=new Scanner(System.in);
	
	//Atributos
	private String titular;
	private double cantidad;
	
	//Constructor con titular obligatorio
	public Cuenta(String titular) {
		// Constructor
		this(titular, 0); //Sobrecarga
	}
	//Constructor con titular y cantidad obligatorio
	public Cuenta(String titular,double cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
	}
	//Métodos getter y setter
	public String getTitular() {
		return titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingresar() {
		System.out.println("Introduce cantidad");
		Double cantidadNueva=sc.nextDouble();
		if((cantidad>0)&&(cantidadNueva>0)) {
			this.cantidad+=cantidadNueva;
		}else {
			System.out.println("No se puede realizar la operación");
		}
		
	}
	public void retirar() {
		System.out.println("Introduce cantidad");
		Double cantidadNueva=sc.nextDouble();
		if((cantidad>0)&&(cantidadNueva>0)) {
			this.cantidad-=cantidadNueva;
			
		}else {
			System.out.println("No se puede realizar la operación");
		}
		if(cantidad<0) {
			cantidad=0;
		}
		
	}
	//Método toString
		@Override
		public String toString() {
			return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
		}
	

}
