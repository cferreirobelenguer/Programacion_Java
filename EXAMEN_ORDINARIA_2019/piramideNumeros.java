

package examen_2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * Realizar un programa completo que solicite al usuario que introduzca dos números enteros
 * num1 y num2. Los números deben estar comprendidos entre 1 y 10 y ser num1 menor que num2, si esto
 * no se cumple se solicitará nuevos datos, también se debe tratar la excepción de la entrada de un 
 * valor entero con formato erróneo. Con estos datos se imprimirá una escalera numérica según el 
 * siguiente formato.
 * 
 * 
 */
public class piramideNumeros {
	
	/*
	 * Realizar un programa completo que solicite al usuario que introduzca dos números enteros num1 y num2
	 *Los números deben estar comprendidos entre 1 y 10 y ser num1 menor que num2, si esto no se cumple se 
	 *solicitará nuevos datos, también se debe tratar la excepción de la entrada de un valor entero con 
	 *formato erróneo. Con estos datos se imprimirá una escalera numérica según el siguiente formato:
	 *Números introducidos:
	 *1
	 *7
	 * 	1
		22
		333
		4444
		55555
		666666
		7777777
	 */
static Scanner sc=new Scanner(System.in);
	static boolean error=false;
	static boolean finalizado=false;
	public static void crear(int num1,int num2){
		//Función que crea la pirámide, el booleano dice cuando se ejecuta la función y se rompe el bucle de pedir números
		finalizado=true;
			for(int i=num1;i<=num2;i++) {
				for(int j=num1;j<=i;j++) {
					System.out.print(i);
				}
				System.out.println();
			}
	}
	
	public static void main(String[] args) {
		int num1;
		int num2;
		int contador=0;
		
		do {		
		try {
		
		System.out.println("Introduzca 1º Número: ");
		num1=sc.nextInt();
		System.out.println("Introduzca 2º Número: ");
		num2=sc.nextInt();
		//Se verifica que num1 no sea mayor que num2
		if(num1>=num2) {
			error=true;
			System.err.println("Error ,el 1º Número debe ser menor que el segundo");
			
		//Se verifica que num1 y num2 estén comprendidos entre 0 a 100
		}else if((num1<0)||(num2>100)) {
			error=true;
			System.err.println("Error ,los números deben de estar comprendidos entre 0 y 100");
			
		}else {
		//Si las condiciones se cumplen se ejecuta la pirámide con una función cogiendo los dos números de parámetro
			piramideNumeros.crear(num1, num2);
			if(finalizado) {
				break;
			}
		}
		
		}catch(InputMismatchException e) {
			//Se crea una excepción InputMismatchException de error de formato cuando no se introduce un número
			System.err.println("Error de formato de texto");
			//Si sale este error el bucle termina
			break;
			
			}
		//El bucle continúa hasta que no se introducen datos correctos o se ejecuta la excepción
		}while(contador<60);
	
	}
}
		

