package ejemplo_polimorfismo;

public class Alumno extends Persona{
	private String curso;
	private String numMatricula;
	
	public Alumno(String nombre,String apellidos,String fechaNacimiento,int edad,String dni,String domicilio,String curso, String numMatricula) {
		//Hereda los atributos de la superclase con los parámetros
		super(nombre,apellidos,fechaNacimiento,edad,dni,domicilio);
		this.curso=curso;
		this.numMatricula=numMatricula;
	}
	//Getter y Setter
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	//toString
	
	
	//Método sobreescrito
	//Polimorfismo, el método imprimirDatos tiene una funcionalidad distinta en Alumnos que en Personas
	public void imprimirDatos() {
		
		//Atributos heredados de la superclase
		//Los atributos de la superclase al ser privados se llaman con get
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellidos: "+getApellidos());
		System.out.println("Fecha: "+getFechaNacimiento());
		System.out.println("Edad: "+getEdad());
		System.out.println(("Dni: "+getDni()));
		//El atrbuto heredado de la superclase domiciio es protected con lo cual no se usa get
		System.out.println("Domicilio: "+domicilio);
		//Atributos de la clase alumno
		System.out.println("Curso: "+curso);
		System.out.println("Número de matrícula: "+numMatricula);
		
		
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", numMatricula=" + numMatricula + ", domicilio=" + domicilio + "]";
	}
	
	

}
