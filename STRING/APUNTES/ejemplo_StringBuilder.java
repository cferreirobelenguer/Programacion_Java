

public class StringBuilderTest {

	public static void main ( String argv []){
		
        // Creo un StringBuilder a partir de un valor String                                                      
		StringBuilder cadena = new StringBuilder("Hola[]Mundo");  
		
		System.out.println(cadena);
		//Añado el texto  Mundial
		cadena.append(" Mundial"); 
		System.out.println(cadena);
		
        // Cambio el valor de 2º Caracter o -> O
		cadena.setCharAt(1,'O'); 
		System.out.println(cadena);
		// Inserto en la posición 4 un texto
		cadena.insert(5,"Hello"); 
		System.out.println(cadena); // -> HOla[Hello]Mundo Mundial

        String cadenaStr = cadena.toString(); // Obtengo el valor String de un StringBuilder
        System.out.println(cadenaStr); // -> HOla[Hello]Mundo Mundial

		
	
	}
}
