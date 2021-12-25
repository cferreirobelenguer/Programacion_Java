
package ejerciciosstring;
/*Muestra por pantalla las letras de cadena que se encuentran
 * almacenadas en listaletras y los espacios en blanco que existen
 * en cadena o un guión en las letras que no están en listaletras.
 * Hacer una versión que en vez de mostrar devuelva una nueva cadena
 * con esas características */
public class verCadenaSecret {
	public static void mostrar(String palabra, String cadenaMuestra) {
		String msg="";
		for(int i=0;i<palabra.length();i++) {
			String cadena=String.valueOf(palabra.charAt(i));
				//Si contiene algún caracter de cadenaMuestra lo muestra
			if(cadenaMuestra.contains(cadena)) {
				msg+=cadena;
				//Si hay espacio en blanco lo muestra
			}else if(cadena.equals(" ")) {
				msg+=cadena;
				
			}else {
				//En caso contrario se oculta
				msg+="-";
			}
		}
		System.out.println("Cadena resultante: "+msg);
	}
	public static void main(String[] args) {
		String palabra="Tierra y Libertad";
		String cadenaMuestra="airt";
		verCadenaSecret.mostrar(palabra,cadenaMuestra);
	}

}
