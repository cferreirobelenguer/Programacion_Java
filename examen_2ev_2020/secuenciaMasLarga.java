package examen_2ev;

public class secuenciaMasLarga {
/*
 * static int secuenciaMasLarga ( int numeros[] )
Devuelve la longitud de la secuencia más larga de números ordenados en orden creciente 
Ej- secuenciaMasLarga( { 6, 1, 2, 3 ,4 ,0 ,1 ,5 ,1 ,2 ,2 ,2 ,7 , 9, 2, 3} ) Devuelve 6 →
 secuenciaMasLarga( { 1, 1, 2, 3 ,6 ,0 ,1 ,5 ,1 ,2 ,7 ,1 ,3, 4, 2, 3, 3, 1} ) Devuelve 5
 */
	public static void pedirSecuencia(int[]secuencia) {
		int secuenciaMax=0;
		int secuenciaActual=0;
		for(int i=0;i<secuencia.length-1;i++) {
			if(secuencia[i]<=secuencia[i+1]) {
				secuenciaActual++;
				if(secuenciaActual>secuenciaMax) {
					secuenciaMax=secuenciaActual;
				}
			}
			else {
				secuenciaActual=1;
			}
		}
		System.out.println(secuenciaMax);
	}
	public static void main(String[] args) {
		int[]secuencia={ 6, 1, 2, 3 ,4 ,0 ,1 ,5 ,1 ,2 ,2 ,2 ,7 , 9, 2, 3};
		secuenciaMasLarga.pedirSecuencia(secuencia);
	}

}
