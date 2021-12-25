package ejerciciosstring;
/*Devuelve una cadena que cambia las vocales por asteriscos
 * cadenares=OcultaVocales("que calor");
 * El valor de cadenares->"qu* c*l*r"; */
public class ocultaVocaless {
	static String vocales="aeiou";
	static String vocalesMayus="AEIOU";
	
	public static void ocultarvocales(String palabra) {
		for(int i=0;i<palabra.length();i++) {
			char caracter=palabra.charAt(i);
			if((vocales.contains(String.valueOf(caracter)))||(vocalesMayus.contains(String.valueOf(caracter)))){
				palabra=palabra.replace(String.valueOf(caracter), "*");
			}
		}
		System.out.println("Palabra: "+palabra);
	}
	public static void main(String[] args) {
		String palabra="Hola estoy programando JAVA";
		ocultaVocaless.ocultarvocales(palabra);
	}

}
