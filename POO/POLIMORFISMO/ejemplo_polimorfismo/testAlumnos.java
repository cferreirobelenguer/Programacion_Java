

package ejemplo_polimorfismo;

public class testAlumnos {

	public static void main(String[] args) {
		
		//CREACIÓN DE OBJETOS
		//Persona y alumno anónimo
		Persona persona1=new Persona();
		//Persona y alumnos con datos 
		Persona persona2=new Persona("Carmen","García","13/07/1980",42,"54675784F","c/Talia");
		Alumno alumno2=new Alumno("Miguel","Pérez","25/06/2000",20,"06756345J","c/Ofelia Nieto","DAW","56453");
		
		System.out.println("DATOS DE PERSONA 1:");
		persona1.imprimirDatos();
		System.out.println(persona1.toString());
		System.out.println("_________________");
		
		System.out.println("DATOS DE PERSONA 2:");
		persona2.imprimirDatos();
		System.out.println(persona2.toString());
		System.out.println("_________________");
		System.out.println("DATOS DE PERSONA 3:");
		alumno2.imprimirDatos();
		System.out.println(alumno2.toString());
		System.out.println("_________________");
		
		
		//Se va a modificar el curso y el número de matrícula de alumno1  y luego se imprimirán los resultados nuevos
		alumno2.setCurso("Sin especificar");
		alumno2.setNumMatricula("xxxx");
		System.out.println("DATOS DE PERSONA 4 TRAS LOS CAMBIOS:");
		alumno2.imprimirDatos();
		System.out.println("_________________");
		
	}

}
