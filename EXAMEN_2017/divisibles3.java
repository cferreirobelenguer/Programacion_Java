
package examen_2020;
/*
 * Leer una serie de números hasta que el usuario introduzca un 0.
 *Mostrar a continuación los números divisibles entre 3 que se han almacenado.
 *Como máximo podremos almacenar un máximo de 10 números divisibles entre 3. Pista: utilizar un array tamaño 10
 */
import java.util.Scanner;

public class divisibles3 {
	static Scanner sc=new Scanner(System.in);
	
	public static void introducir(int[]lista) {
		int num = 0;
		int contador=0;
		int contadorImpares=0;
		
			do {
				
				for(int i=0;i<lista.length;i++) {
				num=sc.nextInt();
				if(num==0) {
					break;
				}else {
					if(num%3==0) {
						lista[i]=num;
					
						}
					}
				contador++;	
				}
				
				
				
			}while(num!=0);
	System.out.println("==========");
		for(int j=0;j<lista.length;j++) {
				if(lista[j]!=0) {
					contadorImpares++;
					System.out.println(lista[j]);
				}
				
		}
		System.out.println("==========");
		System.out.println("Números introducidos: "+contador);
		System.out.println("Números divisibles entre 3 introducidos: "+contadorImpares);
	}
	public static void main(String[] args) {
		int[]lista=new int[10];
		System.out.println("Introducir números y terminar con el valor 0: ");
		divisibles3.introducir(lista);

	}

}
