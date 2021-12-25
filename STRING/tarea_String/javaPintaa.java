package ejerciciosstring;

import java.util.Scanner;

/* Realizar un programa completo que dibuje un número variable de
 * lineas de asteriscos en función de los argumentos que recibe desde el
 * sistema operativo.
 * Ej-
 * 
 * java pinta 10 2
 * **********  
 * **
 * 
 * 
 * */
public class javaPintaa {
	static Scanner sc=new Scanner(System.in);
	public static String concatenar(String[]array) {
		String msg="";
		for(int i=0;i<array.length;i++) {
			msg+=" "+array[i]+" ";
		}
		return msg;
	}
	public static void pintar(String[] array) {
		System.out.println("java pinta"+javaPintaa.concatenar(array));
		for(int i=0;i<array.length;i++) {
			int num=Integer.parseInt(array[i]);
			System.out.println(num);
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String[]array=new String[3];
		System.out.println("Introduzca un número");
		int contador=0;
		do {
			for(int i=0;i<array.length;i++) {
				
				array[i]=sc.nextLine();
				contador++;
				
			}
		}while(contador!=3);
		javaPintaa.pintar(array);
		
	}

}
