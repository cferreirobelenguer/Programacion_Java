
package examen2017_;
import java.util.*;
/*3.- Realizar un programa que lea valores
 *  entre 0 y 9 que representan los dígitos
 *   de un número entero ( unidades, decenas,
 *    centenas y unidades de millar...)   
 *    mostrar a continuación el valor introducido.
 *     Pista: Multiplicar por 10
Ej -   
 Introduzca dígitos hasta pulsar -1
> 0
> 0
> 1
> 5
> -1
El programa mostrará: 5100
 */
public class leerDigito {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca dígitos: ");
		int digito;
		int numero=0;
		int potencia=1;
		do {
			digito=sc.nextInt();
			if(digito!=-1) {
				numero=numero+digito*potencia;
				//Avanzamos de decimal
				potencia=potencia*10;
				//System.out.println(digito);
			}
			
		}while(digito!=-1);
		System.out.println(numero);
	}

}
