

import java.util.Date;

public class test {

	public static void main(String[] args) {
		// Creación de objetos
		Empleados Juan=new Empleados("Juan", new Date(564736),2500.0);
		
		System.out.println(Juan.getNombre());
		System.out.println(Juan.getDescription());
		
		System.out.println("_______________________");
		
		Jefes Ana=new Jefes("Ana",new Date(654546),3500.0,30.0);
		Ana.setCargo("Directora de Marketing");
		System.out.println(Ana.getNombre());
		System.out.println(Ana.getDescripcion()+Ana.getCargo());
		
		System.out.println("_______________________");
		
		Alumnos Maria=new Alumnos("Maria","Dibujo","Aula 5");
		System.out.println(Maria.getNombre());
		System.out.println(Maria.getDescription());
		
		System.out.println("_______________________");
		
		Jefes David=new Jefes ("David", new Date(654654),4800.0,50.0);
		David.setCargo("Director de RRHH");
		System.out.println(David.getNombre());
		System.out.println(David.getDescripcion()+David.getCargo());
		
		System.out.println("_______________________");
	}

}
