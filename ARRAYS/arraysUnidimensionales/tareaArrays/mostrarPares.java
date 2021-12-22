package tarea_arrays;
/* 16.- Define dos tablas de 10 enteros Tabla1 y Tabla2,  
 * rellenar la primera tabla con 10 valores, copiar en Tabla2 
 * los elementos de tabla1 que sean pares y mostrar los elementos 
 * almacenados en tabla2.    
 * Por ejemplo si  se han copiado 5 elementos sólo se deben mostrar 
 * esos 5.*/
public class mostrarPares {
	static int contadorPares;
	public static void longitudPares(int[]numeros) {
		//Función que calcula la longitud del nuevo array de pares
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				contadorPares++;
			}
		}
	}
	public static void almacenarPares(int[]numeros,int[]pares) {
		//Se almacenan los números pares
		int j=0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				pares[j]=numeros[i];
				j++;
			}
		}
	}
	public static void recorrerPares(int[]pares) {
		//Se muestran los pares
		for(int i=0;i<pares.length;i++) {
			System.out.println(pares[i]);
		}
	}
	public static void main(String[] args) {
		int[]numeros= {4,5,67,89,45,23,22,44,78,100};
		mostrarPares.longitudPares(numeros);
		//Se crea array de pares con longitud de pares
		int[]pares=new int[contadorPares];
		mostrarPares.almacenarPares(numeros, pares);
		mostrarPares.recorrerPares(pares);

	}

}
