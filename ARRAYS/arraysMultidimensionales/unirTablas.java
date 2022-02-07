

package ejercicio_tienda;

import java.util.Arrays;

public class unirTablas {
/*
 * Realizar un método que reciba dos tablas de reales y devuelva una tabla unión de ambas
 * 
 * static float[] unirTablas (float t1[], float  t2[])
 * Ej.
 * 
 * tº->{0.2,10.5,92.23};
 * t2->{53.0,23.3};
 * [0.2, 10.5, 92.23, 53.0, 23.3]
 */
	public static void unir(double[]t1,double[]t2,double[]nuevo) {
		int j=0;
		int k=0;
		for(int i=0;i<nuevo.length;i++) {
			if(j==t1.length) {
				nuevo[i]=t2[k];
				k++;
			}else {
				nuevo[i]=t1[j];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(nuevo));
	}
	public static void main(String[] args) {
		
		double[] t1={0.2,10.5,92.23};
		double[] t2={53.0,23.3};
		int longitud=t1.length+t2.length;
		double[]nuevo=new double[longitud];
		unirTablas.unir(t1, t2, nuevo);
	}

}
