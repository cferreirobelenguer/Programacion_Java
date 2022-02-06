

import java.util.Scanner;

public class hacerEco {
	static Scanner sc=new Scanner(System.in);
/*
 *  static String hacerEco (  String cadena, int veces )

Devuelve un String a partir de la cadena parámetro con el mismo contenido pero repitiendo 
 el último carácter el número de veces que se indique. Si la cadena está vacía, no se añadirá ningún carácter.

Ejemplos
               	hacerEco("Hola Pepe",4) →   "Hola Pepeeeee"
	   			hacerEco("",3)          → ""

 */
	public static String imprimir(String cadena,int veces) {
		String nuevo="";
		String veces2="";
		for(int i=0;i<veces;i++) {
			String caracter=String.valueOf(cadena.charAt(cadena.length()-1));
			veces2+=caracter;
		}
		nuevo=cadena+veces2;
		
		
		return nuevo;
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce una cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce el número de veces que quieres que se repita la cadena");
		int veces=sc.nextInt();
		System.out.println(hacerEco.imprimir(cadena, veces));

	}

}
