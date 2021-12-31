package examen2017_;
/*Realizar el pseudocódigo los siguientes ejercicios:
(2 Puntos)
1.- Realizar un programa  que permita introducir las 
estaturas (en cm) de los 40 alumnos de una clase, 
visualizar la mayor , la menor de ellas y la estatura media.
 */
import java.util.Scanner;

public class alumnosEstaturas {
	static Scanner sc=new Scanner(System.in);
	public static void anadir(int[]estaturas) {
		System.out.println("Introduce estaturas de alumnos: ");
		int contador=0;
		do {
			for(int i=0;i<estaturas.length;i++) {
				estaturas[i]=sc.nextInt();
				contador++;
			}
		}while(contador!=40);
	}
	public static void maxmin(int[]estaturas) {
		int suma=0;
		int max =estaturas[0],min=estaturas[0];
		for(int i=0;i<estaturas.length;i++) {
			if(estaturas[i]>max) {
				max=estaturas[i];
			}else if(estaturas[i]<min) {
				min=estaturas[i];
			}
			suma+=estaturas[i];
		}
		int media=suma/estaturas.length;
		System.out.println("Máximo: "+max);
		System.out.println("Mínimo: "+min);
		System.out.println("Media: "+media);
	}
	public static void main(String[] args) {
		int[]estaturas=new int[40];
		alumnosEstaturas.anadir(estaturas);
		alumnosEstaturas.maxmin(estaturas);

	}

}
