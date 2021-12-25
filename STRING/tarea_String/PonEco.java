package ejerciciosstring;

import java.util.Scanner;

/*El método genera un String donde se debe repetir
 * el último carácter de la palabra
 * Ej.- Palabra="Hola", nveces=3
 * Resultado="Holaaaa" */
public class PonEco {
	static Scanner sc=new Scanner(System.in);
	
	public static String repetirveces(String palabra,int veces) {
		String msg="";
		//Se extrae el último dígito y se repite el número de veces que elige usuario
		String ultimoDigito=palabra.substring(palabra.length()-1,palabra.length());
		for(int i=0;i<veces;i++) {
			msg+=ultimoDigito;
		}
		//Se concatena
		palabra=palabra+msg;
		return palabra;
	}
	public static void main(String[] args) {
		System.out.println("Introduzca palabra");
		String palabra=sc.nextLine();
		System.out.println("Introduzca veces que quiere repetir el último dígito");
		int veces=sc.nextInt();
		System.out.println(PonEco.repetirveces(palabra,veces));
	}

}
