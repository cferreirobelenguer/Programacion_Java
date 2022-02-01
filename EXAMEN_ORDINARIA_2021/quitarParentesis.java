

package examen_ord;
/* Realizar una función que devuelva un string donde se hayan suprimido los caracteres
 * que hay entre paréntesis en la cadena como parámetro. Se supone que, o no hay paréntesis,
 * o hay solo un paréntesis de abrir y otro de cerrar.
 *
 *static public String quitarParentesis(String cadena){
 *}
 *
 *quitarParentesis ("Hola Pepe (jose),¿como estás?")->"Hola Pepe,¿como estás?
 *quitarParentesis ("Hola Pepe")->"Hola Pepe"
 *quitarParentesis ("Vaya ejercicio (es un rollo)que interesante")->"Vaya ejercicio que interesante";
 */
import java.util.Scanner;

public class quitarParentesis {
	static Scanner sc=new Scanner(System.in);
	public static String quitarParentesis(String cadena) {
		String nueva="";
		int posicion1=cadena.indexOf("(");
		int posicion2=cadena.indexOf(")");
		String cadena1="";
		String cadena2="";
		
		if((posicion1!=-1)&&(posicion2!=-1)) {
			cadena1=cadena.substring(0,posicion1);
			cadena2=cadena.substring(posicion2+1);
			nueva=cadena1+cadena2;
		}else {
			nueva=cadena;
		}
		
		
		return nueva;
	}
	public static void main(String[] args) {
		
		String cadena="Vaya ejercicio (es un rollo)que interesante";
		System.out.println(quitarParentesis.quitarParentesis(cadena));
	}

}
