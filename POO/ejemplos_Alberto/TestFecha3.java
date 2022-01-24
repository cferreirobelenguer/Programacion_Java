
public class TestFecha3 {
	public static void main (String [] args) {
		// Creo una instancia de la clase Fecha3 llamando al constructor
		Fecha3 fa = new Fecha3(12,6,2016);  
		
		// No funciona el constructor por defecto
		// Fecha3 fb = new Fecha3();
		Fecha3 fb = new Fecha3(12,6,2015); 
		
		System.out.println(" 1)");
		System.out.println (" La fecha A es "+ fa);
		System.out.println (" La fecha B es "+ fb);
		
		// El contenido de los objetos NO SE PUEDE COMPARAR CON EL OPERADOR ==
		// if ( fa == fb)  Siempre dará falso si son objetos en difentes, aunque guarden el mismo valor
		if ( fa.equals(fb) ) System.out.println(" Son iguales.");
		else System.out.println(" Son distintos");
		
		// Pongo el mismo valor de año
		fa.setAño( fb.getAño());
		
		System.out.println(" 2)");
		System.out.println (" La fecha A es "+ fa);
		System.out.println (" La fecha B es "+ fb);
		
		if ( fa.equals(fb) ) System.out.println(" Son iguales.");
		else System.out.println(" Son distintos");
		
		// ¿Como copia objetos sino tengo acceso a los atributos?
		
		Fecha3 fc;
		fc = fa;  // Mal no se crea una copia sino que tengo dos referencia al mismo objeto
		fc = new Fecha3 ( fa.getDia(),fa.getMes(), fa.getAño()); // Bien pero laboriosa 
		fc = new Fecha3(fa);  // Mejor invoco a un constructor por copia.
		
		System.out.println(" 3)");
		System.out.println (" La fecha A es "+ fa);
		System.out.println (" La fecha C es "+ fc);
		if ( fa.equals(fc) ) System.out.println(" Son iguales.");
		else System.out.println(" Son distintos");
		
		}
}
