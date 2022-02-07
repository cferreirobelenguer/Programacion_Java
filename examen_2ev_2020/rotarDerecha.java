

package examen_2ev;

import java.util.Arrays;
import java.util.Scanner;

public class rotarDerecha {
/*
 * Desplaza todos los elementos de la tabla el número de posiciones que se indique a la derecha, colocando 
los que se salen por la izquierda. Si la tabla tiene menos de 2 elementos el método no hará nada
Ej.- Si tabla = {1,2,3,4,5} y llamo a rotarDcha(tabla,2) , tabla se quedaría con el valor {4,5,1,2,3}
 */
	static Scanner sc=new Scanner(System.in);
	
	public static void desplazar(int[]lista,int num) {
		for(int i=1;i<=num;i++) {
			int aux=lista[lista.length-1];
			for(int j=lista.length-2;j>=0;j--) {
				lista[j+1]=lista[j];
			}
			lista[0]=aux;
		}
		System.out.println(Arrays.toString(lista));
	}
	public static void main(String[] args) {
		int[]lista={1,2,3,4,5};
		System.out.println("Introduce un número");
		int num=0;
		do {
			num=sc.nextInt();
		}while((num<0)&&(num>lista.length));
		rotarDerecha.desplazar(lista,num);
		

	}

}
