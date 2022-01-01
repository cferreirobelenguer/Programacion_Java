
package cuentaBancaria_;
/*Crea una clase llamada Cuenta que tendrá los siguientes
 *  atributos: titular y cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional.
 Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad 
a la cuenta, si la cantidad introducida es negativa, 
no se hará nada.
retirar(double cantidad): se retira una cantidad a 
la cuenta, si restando la cantidad actual a la que 
nos pasan es negativa, la cantidad de la cuenta pasa
º a ser 0 */
import java.util.*;
public class testCuenta {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Cuenta cliente=new Cuenta("Francisco",200);
		Cuenta cliente2 = new Cuenta("Pepa");
		int contador=0;
		System.out.println("Menú de banco: ");
		System.out.println("1. Ingresar");
		System.out.println("2. Reintegro");
		System.out.println("3. Ver datos y saldo");
		System.out.println("4.Salir del sistema");
		do {
			System.out.println("Elige una opción: ");
			int opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					cliente.ingresar();
					contador++;
					break;
				case 2:
					cliente.retirar();
					contador++;
					break;
				case 3:
					System.out.println("Datos del cliente:");
					System.out.println(cliente.toString());
					contador++;
					break;
				case 4:
					System.out.println("Ha elegido salir del sistema");
					System.exit(0);
				default:
					System.out.println("Opción no válida");
			}
		}while(contador!=5);

	}

}
