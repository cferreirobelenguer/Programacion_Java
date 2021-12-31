
package examen2017_;
import java.util.*;
/*1.- Leer tres número enteros y mostrar una flecha con guiones terminados con el carácter ‘>’ según el formato del ejemplo  con el valor de cada uno de los números. Hay que mostrar el valor y su representación en forma de flecha
Ej.-
El usuario introduce: 6,3,5
El programa mostrará
6 : ------>
3 : --->
5 : ----->
 */
public class numerosFlecha {
static Scanner sc=new Scanner(System.in);
	public static void anadir(int[]numeros) {
		
		int contador=0;
		System.out.println("Introduce tres números");
		do {
			for(int i=0;i<numeros.length;i++) {
				numeros[i]=sc.nextInt();
				contador++;
			}
		}while(contador!=numeros.length);
	}
	public static void imprimir(int[]numeros) {
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i]+":");
			for(int j=0;j<numeros[i];j++) {
				System.out.print("-");
			}
			System.out.print(">");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[]numeros=new int[3];
		numerosFlecha.anadir(numeros);
		numerosFlecha.imprimir(numeros);
	}

}
