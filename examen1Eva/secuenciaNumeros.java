
/*Realizar un programa codificado en Java 
 * que escriba en consola la siguiente secuencia de
 * valores en función de un número introducido. Hay
 * que chequear que el número introducido esté entre 1 y 10
 * inclusive. Si no es así volverá a solicitar al usuario.
 * 
 * numero 3
 * 
 * 1-2-3
 * 1-2-3
 * 1-2-3
 */
package examen;
import java.util.Scanner;

public class dibujoNumeros {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce un número");
		int numero=sc.nextInt();
		
		for(int i=1;i<=numero;i++) {
			for(int j=1;j<=numero;j++) {
				if(j==numero){
					System.out.print(j);
				}else {
					System.out.print(j+"-");
				}
				
			}
			System.out.println();
		}

	}
}
