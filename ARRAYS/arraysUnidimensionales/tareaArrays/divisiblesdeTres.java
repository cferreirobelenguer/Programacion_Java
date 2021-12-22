package tarea_arrays;

import java.util.Scanner;

/* 19.- Leer un serie de números hasta que el usuario introduzca un 0.
 *  Mostrar a continuación los número divisibles entre 3 que se han 
 *  almacenado. Como máximo podremos almacenar un máximo de 10 números 
 *  divisibles entre 3 (Capacidad de la tabla).

Introducir números y terminar con el valor 0:
7 21 9 25 13 30 2 1 24 0
Números introducidos:10
Números divisibles entre 3: 4
Valores:
21 ,9 ,30 ,24
*/
public class divisiblesdeTres {
	static Scanner sc=new Scanner(System.in);
	static int contador=0;
	static int contadorimpares=0;
	
	public static void rellenar(int[]numeros) {
		// Se rellena un array con todos los números hasta 0
		int numero = 0;
				
		do {
			for(int i=0;i<numeros.length;i++) {
				numero=sc.nextInt();
				if(numero==0) {
					break;
				}else {
					numeros[i]=numero;
				}
			}
		}while(numero!=0);	
	}
	
	public static void crearImpar(int[]numeros,int[]impares) {
		//Se almacena en otro array los divisibles de 3
		int j=0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]%3==0) {
				impares[j]=numeros[i];
				j++;
				contadorimpares++;
				contador++;
			}
		}
	}
	public static void recorrer(int[]impares) {
		//Recorre impares y muestra los contadores
		String mensaje="";
		System.out.println("Números introducidos "+contador);
		System.out.println("Números divisibles entre 3 "+contadorimpares);
		
		for(int i=0;i<impares.length;i++) {
			mensaje+=impares[i]+",";
		}
		System.out.println("Valores:\n"+mensaje);
	}
	public static void main(String[] args) {
		int[]numeros=new int[10];
		int[]impares=new int[10];
		divisiblesdeTres.rellenar(numeros);
		divisiblesdeTres.crearImpar(numeros,impares);
		divisiblesdeTres.recorrer(impares);
		
	}

}
