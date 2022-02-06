public class quitarVocales {
/*
 * static String quitarVocales (  String cadena ) 
Devuelve un String a partir de la cadena parámetro con el mismo contenido pero suprimiendo las vocales. 
Ejemplo:
     quitarVocales("Hola Pepe Luis") -->  "Hl Pp Ls"
 */
	public static String quitar(String cadena) {
		String nueva="";
		String vocales="[aeiou]";
		
		nueva=cadena.replaceAll(vocales, "");
		
		return nueva;
	}
	public static void main(String[] args) {
		String cadena="Hola Pepe Luis";
		System.out.println(quitarVocales.quitar(cadena));

	}

}
