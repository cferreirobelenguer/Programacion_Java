
package entradaPelis;
/* Un cine de un pueblo pequeño nos propone hacer una aplicación 
 * para controlar las personas de una cola de un cine en los grandes 
 * estrenos de películas.

Un conjunto de personas esperaran la cola para sacar una entrada, 
tendremos que calcular la entrada según la edad de la persona 
(mínimo 5 años).

La edad de las personas se generan aleatoriamente entre 5 y 60 años. 
Al final, deberemos mostrar la cantidad total recaudada. 
El número de personas de la cola se elige al azar entre 0 y 50.

Recuerda que al final la lista debe quedar vacía, una vez que una persona paga su entrada ya no está en la cola */

import java.util.ArrayList;
import java.util.Scanner;

public class entradas {
	static Scanner sc=new Scanner (System.in);
	static double recaudacion=0;
	public static void anadir(ArrayList datosUsuarios,ArrayList preciosCola) {
		System.out.println("Introduce nombre");
		String nombre=sc.next();
		System.out.println("Introduce apellido");
		String apellido=sc.next();
		//Edad aleatoria
		int edad=(int)Math.floor(Math.random()*(60-5)+5);
		//Precio se asigna en función de la edad
		double precio = 0;
		if((edad>=5)&&(edad<=10)) {
			precio=1;
		}else if((edad>=11)&&(edad<=17)) {
			precio=2.5;
		}else if(edad>18) {
			precio=3.5;
		}
		
		//Objeto entradacine
		Persona entradacine=new Persona(nombre,apellido,edad,precio);
		//Se asignan los datos de usuario a los atributos del objeto
		entradacine.setNombre(nombre);
		entradacine.setApellidos(apellido);
		entradacine.setEdad(edad);
		entradacine.setPrecio(precio);
		//Cogemos los precios de los usuarios de la cola en un ArrayList aparte
		preciosCola.add(precio);
		datosUsuarios.add(entradacine);
		System.out.println("Usted esta en la cola");
		
	}
	public static void pagar(ArrayList datosUsuarios,ArrayList preciosCola) {
		//El usuario que está en la cola en la primera posición realiza el pago
		System.out.println("Introduzca la posición en la que está en la cola");
		int posicion=sc.nextInt();
		System.out.println("Se ha realizado la compra de las entradas, los datos son:");
		datosUsuarios.get(posicion);
		//Al hacer un pago se aumenta la recaudación
		double precio_=(double)preciosCola.get(posicion);
		recaudacion+=precio_;
		//Al hacer un pago ese usuario sale de la cola
		datosUsuarios.remove(posicion);
		preciosCola.remove(posicion);
		System.out.println("Usuario fuera de la cola");
		
	}
	public static void recorrer(ArrayList datosUsuarios) {
		//Se recorre los usuarios en la cola
		for(Object cine:datosUsuarios) {
			System.out.println(cine);
		}
	}
	public static void main(String[] args) {
		//ArrayList de objetos persona
		ArrayList<Persona>datosUsuarios=new ArrayList<>();
		//ArrayList de los precios de los usuarios en la cola
		ArrayList<Integer>preciosCola=new ArrayList<>();
		int contador=0;
		int aforo=(int)Math.floor(Math.random()*50);
		System.out.println("Bienvenido al cine: ");
		System.out.println("Pulse 1 para apuntarse a la cola");
		System.out.println("Pulse 2 para ver usuarios con entrada");
		System.out.println("Pulse 3 para pagar");
		System.out.println("Pulse 4 para ver recaudación total");
		System.out.println("Pulse 5 para salir del sistema");
		do {
		System.out.println("Seleccione una opción");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Ha seleccionado adquirir entradas");
			entradas.anadir(datosUsuarios,preciosCola);
			contador++;
		break;
		case 2:
			System.out.println("Ha seleccionado ver total de usuarios con entradas");
			entradas.recorrer(datosUsuarios);
			contador++;
		break;
		case 3:
			System.out.println("Ha seleccionado pagar");
			entradas.pagar(datosUsuarios,preciosCola);
		break;
		case 4:
			System.out.println("Ha seleccionado ver recaudación total acumulada");
			System.out.println("Recaudación: "+recaudacion+" €");
		break;
		case 5:
			System.out.println("Ha seleccionado salir del sistema");
			System.exit(0);
		break;
		default:
			System.out.println("La opción elegida es inválida");
			contador++;
			}
		}while(contador!=aforo);
	}

}
