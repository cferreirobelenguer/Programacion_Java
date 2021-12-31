

package examen2017_;
import java.util.*;
/*4.- Mostrar el siguiente menú que se repetirá hasta 
 * que usuario seleccione  la opción  de terminar. 
 * Si el usuario elige 1,el programa mostrará el mensaje 
 * “Vino” si elige la opción 2 mostrará el mensaje “Jamón”.
 *  Si elige la opción 3 se mostrará cuantas bebidas y 
 *  comidas  se han realizado.
Ej.-
1.- Beber
2.- Comer
3.- Terminar
Elegir opción[1-3]:1
Vino

1.- Beber
2.- Comer
3.- Terminar
Elegir opción[1-3]:2
Jamón

1.- Beber
2.- Comer
3.- Terminar
Elegir opción[1-3]:1
Vino
1.- Beber
2.- Comer
3.- Terminar
Elegir opción[1-3]:5
Opción errónea

1.- Beber
2.- Comer
3.- Terminar
Elegir opción[1-3]:3
Total de bebidas = 2
Total de comidas = 1
Fin de programa.

 */
public class bebidasComidas {
static Scanner sc=new Scanner(System.in);
	static int contadorComidas=0;
	static int contadorBebidas=0;
	public static String bebidas() {
		contadorBebidas++;
		return "Vino";
	}
	public static String comidas() {
		contadorComidas++;
		return "Jamón";
	}
	public static String total() {
		
		return "Total bebidas: "+contadorBebidas+"\nTotal comidas: "+contadorComidas;
	}
	public static void main(String[] args) {
		int contador=0;
		while(contador!=10) {
		System.out.println("Menú de comidas y bebidas");
		System.out.println("1.-Beber");
		System.out.println("2.-Comer");
		System.out.println("3.-Terminar");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println(bebidasComidas.bebidas());
		break;
		case 2:
			System.out.println(bebidasComidas.comidas());
		break;
		case 3:
			System.out.println(bebidasComidas.total());
			System.exit(0);
		break;
		default:
			System.out.println("Opción errónea");
			}
		}
	}

}
