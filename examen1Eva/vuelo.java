

/*Realizar un programa en java que calcula el precio final
 * de un vuelo.
 * Para ellos se debe introducir 3 valores.
 * 1.Tarifa básica: Un número real.
 * 2. Día de la semana de vuelo: un caracter con los siguientes
 * valores posibles (L,M,X,J,V,S,D)
 * 3.Tipo de billete: normal o business  N o B
 * El cálculo se realizará con un incremento del 20% si es en finde,
 * un 15% si es viernes, y 200 euros más si es business. No se pueden introducir
 * datos erróneos sino salta mensaje.
 */

package examen;

import java.util.Scanner;

public class vuelo {
static double tarifaTotal=0;
static double precioBasico=300;
static Scanner sc=new Scanner(System.in);

	public static void tarifaFindes() {
		System.out.println("Ha elegido la tarifa de fin de semana");
		//Se incrementa 20% de la tarifa básica
		precioBasico=(precioBasico+(precioBasico*0.20));
		tarifaTotal=precioBasico;
		System.out.println("Precio de vuelo: "+precioBasico);
	}
	public static void tarifaViernes() {
		System.out.println("Ha elegido la tarifa de viernes");
		//Se incrementa 15% de la tarifa básica
		precioBasico=(precioBasico+(precioBasico*0.15));
		tarifaTotal=precioBasico;
		System.out.println("Precio de vuelo: "+precioBasico);
	}
	public static void tarifaBusiness() {
		System.out.println("Ha elegido la tarifa Business");
		System.out.println(precioBasico);
		//Tiene un plus de 200 €
		tarifaTotal=precioBasico+200;
		System.out.println("Precio de vuelo: "+tarifaTotal);
	}
	public static void main(String[] args) {
		
		System.out.println("Calcule su tarifa de vuelo:");
		System.out.println("Elija las iniciales de un día de la semana para calcular su tarifa:");
		char dia=sc.next().charAt(0);
		//Pasamos a minúscula en caso de escribirse en mayúscula
		dia=Character.toLowerCase(dia);
		System.out.println("Elija tipo de tarifa Normal N o Business B");
		char tarifa=sc.next().charAt(0);
		tarifa=Character.toLowerCase(tarifa);
		
		switch(dia) {
		case 'l':
			System.out.println("Ha elegido la tarifa de día de diario");
			tarifaTotal=precioBasico;
			System.out.println("Precio de vuelo: "+precioBasico);
			break;
		case 'm':
			System.out.println("Ha elegido la tarifa de día de diario");
			tarifaTotal=precioBasico;
			System.out.println("Precio de vuelo: "+precioBasico);
			break;
		case 'x':
			System.out.println("Ha elegido la tarifa de día de diario");
			tarifaTotal=precioBasico;
			System.out.println("Precio de vuelo: "+precioBasico);
			break;
		case 'j':
			System.out.println("Ha elegido la tarifa de día de diario");
			tarifaTotal=precioBasico;
			System.out.println("Precio de vuelo: "+precioBasico);
			break;
		case 'v':
			vuelo.tarifaViernes();
			break;
		case 's':
			vuelo.tarifaFindes();
			break;
		case 'd':
			vuelo.tarifaFindes();
			break;
		default:
			System.err.println("El dato introducido es erróneo, no podemos tramitar su solicitud");
		}
		
		switch(tarifa) {
		case 'n':
			System.out.println("Precio de vuelo: "+precioBasico);
			break;
		case 'b':
			vuelo.tarifaBusiness();
			break;
		default:
			System.err.println("El dato introducido es erróneo, no podemos tramitar su solicitud");
		}
		

	}

}


