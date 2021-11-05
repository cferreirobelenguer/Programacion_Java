
/* Mini ahorcado, se elige una palabra aleatoria y se dan 5 oportunidades
 * para adivinar la palabra, mostrando la palabra oculta descubriendo las letras adivinadas, 
 * contando los aciertos y fallos y mostrándolo por pantalla,
 * al final se pregunta al usuario si sabe la respuesta y se muestra si gana o pierde.
 */


package mini_ahorcado;

import java.util.Scanner;

public class ahorcado {
	static Scanner sc=new Scanner(System.in);
	static String ciudadAleatoria;
	static String palabraOculta;
	static String[] arrayOculto;
	
	
	public static void miniAhorcado(String []ciudades) {
		//palabras aleatorias sacadas de array de ciudades
		int indice=(int) (Math.random()*ciudades.length+0);
		ciudadAleatoria=ciudades[indice];
		palabraOculta=ciudades[indice];
		palabraOculta=palabraOculta.toLowerCase();
		System.out.println(ciudadAleatoria);
		
	}
	public static void ocultarPalabra(String palabraOculta) {
		//array con palabra oculta
		arrayOculto=new String[palabraOculta.length()];
		for(int i=0;i<palabraOculta.length();i++) {
			arrayOculto[i]="-";
		}
		
		
		for(String valor:arrayOculto){
			System.out.print(valor);
		}
	}
	public static void adivinarPalabra(String[]arrayOculto,String palabraTotal) {
		int oportunidades=0;
		int fallos=0;
		int aciertos=0;
		String letra;
		while(oportunidades<5) {
		System.out.println("Introduzca una letra tiene 5 oportunidades: ");
		letra=sc.nextLine();
		if(palabraOculta.contains(letra)) {
			System.out.println("Has acertado la letra");
			int indiceOculto=palabraOculta.indexOf(letra);
			arrayOculto[indiceOculto]=letra;
			System.out.print("PALABRA: ");
			for(int i=0;i<arrayOculto.length;i++) {
				System.out.print(arrayOculto[i]);
			}
			System.out.println();
			aciertos++;
			System.out.println("Llevas "+aciertos+" aciertos");
		}else {
			System.out.println("Has fallado");
			fallos++;
			System.out.println("Llevas "+fallos+" fallos");
		}
		oportunidades++;
		
		}
		System.out.println("Ha agotado sus oportunidades, ¿sabe la palabra?");
		String palabraUsuario=sc.next();
		palabraTotal=palabraTotal.toLowerCase();
		palabraUsuario=palabraUsuario.toLowerCase();
		if(palabraUsuario.equals(palabraTotal)) {
			System.out.println("ENHORABUENA HAS ADIVINADO LA PALABRA, LA PALABRA OCULTA ES "+palabraTotal);
		}else {
			System.out.println("LO SIENTO, NO HAS ADIVINADO LA PALABRA, LA PALABRA OCULTA ES "+palabraTotal);
		}
	}

	public static void main(String[] args) {
		String[] ciudades={"Madrid","Valencia","Mayorca","Burgos"};
		System.out.println("BIENVENIDO AL JUEGO DEL AHORCADO: ");
		System.out.println("Hay una palabra oculta que tienes que adivinar: ");
		miniAhorcado(ciudades);
		ocultarPalabra(palabraOculta);
		System.out.println();
		adivinarPalabra(arrayOculto,palabraOculta);
		
	}

}
