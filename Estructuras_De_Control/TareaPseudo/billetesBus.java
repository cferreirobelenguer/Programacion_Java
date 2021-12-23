package ejerciciosPseudocodigo;

import java.util.Scanner;

/*Elaborar un programa que muestre el precio de un billete de autobús,
 *  que se calcula en base a los kilómetros de trayecto ( 0.30 Euros por Km ),
 *   pero si el recorrido supera los 80 Km se aplica un 15 % de descuento y 
 *   que si el trayecto se realiza en día laborable (‘L’) hay un 5 % de 
 *   descuento respecto si es día festivo (‘F’). 
 * Datos a introducir: kilómetros de recorrido y tipo de día. */
public class billetesBus {
	static Scanner sc=new Scanner (System.in);
	static int km=0;
	static String dia="";
	static int preciosindto=0;
	static int preciodtokm;
	static double dtorecorridos;
	static double dtodias;
	static int total;
	public static void calcularBillete() {
		
		System.out.println("Introduce el número de km realizados");
		km=sc.nextInt();
		preciosindto=(int) (km*0.30);
		//Se calcula descuento por km realizados al superar los 80km
		if(km>80) {
			System.out.println("Tiene un descuento del 15% por superar los 80 km recorridos");
			dtorecorridos=preciosindto*0.15;
			preciodtokm=(int) (preciosindto-dtorecorridos);
		}else{
			preciodtokm=preciosindto;
		}
		billetesBus.calculardia();
		
	}
	public static void calculardia() {
		//Se calcula descuentos en función de laboral o festivo
		System.out.println("Elija el tipo de día laboral o festivo, introducir [L o F]");
		dia=sc.next();
		
		switch(dia) {
		case "L":
			System.out.println("Tiene un descuento del 5%");
			dtodias=preciodtokm*0.05;
			total=(int) (preciodtokm-dtodias);
			System.out.println("TOTAL: "+total+"€");
			break;
		case "F":
			System.out.println("No se aplica descuento en festivos");
			total=(int) preciodtokm;
			System.out.println("TOTAL: "+total+"€");
			break;
		default:
			System.out.println("No se aplica ningún descuento por día ya que el dato introducido no existe");
			total=(int) preciodtokm;
			System.out.println("TOTAL: "+total+"€");
		}
	}
	public static void main(String[] args) {
		
		billetesBus.calcularBillete();
	}

}
