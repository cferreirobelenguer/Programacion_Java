
package examen2017_;
import java.util.*;
/*4.- Mostrar el siguiente menú que se repetirá hasta que usuario seleccione  la opción  de terminar. Si el usuario elige 1,el programa mostrará el mensaje “Hola” si elige la opción 2 mostrará el mensaje “Adiós”. Si elige la opción 3 se mostrará cuantos saludos y despedidas ha realizado el programa.

 
Ej.-
1.- Saludar
2.- Despedirse
3.- Terminar
Elegir opción[1-3]:1
Hola

1.- Saludar
2.- Despedirse
3.- Terminar
Elegir opción[1-3]:2
Adiós

1.- Saludar
2.- Despedirse
3.- Terminar
Elegir opción[1-3]:1
Hola

1.- Saludar
2.- Despedirse
3.- Terminar
Elegir opción[1-3]:5
Opción errónea

1.- Saludar
2.- Despedirse
3.- Terminar
Elegir opción[1-3]:3
Total de saludos = 2
Total de despedidas = 1
Fin de programa.

 */
public class menuSaludos {
static Scanner sc=new Scanner(System.in);
	static int contadorHola=0;
	static int contadorAdios=0;
	public static String saludar() {
		contadorHola++;
		return "Hola";
	}
	public static String despedidas() {
		contadorAdios++;
		return "Adios";
	}
	public static void total() {
		System.out.println("Total de saludos: "+contadorHola);
		System.out.println("Total de despedidas: "+contadorAdios);
	}
	public static void main(String[] args) {
		int contadorGeneral=0;
		do {
		System.out.println("Menú de saludos");
		System.out.println("1.-Saludar");
		System.out.println("2.-Despedirse");
		System.out.println("3.-Terminar");
		System.out.println("Introducir una opción");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println(menuSaludos.saludar());
			contadorGeneral++;
		break;
		case 2:
			System.out.println(menuSaludos.despedidas());
			contadorGeneral++;
		break;
		case 3:
			menuSaludos.total();
			System.exit(0);
		break;
		default:
			System.out.println("Opción no válida");
			}
		}while(contadorGeneral!=10);
	}
	
