package examen2017_;
import java.util.*;
/*3. Se necesita conocer una serie de datos de una empresa, para ello se introduce los 20 salarios de los empleados. Realizar un algoritmos que sea capaz de responder a las siguientes preguntas:

 ¿Cuantas personas ganan más de 3.000 Euros/mes?
 ¿Cuantas personas ganan entre  1.000 y 3.000 Euros/mes?
 ¿Cuantas personas ganan menos de 1.000 Euros/mes?
 */
public class salarios {
	static Scanner sc =new Scanner(System.in);
	public static void anadir(int[]salariosEmple) {
		System.out.println("Introduzca salarios de empleados: ");
		int contador=0;
		do {
			for(int i=0;i<salariosEmple.length;i++) {
				salariosEmple[i]=sc.nextInt();
				contador++;
			}
		}while(contador!=20);
	}
	public static void calcular(int[]salariosEmple) {
		int contadorMas=0;
		int contadorEntre=0;
		int contadorMenos=0;
		for(int i=0;i<salariosEmple.length;i++) {
			if(salariosEmple[i]>3000) {
				contadorMas++;
			}else if((salariosEmple[i]>=1000)&&(salariosEmple[i]<=3000)) {
				contadorEntre++;
			}else if(salariosEmple[i]<1000) {
				contadorMenos++;
			}
		}
		System.out.println("Personas que ganan más de 3000 €: "+contadorMas);
		System.out.println("Personas que ganan entre 100 y 3000 €: "+contadorEntre);
		System.out.println("Personas que ganan menos de 1000 €: "+contadorMenos);
	}
	public static void main(String[] args) {
		int[]salariosEmple=new int[20];
		salarios.anadir(salariosEmple);
		salarios.calcular(salariosEmple);
	}

}
