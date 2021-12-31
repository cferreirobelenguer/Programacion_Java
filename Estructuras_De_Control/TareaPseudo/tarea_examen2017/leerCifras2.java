
package examen2017_;
import java.util.*;
/*2.- Leer un número entero y mostrar cada una de su cifras en distintas líneas. Pista: Dividir entre 10
El usuario introduce: 2305  
Ej.-
El programa mostrará
5
0
3
2
 */
public class leerCifras2 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca número");
		int numero=sc.nextInt();
		while(numero>0) {
			//ejemplo: 2545-2540==5
			int digito=numero-Math.round(numero/10)*10;
			System.out.println(digito);
			//Se avanza de posición hacia atrás
			numero=Math.round(numero/10);
		}
	}

}
