

public class suprimirCadena {
/*
 *  static String suprimirCadena (  String origen, String cadenaEliminar )

Devuelve nuevo string a partir de la cadena origen donde se han suprimido todas las apariciones de la  cadenaEliminar en la cadena origen. 

SurprimirCadena ("Hola Pepe Luis. Chao Pepe"," Pepe") → "Hola  Luis. Chao"
SurprimirCadena ("Hola Luis.","Luis") → "Hola ."
 */
	public static void eliminar(String cadenaEliminar,String origen) {
		String nueva="";
		nueva=cadenaEliminar.replaceAll(origen,"");
		System.out.println(nueva);
	}
	public static void main(String[] args) {
		String cadenaEliminar="Hola Luis.";
		String origen="Luis";
		suprimirCadena.eliminar(cadenaEliminar, origen);

	}

}
