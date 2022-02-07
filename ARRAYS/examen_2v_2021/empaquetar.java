

import java.util.Arrays;

public class empaquetar {
/*
 * Realizar un método que procese una tabla y ponga todos los valores igual a 0
al final de la tabla, para que no existan valores intermedios con el valor 0.

static void empaquetar( int tabla[] )

Ej.- 
mitabla →   {10, 3,  0, 1, 4,  0, 0, 9, 32, 0}
empaquetar ( mitabla)
mitabla  → { 10, 3, 32, 1, 4,  9, 0, 0, 0 , 0}
Nota: Da igual que los números queden desordenados, NO SE DEBE UTILIZAR UNA tabla auxiliar.

 */
	public static void cambiar(int[]lista) {
		boolean hayceros;
		do {
		hayceros = false;
		for(int i=0;i<lista.length-1;i++) {
			//Si el valor de la posición es 0 y el siguiente no es 0 , se invierten los valores
			//el actual coge el valor del siguiente y el siguiente el valor 0
			if((lista[i]==0)&&(lista[i+1]!=0)) {
				lista[i]=lista[i+1];
				lista[i+1]=0;
				hayceros=true;
			}
			
			}
		}while(hayceros==true);
		
		System.out.println(Arrays.toString(lista));
	}
	
	public static void main(String[] args) {
		int[] lista={10, 3,  0, 1, 4,  0, 0, 9, 32, 5};
		empaquetar.cambiar(lista);
	}

}
