
public class TestFecha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Creo dos instancia de la clase Fecha4 llamando al constructor
			Fecha4 fa = new Fecha4(12,6,2016);  
			Fecha4 fb = new Fecha4(5,3,2017);
			
			// Llamo a un método de Clase estatico
			System.out.println("Número de fechas creadas "+ Fecha4.getContadorfechas());
			
			System.out.println(" El mes 1 es " + Fecha4.mesToString(1));
			System.out.println(" El mes 10 es " + Fecha4.mesToString(10));
			
			// Llamo a un método de instancia que usa internamente atributos estáticos
			
			System.out.print(" 1º fecha :");  fa.imprimir2();
			System.out.print(" 2º fecha :");  fb.imprimir2();
			
	}

}
