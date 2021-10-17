

/* Muestra por pantalla las letras de cadena que se encuentran
 * almacenadas en listaletras y los espacios en blanco que existen
 * en cadena o un guión en las letras que no están en listaletras.
 * Hacer una versión que en vez de mostrar devuelva una nueva cadena
 * con esas características. */

package ejerciciosstring;

import java.util.ArrayList;

public class verCadenaSecreta {
		public static void VerCadenaSecreta(String cadena, String listaletras,StringBuilder cadenaTotal) {
			for(int i=0;i<cadena.length();i++) {
				char letra=cadena.charAt(i);
				if((letra==' ')||((listaletras.indexOf(Character.toUpperCase(letra)))!=-1)||((listaletras.indexOf(Character.toLowerCase(letra)))!=-1)) {
					cadenaTotal.append(letra);
				}else {
					cadenaTotal.append('-');
				}
			}
			System.out.println("La cadena resultante es "+cadenaTotal);
		}
		
	public static void main(String[] args) {
		String cadena="hola mundo";
		
		String listaletras="amdo";
		StringBuilder cadenaTotal=new StringBuilder();
		
		verCadenaSecreta.VerCadenaSecreta(cadena, listaletras,cadenaTotal);
		
	}

}
