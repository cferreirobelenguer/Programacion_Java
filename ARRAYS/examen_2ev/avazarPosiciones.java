
package ejercicios_Arrays;
/*
 * Realizar un método que permita añadir al principio del array un valor, desplazando previamente todos los valores del array, perdiéndose el valor último.

public static void  añadirValor ( int tabla[], int valor)

Ejemplo:
tabla → { 10,34,3,5 }
valor → 74
La tabla después de ejecutar este método  {74, 10, 35, 3 }  El valor 5 se habría perdido.

 */
import java.util.*;
public class avazarPosiciones {
	static Scanner sc=new Scanner(System.in);
	public static void  añadirValor ( int tabla[], int valor) {
		//Se avanza de posiciones
		//Se descuenta una posición del inicio que es la que tiene el valor
		//Y se avanza de posición desde el final
		for(int j=tabla.length-2;j<=0;j++) {
			tabla[j+1]=tabla[j];
		}
		//Se añade el valor a la primera posición
		for(int i=0;i<tabla.length;i++) {
			int valor_;
			if(i==0) {
				valor_=tabla[i];
				tabla[i]=valor;
			}
		}
		
	}
	public static void recorrer(int tabla[]) {
		for(int i=0;i<tabla.length;i++) {
			System.out.println(tabla[i]);
		}
	}
	public static void main(String[] args) {
		int tabla[]={10,34,3,5 };
		System.out.println("Introduce un valor para añadir en la primera posición");
		int valor=sc.nextInt();
		ejerciciosArrays3.añadirValor(tabla, valor);
		ejerciciosArrays3.recorrer(tabla);
		
		
	}

}
