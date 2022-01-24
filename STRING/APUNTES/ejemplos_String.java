import java.util.Scanner;


public class Stringtest {

	public static void main ( String argv[]){
	char [] vocalesT = {'a','e','i','o','u'};
	String  vocalesS =  "aeiou";
	
	
	// Recorrido de una tabla
	for (int i=0; i < vocalesT.length; i++){
		System.out.printf("T %d:%c %n",i,vocalesT[i]);
	}
	
	// Recorrido de un String;
	for (int i=0; i < vocalesS.length(); i++){
		System.out.printf("S %d:%c %n",i,vocalesS.charAt(i));
	}
 	
	vocalesT[0]= 'A';   // tabla: alteramos su valor
	vocalesS = "Aeiou"; // Hacemos que vocalesS tenga un String nuevo.
	
	// Uso del operador +
	String nombre = "Pepe";
	nombre = nombre + " " + "Peréz";
	System.out.println("D."+nombre); // Muestra D.Pepe Peréz
	
	// Uso del método concat
	nombre = "Pepe";
	nombre = nombre.concat(" ").concat("Peréz");
	System.out.println("D."+nombre); // Muestra D.Pepe Peréz
	
	
	// Comparar cadenas
	System.out.println(" Introduce dos cadenas con un mismo valor:");
	
	Scanner sc = new Scanner(System.in);
	System.out.print("1 º:");
	String cade1 = sc.next();
	System.out.print("2 º:");
	String cade2 = sc.next();
	
	if ( cade1 != cade2 ) System.out.println("1º IF:Siempre son distintas: Comparas los objetos");
	
	if ( cade1.equals(cade2) == true)System.out.println("2º IF: Dos objetos con contenidos iguales");
	
	// String en alternativa simple
	switch ( cade1) {
		case "Pepe":
		case "pepe":System.out.println("Hola D. Pepito");break;
		case "José":
		case "jose":
		case "Josito": System.out.println(" Hola D. José");break;
		default : System.out.println(" ¿Quien Eres?");
		}    
	
	// Cambio de tabla de char a String. 
	// Curioso uso String anónimos, sin nombre de variable asociado
    char [] vocales = "hola luis".toCharArray();
    
    // Cambio a Mayusculas los caracteres de un array
    for (int i=0; i<vocales.length; i++){
    	vocales[i] = Character.toUpperCase(vocales[i]);
    }
    // Obtengo un String a partir de Array de char 
    String mensaje = String.valueOf(vocales);
    System.out.println(mensaje);
    
    sc.close();   
	}
	
}
