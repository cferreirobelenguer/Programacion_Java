

package examen_ord;
/*Ejercicio 1 (2.5 puntos) Se desea programar una aplicación de gstión de entradas a un museo que procesa cuatro
 * tipos de entradas; las entradas de abonado y las entradas normales que pueden ser: infantil, juvenil
 * p adulto. Cada una tiene los siguientes precios:
 * 
 * Abonado (Gratis)
 * Infantil de 0- hasta los 12 años (2 Euros)
 * Juvenil de 13 -hasta 17 años (5 Euros)
 * Adulto desde los 18 años (10 Euros)
 * 
 * El usuario introducirá un número con el tipo de entrada (1-Abonado /2.Normal/ 0. Fin) Si el usuario introduce
 * 2 se solicitará además la edad de la visitante para calcular el tipo de entrada que va obtener (Infantil, Juvenil o Adulto).
 * 
 * Una vez que el usuario introduce como tipo de entrada el valor 0, el programa terminará mostrando el total de dinero recaudado, el total
 * de entradas vendidas y el porcentaje entradas de abonados y el porcentaje entradas normales que ha realizado.
 * 
 */
import java.util.Scanner;

public class museo {
static Scanner sc=new Scanner(System.in);
	static int totalDinero=0;
	static int totalVendidas=0;
	static int porcentajeAbonados;
	static int porcentajeNormales;
	static int contadorAbonados;
	static int contadorNormales;
	static int precioAbonados;
	static int precioNormales;
	static int total;
	static int contadorTotal;
	
	
	public static void calcularAbonados() {
		//Se incrementa el contador de abonados para saber el número de entradas de abonados 
		contadorAbonados++;
		//El precio de abonados es gratis
		precioAbonados=0;
		//Se incrementa el total de entradas vendidas
		totalVendidas++;
		//Mide el total de entradas en general de cualquier tipo
		contadorTotal++;
		
	}
	public static void calcularNormales() {
		
		int edad=0;
		System.out.println("Edad del visitante");
		edad=sc.nextInt();
		//En función de la edad se fija u precio y se aumentan los contadores
		if((edad>=0)&&(edad<=12)) {
			precioNormales=2;
			System.out.println(precioNormales);
			totalVendidas++;
			contadorNormales++;
			total+=precioNormales;
			contadorTotal++;
		}else if((edad>=13)&&(edad<=17)) {
			precioNormales=5;
			System.out.println(precioNormales);
			totalVendidas++;
			contadorNormales++;
			total+=precioNormales;
			contadorTotal++;
		}else if(edad>=18){
			precioNormales=10;
			System.out.println(precioNormales);
			totalVendidas++;
			contadorNormales++;
			total+=precioNormales;
			contadorTotal++;
		}else {
			System.err.println("El valor introducido no es correcto, vuelva a intentarlo más tarde");
			System.exit(0);
		}
			
		
	}
	public static void main(String[] args) {
		int contador=0;
		int opcion=0;
		do {
		System.out.println("Introduzca el tipo de entrada 1-Abonado, 2-Normal, 0-Terminar [1,2,0]: ");
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Ha seleccionado abonados");
			museo.calcularAbonados();
			break;
		case 2:
			System.out.println("Ha seleccionado normales");
			museo.calcularNormales();
			break;
		case 0:
			System.out.println("Ha seleccionado ver datos totales");
			System.out.println("Total Recaudación: "+total+" €");
			System.out.println("Total entradas vendidas "+totalVendidas);
			double mediaAbonados=0;
			double mediaNormales=0;
			mediaAbonados=(contadorAbonados*100)/contadorTotal;
			mediaNormales=(contadorNormales*100)/contadorTotal;
			System.out.println("Porcentaje Abonados "+mediaAbonados+" %");
			System.out.println("Porcentaje Normales "+mediaNormales+" %");
			
			break;
		default:
			System.out.println("El dato introducido no es correcto");
		}
		
		}while(contador!=10);

	}

}
