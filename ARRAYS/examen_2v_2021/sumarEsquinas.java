


public class sumarEsquinas {
/*
 * Realizar un método que reciba una matriz de enteros y me calcule la suma de las esquinas.  
 * Se supone que todas las filas son del mismo tamaño y que por lo menos tiene dos filas ( 1 Punto) 

static int  sumarEsquinas ( int matriz[][] )


Ejemplo 
Si matriz tiene el valor de la figura
 El resultado a devolver sería 3 + 10 + 1 + 6 = 20

 3 4 6 10
 2 1 1 12
 1 2 4  6

 */
	public static void sumar(int[][]lista) {
		int suma=0;
		System.out.print(lista[0][0]+"+");
		System.out.print(lista[0][lista.length]+"+");
		System.out.print(lista[lista.length-1][0]+"+");
		System.out.print(lista[lista.length-1][lista.length]+"= ");
		suma=lista[0][0]+lista[0][lista.length]+lista[lista.length-1][0]+lista[lista.length-1][lista.length];
		System.out.print(suma);
	}
	public static void main(String[] args) {
		
		int[][]lista={ 
				{3,4,6,10},
				{2,1,1,12}, 
				{1,2,4,6}};
	sumarEsquinas.sumar(lista);

	}
}
