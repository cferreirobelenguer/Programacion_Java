
public class TestFecha2 {
	public static void main (String [] args) {
	// Creo una instancia de la clase Fecha2
	Fecha2 origen = new Fecha2();  
	
	// No compila
	// origen.dia = 12; ya que es un métood privado
	// Accedo a los set o get
	origen.setDia(12);
	origen.setMes(6);
	// Incremento el mes
	origen.setMes(origen.getMes()+1);
	origen.setAño(2016);
	
	// Llamo a los métodos
	origen.imprimir();
	
	System.out.println();
	
	// Llamada implicita a origen.toString();
	System.out.println (" La fecha es "+ origen);
	
	if ( origen.esAñoBisiesto()) System.out.println("Es año bisiesto");
		System.out.println("No es año bisiesto");
	
	
	}
}
