

package examen_ord;
/* Realizar una función que devuelva un String donde se cambie las letras vocales por el carácter que se
 * indique como parámetro. Para simplificar el ejercicio podéis suponer que solo existen vocales en minúsculas
 * y sin acentos.
 * 
 * static public String cambiarVocales(String cadena, char nuevaletra){
 * }
 * 
 * cambiarVocales("Hola Pepe",'*')->"H*l* p*p*t*"
 */
import java.util.Scanner;

public class cambiarVocales {
	static Scanner sc=new Scanner(System.in);
	
	public static String cambiarVocales() {
		//Usamos nextLine para cadenas con espacios
		System.out.println("Introduce una cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce un caracter");
		char caracter=sc.next().charAt(0);
		
		//Suponer que sóloo existen vocales y sin acentos
		String nueva="";
		//Pasamos el caracter a cadena de caracteres
		String cadena_=String.valueOf(caracter);
		nueva=cadena.replaceAll("[aeiou]", cadena_);
		return nueva;
	}

	public static void main(String[] args) {
		
		
		System.out.println(cambiarVocales.cambiarVocales());
		
	}

}
