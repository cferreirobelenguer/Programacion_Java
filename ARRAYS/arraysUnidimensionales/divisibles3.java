//PREGUNTA EXAMEN 2021
package ejercicios_Arrays;

import java.util.Scanner;

/*Leer un serie de números hasta que el usuario introduzca un 0.
 *Mostrar a continuación los números
divisibles entre 3 que se han almacenado. 
Como máximo podremos almacenar un máximo de 10 números
divisibles entre 3. Pista: utilizar un array tamaño 10. */
public class divisibles3 {
	static Scanner sc=new Scanner(System.in);
	static int contadorImpares;
	public static void crearArray(int[]numeros) {
		System.out.println("Introducir números y terminar con el valor 0: ");
		//Rellenamos el array
		int contador=0;
		int numero=0;

		
		do {
		for(int i=0;i<numeros.length;i++) {
			numero=sc.nextInt();
			if(numero==0) {
				break;
			}else {
				if(numero%3==0) {
					contadorImpares++;
				}
				numeros[i]=numero;
				contador++;
				}
			}
		
		}while(numero!=0);
		
		
		System.out.println("Valores introducidos: ");
		for(int j=0;j<numeros.length;j++) {
			System.out.println(numeros[j]);
		}
		System.out.println("Números introducidos: "+contador);
	}
	public static void impares(int[]numeros) {
		int[]impares=new int[contadorImpares];
		int j=0;
		//Recorremos en búsqueda de impares
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]%3==0) {
				
				impares[j]=numeros[i];
				j++;
				
			}
		}
		System.out.println("Números divisibles entre 3 introducidos: "+contadorImpares);
		System.out.println("Valores: ");
		for(int k=0;k<impares.length;k++) {
			System.out.println(impares[k]);
		}
	}
	
	public static void main(String[] args) {
		int[]numeros=new int[10];
		divisibles3.crearArray(numeros);
		divisibles3.impares(numeros);
		

	}

}
