
/* Realizar un programa en Java que lea las 31 temperaturas medias de cada
 * uno de los días del mes de enero. El programa tiene que informar:
 * a)Cual ha sido la temperatura mínima y en qué día del mes
 * b)Cual ha sido la temperatura máxima y en qué día del mes
 * c) Cuántos días la temperatura media ha sido inferior a 0
 * e)Indicar si se ha producido una filomena, para ello se debe de haber
 * producido por lo menos 5 días consecutivos con temperaturas medias
 * inferiores a 0 grados.
 */
package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class temperaturas {
	static Scanner sc=new Scanner(System.in);
	static int contadorMenos=0;
	static int max=0;
	static int min=0;
	static int contadorFilomena=0;
	public static void tempeMax(int temperatura) {
		//Calcula la temperatura máxima
		if(temperatura>max) {
			max=temperatura;
		}
	}
	public static void tempeMin(int temperatura) {
		//Calcula la temperatura mínima
		if(temperatura<min) {
			min=temperatura;
		}
		
	}
	public static void temperaturaMenos0(int temperatura) {
		//Cuenta temperaturas inferiores a 0
		if (temperatura<0) {
			contadorMenos++;
		}
	}
	
	public static void main(String[] args) {
		int dias=0;
		int temperatura=0;
		
		while(dias!=31) {
			
			System.out.println("Introduzca tempetarura:");
			temperatura=sc.nextInt();
			dias++;
			temperaturas.temperaturaMenos0(temperatura);
			temperaturas.tempeMax(temperatura);
			temperaturas.tempeMin(temperatura);
			
		}
		System.out.println("Número de temperaturas inferiores a 0: "+contadorMenos);
		System.out.println("Temperatura máxima: "+max);
		System.out.println("Temperatura mínima: "+min);
	}

}
