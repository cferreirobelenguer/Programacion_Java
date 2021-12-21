
/* JUEGO DE PIEDRA PAPEL O TIJERA,
 * USUARIO ELIGE OPCIÓN Y ORDENA ELIGE ALEATORIAMENTE*/
import java.util.Random;
import java.util.Scanner;

public class piedrapapeltijera {
	static Scanner sc=new Scanner (System.in);
	static String usuario="";
	static String opcionesOrdena[]= {"piedra","papel","tijera"};
	static String ordena="";
	public static void usuarioIntroduce() {
		//Usuario elige opción entre PIEDRA,PAPEL O TIJERA
		System.out.println("Introduzca PIEDRA, PAPEL o TIJERA");
		usuario=sc.next();
		//Se pasa a minúsculas la opción de usuario
		usuario=usuario.toLowerCase();
		System.out.println(usuario);
		if((usuario.equals("piedra"))||(usuario.equals("papel"))||(usuario.equals("tijera"))) {
			System.out.println("Usuario ha seleccionado "+usuario);
		}else {
			System.out.println("El dato introducido no corresponde con las opciones PIEDRA, PAPEL O TIJERA");
		}
	}
	public static void ordenaElige() {
		//Ordena elige opción aleatoriamente
		Random aleatorio=new Random();
		int posicion=aleatorio.nextInt(opcionesOrdena.length);
		ordena=opcionesOrdena[posicion];
		System.out.println("Ordena ha seleccionado "+ordena);
	}
	public static void quienGana() {
		//Función que muestra quien gana
		switch(usuario) {
		case "piedra":
			if(ordena=="piedra") {
				System.out.println("EMPATE");
			}else if(ordena=="papel") {
				System.out.println("Ordena gana");
			}else if(ordena=="tijera") {
				System.out.println("Usuario gana");
			}
		break;
		case "papel":
			if(ordena=="piedra") {
				System.out.println("Usuario gana");
			}else if(ordena=="papel") {
				System.out.println("EMPATE");
			}else if(ordena=="tijera") {
				System.out.println("Ordena gana");
			}
		break;
		case "tijera":
			if(ordena=="piedra") {
				System.out.println("Ordena gana");
			}else if(ordena=="papel") {
				System.out.println("Usuario gana");
			}else if(ordena=="tijera") {
				System.out.println("EMPATE");
			}
		break;
		}
	}
	public static void main(String[] args) {
		//Usuario elige opción entre PIEDRA,PAPEL O TIJERA
		System.out.println("TURNO DE USUARIO: ");
		piedrapapeltijera.usuarioIntroduce();
		System.out.println("TURNO DE ORDENA: ");
		//Ordena elige opción aleatoriamente
		piedrapapeltijera.ordenaElige();
		//A continuación se muestra el ganador de la partida
		System.out.println("Y EL GANADOR ES... ");
		piedrapapeltijera.quienGana();
	}

}
