

package ejercicio_tienda;
/* 
 * Elaborar un programa en Java algoritmo que lea números enteros hasta que el usuario introduzca
 * un valor igual a cero y calcule la media de los números pares y de los impares. El programa me
 * mostrará el número total de valores introducidos y cual de las dos medias tiene un valor mayor
 * la de los pares o la de los impares.
 */
import java.util.Scanner;

public class mediaParesImpares {
static Scanner sc=new Scanner (System.in);
	static double mediaPares=0;
	static int sumaPares=0;
	static double mediaImpares=0;
	static int sumaImpares=0;
	static int contador=0;
	public static void anadir() {
		int num;
		
		do {
			num=sc.nextInt();
			contador++;
			//El número 0 no se incluye en la suma y en el conteo de números
			if(num==0) {
				break;
			}else {
			if(num%2==0) {
				sumaPares=sumaPares+num;
			}else {
				sumaImpares=sumaImpares+num;
				}
			}
			
		}while(num!=0);
		
		System.out.println("Número de valores introducidos: "+contador);
		mediaPares=sumaPares/contador;
		mediaImpares=sumaImpares/contador;
		
		System.out.println("Media de números pares: "+mediaPares);
		System.out.println("Media de números impares: "+mediaImpares);
		if(mediaPares>mediaImpares) {
			System.out.println("La media de los números pares es mayor");
		}else {
			System.out.println("La media de los números impares es mayor");
		}
	}
	public static void main(String[] args) {
		
		mediaParesImpares.anadir();
	}

}
