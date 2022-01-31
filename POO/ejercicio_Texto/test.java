

package ejercicio_Texto;

import java.util.Scanner;
public class test {
	
	public static final boolean cambio = false;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Texto palabra=new Texto(25);
		System.out.println("Menú de palabras: ");
		int opcion=0;
		int contador=0;
		System.out.println("Por favor Elija una opción:");
		System.out.println("1. Añadir una palabra al inicio de la palabra");
		System.out.println("2. Añadir una palabra al final de la palabra");
		System.out.println("3. Añadir un caracter al inicio de la palabra");
		System.out.println("4. Añadir un caracter al final de la palabra");
		System.out.println("5. Contar vocales");
		System.out.println("6. Mostrar resultados");
		
		
		while(contador!=10) {
			opcion=sc.nextInt();
			switch(opcion){
			case 1:
				System.out.println("Introduce palabra a añadir");
				String palabra1=sc.next();
				palabra.anadirInicio(palabra1);
				contador++;
			
			break;
			case 2:
				System.out.println("Introduce palabra a añadir");
				String palabra2=sc.next();
				palabra.anadirFinal(palabra2);
				contador++;
			break;
			case 3:
				System.out.println("Introduce un caracter a añadir");
				char caracter3=sc.next().charAt(0);
				palabra.anadirInicioChar(caracter3);
				contador++;
			break;
			case 4:
				System.out.println("Introduce un caracter a añadir");
				char caracter4=sc.next().charAt(0);
				palabra.anadirFinalChar(caracter4);
				contador++;
			break;
			case 5:
				palabra.contarVocales();
			break;
			case 6:
				System.out.println("=============");
				System.out.println(palabra.toString());
				System.out.println("=============");
			break;
			default:
				System.out.println("La opción elegida no es correcta");
			}
		}

	}

}
