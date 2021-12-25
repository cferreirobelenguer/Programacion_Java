package ejerciciosstring;

public class buscarPalabra {
/*Me devuelve un entero con el número de veces que 
 * aparece la subcadena VIRUS en la cadena pasada como parámetro
 */
	public static void buscarpalabra(String palabra) {
		//Buscamos la primera posición
		int posicion=0;
		int contador=0;
		posicion=palabra.indexOf("VIRUS");
		//Buscamos el resto de posiciones hasta que el resultado sea -1
		//que será cuando ya no encuentre más
		while(posicion!=-1) {
			contador++;
			//Avanzamos posición y buscamos
			posicion=palabra.indexOf("VIRUS",posicion+1);
		}
		System.out.println("La palabra es: "+palabra);
		System.out.println("El número de veces que se repite VIRUS es: "+contador);
	}
	public static void main(String[] args) {
		String palabra="holaVIRUSholasjdhsdVIRUSVIRUSksjVIRUS";
		buscarPalabra.buscarpalabra(palabra);
	}

}
