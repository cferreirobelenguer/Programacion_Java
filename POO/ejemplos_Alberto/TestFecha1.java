
public class TestFecha1 {
	public static void main (String [] args) {
		// Creo una instancia de la clase Fecha
		Fecha1 origen = new Fecha1();
		Fecha1 destino = new Fecha1();
		// Accedo a sus atributos
		origen.dia = 12;
		origen.mes = 6;
		origen.año = 2016;
		
		// Llamo a un método
		System.out.println("\n Primera fecha_:");
		origen.imprimir();
		
		// CUIDADO CON LA ASIGNACIÓN DE OBJETOS
		// Ojo he machado el contenido de destino
		// Tengo dos referencia al mismo objeto
		destino = origen;
		System.out.println("\n Segunda fecha_:");
		destino.imprimir();
		
		origen.año = 2017;
		System.out.println("\n Primera fecha_:");
		origen.imprimir();
		
		System.out.println("\n Segunda fecha_:");
		destino.imprimir();
		
		// Forma correcta, asignar atributos simples no los objetos
		destino = new Fecha1();
		destino.año = origen.año;
		destino.mes = origen.mes;
		destino.dia = origen.dia;
		
		origen.año = 2088;
		System.out.println("\n Primera fecha_:");
		origen.imprimir();
		
		System.out.println("\n Segunda fecha_:");
		destino.imprimir();
		
		
	}
}
