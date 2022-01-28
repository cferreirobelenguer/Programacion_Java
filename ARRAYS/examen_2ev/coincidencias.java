

package ejercicios_Arrays;
/*
 * Realizar un método  que reciba dos tablas 
 * y me devuelva cuantos valores tienen en común. 
 * Se supone que los valores no pueden estar repetidos 
 * en la misma tabla.

public static int enComun ( int ta[], int tb[]) {

Ejemplos:
enComun ({10,2,5,3,6} {3,5,10,7,14} ) → 3 elementos en común
enComun ({34,3,4,5,12} {8,4,2, 5}     ) → 2 elementos en común  

 */
public class coincidencias {
	public static int enComun ( int lista[], int lista2[]) {
		int contador = 0;
		//Se recorren las dos listas y se compara si hay coincidencias
		for(int i=0;i<lista.length;i++) {
			for(int j=0;j<lista2.length;j++) {
				if(lista[i]==lista2[j]) {
					//Se incrementa el contador si hay coincidencias
				contador++;
				System.out.println(lista[i]);
				
				}
			}
			
		}
		return contador;
	}
	public static void main(String[] args) {
		int[]lista={10,2,5,3,6};
		int[]lista2={3,5,10,7,14};
		System.out.println(coincidencias.enComun(lista, lista2));

	}

}
