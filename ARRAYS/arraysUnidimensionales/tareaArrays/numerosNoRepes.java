package tarea_arrays;
import java.util.Scanner;

/*EJERCICIO 10
 * Leer 10 números y almacenar en una tabla sólo los valores distintos,
 *  es decir si un número es introducido varias veces sólo se almacena en la tabla una sola vez. 
 * El programa terminará cuando la tabla esté completa.
 */
public class numerosNoRepes {
	static Scanner sc = new Scanner(System.in);
	public static void anadir(int[]numeros) {
		int numero;
		boolean esta;
		
		for(int i=0;i<numeros.length;i++) {
			do {
				esta=false;
				numero=sc.nextInt();
				System.out.println("Posición "+i);
				for(int j=0;j<i;j++) {
					if(numero==numeros[j]) {
						esta=true;
						break;
					}
				}
				if(esta==true) {
					System.out.println("Ha introducido un valor repe");
				}
				
			}while(esta==true);
			numeros[i]=numero;
		}
		
	}
	
	public static void recorrer(int[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}

	public static void main(String[] args) {
		
		int numeros [] = new int [10];
		
		numerosNoRepes.anadir(numeros);
		numerosNoRepes.recorrer(numeros);

	}
}
