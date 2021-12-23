package ejerciciosPseudocodigo;

import java.util.Scanner;


public class ejerciciospseudo {
	static Scanner sc=new Scanner (System.in);
	
	public static void sumar() {
		//Sumar dos números y mostrar resultado
		int numero1=3;
		int numero2=4;
		int suma=numero1+numero2;
		System.out.println(suma);
	}
	public static void indicarMayor() {
		//Indicar cuál es el mayor de dos números
		int numero2=4;
		int numero1=5;
		if(numero2>numero1) {
			System.out.println(numero2+" es el mayor");
		}else {
			System.out.println(numero1+" es el mayor");
		}
	}
	public static void indicarMayorMenor() {
		//Indicar cuál es el mayor y cuál es el menor de tres números que introduce usuario
		//Lógica con arrays
		int[]numeros=new int [3];
		int contador=0;
		System.out.println("Introduce números: ");
		do {
			for(int i=0;i<numeros.length;i++) {
				numeros[i]=sc.nextInt();
				contador++;
			}
		}while(contador!=3);
		
		int max, min;
		max=min=numeros[0];

		for (int i=0;i<numeros.length;i++) {    
		        if(numeros[i]>max){
		            max=numeros[i];
		        }
		        if(numeros[i]<min){
		            min=numeros[i];
		        }     
		}
		System.out.println("Máximo: "+max);
		System.out.println("Mínimo: "+min);
	}
	public static void operaciones() {
		//Usuario introduce dos números, selecciona operación y se calcula la operación
		int suma=0;
		int resta=0;
		double divi=0;
		double multi=0;
		int resto=0;
		System.out.println("Introduzca un número");
		int numero1=sc.nextInt();
		System.out.println("Introduzca otro número");
		int numero2=sc.nextInt();
		System.out.println("Introduzca una operación (+-*/%)");
		String opcion=sc.next();
		switch(opcion) {
		case "+":
			suma=numero1+numero2;
			System.out.println("Ha seleccionado suma, el resultado es "+suma);
			break;
		case "-":
			resta=numero1-numero2;
			System.out.println("Ha seleccionado resta, el resultado es "+resta);
			break;
		case "*":
			multi=numero1*numero2;
			System.out.println("Ha seleccionado multiplicación, el resultado es "+multi);
			break;
		case "/":
			divi=numero1/numero2;
			System.out.println("Ha seleccionado división, el resultado de la división es "+divi);
			break;
		case "%":
			resto=numero1%numero2;
			System.out.println("Ha seleccionado resto, el resultado del resto es "+resto);
			break;
		default:
			System.out.println("La opción seleccionada no se encuentra");
		}
	}
	public static void calcularMedia() {
		//Introducir 4 números y calcular la media
		System.out.println("Introduzca números");
		int[]numeros=new int[4];
		int contador=0;
		int suma=0;
		double media=0;
		do {
			for(int i=0;i<numeros.length;i++) {
				numeros[i]=sc.nextInt();
				contador++;
			}
			
		}while(contador!=4);
		int longitud=numeros.length;
		for(int j=0;j<numeros.length;j++) {
			suma+=numeros[j];
		}
		media=suma/longitud;
		System.out.println("La media de los números es: "+media);
		
	}
	public static void procesando() {
		/* Muestre el mensaje “procesando datos... 
		 * desea continuar (s/n)”, si el usuario introduce ‘S’, 
		 * se repite el mensaje 
		 * y si dice ‘N’ muestra el mensaje adiós y termina.*/
		String confirmar="";
		do {
			System.out.println("Procesando datos, pulse (S o N)");
			confirmar=sc.next();
			if((confirmar.equals("S"))||(confirmar.equals("s"))) {
				System.out.println("Opción equivocada");
			}
			if((confirmar.equals("N"))||(confirmar.equals("n"))) {
				System.out.println("Adiós");
				break;
			}
			
		}while((!confirmar.equals("N"))||(!confirmar.equals("n")));
	}
	public static int sumaPares() {
		//Números del 1 al 30, sumar los pares
		int suma=0;
		for(int i=1;i<=30;i++) {
			if(i%2==0) {
				suma+=i;
			}
		}
		return suma;
	}
	public static void comprobarNumero() {
		/*Un programa que lea un número, 
		 * que compruebe que está comprendido entre 10 y 100, 
		 * que lo muestre por pantalla o que lo vuelva a leer 
		 * en el caso que no cumpla la condición. */
		int numero=0;
		do {
			System.out.println("Introduzca número");
			numero=sc.nextInt();
		}while((numero<0)||(numero>100));
		System.out.println("El número que ha seleccionado es mayor que 0 y menor que 100");
	}
	public static double mediaSuma() {
		/*Un programa que lea un valor N, que indica cuantos números va a leer,
		 *  lea los N números y calcule la suma y la media. */
		int longitud=0;
		int contador=0;
		int suma=0;
		double media=0;
		System.out.println("Indique cuántos números va a leer");
		longitud=sc.nextInt();
		int[]numeros=new int[longitud];
		do {
			for(int i=0;i<numeros.length;i++) {
				numeros[i]=sc.nextInt();
				contador++;
			}
		}while(contador!=longitud);
		for(int j=0;j<numeros.length;j++) {
			suma+=numeros[j];
		}
		media=suma/longitud;
		return media;
	}
	public static void maxminNumeros() {
		//Leer 200 números y decir el máximo y mínimo
		int[]numeros=new int[5];
		int contador=0;
		System.out.println("Introduzca números");
		do {
			for(int i=0;i<numeros.length;i++) {
				numeros[i]=sc.nextInt();
				contador++;
			}
		}while(contador!=5);
		int max, min;
		max=min=numeros[0];

		for (int i=0;i<numeros.length;i++) {    
		        if(numeros[i]>max){
		            max=numeros[i];
		        }
		        if(numeros[i]<min){
		            min=numeros[i];
		        }     
		}
		System.out.println("Máximo: "+max);
		System.out.println("Mínimo: "+min);
	}
	public static double numeroshastacero() {
		/* Un programa que lea números, los vaya sumando 
		 * hasta que el usuario introduzca el número 0,
		 *  entonces muestra la suma total y la media.*/
		int numero;
		int suma=0;
		double media=0;
		int contador=0;
		do {
			numero=sc.nextInt();
			suma+=numero;
			contador++;
		}while(numero!=0);
		media=suma/contador;
		return media;
	}
	
	public static void main(String[] args) {
		System.out.println("EJERCICIO 1:");
		ejerciciospseudo.sumar();
		System.out.println("EJERCICIO 2:");
		ejerciciospseudo.indicarMayor();
		System.out.println("EJERCICIO 3:");
		ejerciciospseudo.indicarMayorMenor();
		System.out.println("EJERCICIO 4:");
		ejerciciospseudo.operaciones();
		System.out.println("EJERCICIO 5:");
		ejerciciospseudo.calcularMedia();
		System.out.println("EJERCICIO 6:");
		ejerciciospseudo.procesando();
		System.out.println("EJERCICIO 7:");
		ejerciciospseudo.comprobarNumero();
		System.out.println("EJERCICIO 8:");
		System.out.println("La media de los números introducidos es: "+ejerciciospseudo.mediaSuma());
		System.out.println("EJERCICIO 9:");
		System.out.println("La media de los números introducidos es: "+ejerciciospseudo.numeroshastacero());
		System.out.println("EJERCICIO 10:");
		ejerciciospseudo.maxminNumeros();
		System.out.println("EJERCICIO 11:");
		System.out.println("La suma de los pares es: "+ejerciciospseudo.sumaPares());
		
	
		}

	}
