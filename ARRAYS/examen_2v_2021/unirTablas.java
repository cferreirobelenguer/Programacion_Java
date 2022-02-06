

import java.util.Arrays;

public class unirTablas {
/*
 * Realizar un método que reciba dos tabla de reales y devuelva una tabla
 *  unión de ambas.


static double [ ] unirTablas ( double t1[], double t2[])
Ej-
t1 → { 0.2 ,10.5 ,92.23 }
t2 → { 53.0, -23.3 }

unirTablas(t1,t2) → devolverá una nueva tabla  {  0.2, 10.5, 92.23, 53.0, -23.3}
 */
	public static void unir(double[] tabla1,double[] tabla2) {
		double []lista=new double[tabla1.length+tabla2.length];
		//Se crean dos contadores, uno para cada tabla
		int j=0;
		int k=0;
		for(int i=0;i<=lista.length-1;i++) {
			//El contador de la tabla 1 llega hasta el final de esa tabla, y se activa el contador de la tabla2
			if(j==tabla1.length) {
				lista[i]=tabla2[k];
				k++;
			}else {
				//En caso de que el contador de la tabla1 no llega hasta el final se sigue añadiendo datos de la tabla1
				lista[i]=tabla1[j];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(lista));
	}
	public static void main(String[] args) {
		
		double[]tabla1= {0.2,10.5,92.23};
		double[]tabla2= {53.0,-23.3};
		unirTablas.unir(tabla1, tabla2);
	}

}
