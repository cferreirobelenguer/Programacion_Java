
package examen_ord;
/* Realizar yba función que devuelva un array de enteros que guarde las posiciones
 * donde aparece una letra en un String. Si no aparece en ninguna posición devolverá null
 * 
 * static public int[]posicionesLetra(String cadena,charLetra){
 * 
 * posicionesLetra ("Hola Pepe",'a')->3
 * posicionesLetra ("Hola Pepe", 'e')->6,8
 * posicionesLetra ("Hola Pepe",'i')->null
 */
import java.util.Arrays;
import java.util.Scanner;

public class MostrarPosiciones {
static Scanner sc=new Scanner(System.in);
	static int contadorPosiciones=0;
	public static void mostrar(String cadena, char caracter) {
		String caracter_=String.valueOf(caracter);
		//Se cuentan las posiciones
		int contadorPosiciones=0;
		int posicion=cadena.indexOf(caracter_);
		while(posicion!=-1) {
			contadorPosiciones++;
			//Se avanza de posición en la cadena
			posicion=cadena.indexOf(caracter_,posicion+1);
		}
	
		
		//Se cuenta el array desde la posición 1
		int j=1;
		if(contadorPosiciones==0) {
			//Si no se encuentran posiciones se crea un arreglo de posición 1 y se almacena null
		String[]lista=new String[1];
			lista[0]=null;
			System.out.println(Arrays.toString(lista));
		}else {
		//Se crea el arreglo con el tamaño del total de posiciones de ese valor
		String []lista=new String[contadorPosiciones];
		//Se añade en la posición 0 el dato de la primera posición encontrada
		int posicion2=cadena.indexOf(caracter_);
		String posiciones=String.valueOf(posicion2);
		lista[0]=posiciones;
		//Se recorre el caracter hasta que no se encuentren más posiciones
		while(posicion2!=-1) {
			
			//Se avanza de posición en la cadena
			posicion2=cadena.indexOf(caracter_,posicion2+1);
			//System.out.println(posicion2);
			if(posicion2!=-1) {
				String posiciones2=String.valueOf(posicion2);
				lista[j]=posiciones2;
				j++;
				}
			
			}
		System.out.println(Arrays.toString(lista));
		
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Introduce cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce caracter");
		char caracter=sc.next().charAt(0);
		MostrarPosiciones.mostrar(cadena, caracter);
		
		
	}

}
