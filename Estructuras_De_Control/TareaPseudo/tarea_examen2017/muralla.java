package examen2017_;
import java.util.*;
/*2.- Leer un número entero y mostrar una muralla de  asteriscos
 *  con tantas almenas como indique el usuario. 
 *  Nota: una almena está formada dos filas de  cuatro 
 *  asterisco,
 *   y entre almena y almena hay un  espacio. 
 *  Ej.-
El usuario introduce: 3
El programa mostrará:

**** **** ****
**** **** ****
**************

El usuario introduce: 5
El programa mostrará:

**** **** **** **** ****
**** **** **** **** ****
************************
 */
public class muralla {
static Scanner sc=new Scanner(System.in);
	public static void dibujar(int numero) {
		for(int i=0;i<numero;i++) {
			System.out.print("**** ");
		}
		System.out.println();
		for(int j=0;j<numero;j++) {
			System.out.print("**** ");
		}
		System.out.println();
		for(int k=0;k<numero;k++) {
			System.out.print("*****");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Introduce un número");
		int numero=sc.nextInt();
		muralla.dibujar(numero);
	}

}
