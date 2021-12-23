package ejerciciosPseudocodigo;

import java.util.Scanner;

/* Realizar un programa que muestre el valor de una factura 
 * telefónica sabiendo que cada paso consumido se cobra a 0.10 Euros 
 * y que cuando se consumen más de 1000 pasos se aplica un descuento 
 * del 18 % sobre el total de la factura. 
 * El número de pasos consumidos se solicita al usuario.
 *  Hay que chequear que este valor siempre es mayor que 0.*/
public class factura {
	static Scanner sc=new Scanner (System.in);
	static int pasos;
	static int total;
	static double consumo;
	public static void calcularFactura() {
		//Se verifica que pasos es distinto de 0
		do {
		System.out.println("Indique el número de pasos consumidos");
		pasos=sc.nextInt();
		System.out.println("PASOS: "+pasos);
		}while(pasos==0);
		consumo=pasos*0.10;
		factura.calculardto();
		System.out.println("TOTAL: "+total+"€");
	}
	public static void calculardto() {
		if(pasos>1000) {
			System.out.println("DTO: 0.18%");
			double descuento=consumo*0.18;
			total=(int) (consumo-descuento);
		}else {
			System.out.println("NO HAY DTO");
			total=(int)consumo;
		}
	}
	public static void main(String[] args) {
		System.out.println("FACTURA TELEFÓNICA:");
		factura.calcularFactura();
		
		
	}

}
