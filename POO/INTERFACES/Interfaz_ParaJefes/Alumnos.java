
package cargoJefes;

public class Alumnos extends Persona{
	//Atributos de la clase Alumnos
	private String a_optativas;
	private String aula;
	public Alumnos(String nombre, String a_optativas, String aula) {
		//Constructor
		super(nombre);
		this.a_optativas=a_optativas;
		this.aula=aula;
		
	}
	//Getter y Setter
	public String getA_optativas() {
		return a_optativas;
	}

	public void setA_optativas(String a_optativas) {
		this.a_optativas = a_optativas;
	}

	public String getAula() {
		return aula;
	}
	
	public void setAula(String aula) {
		this.aula = aula;
	}
	//Método abstracto que se sobreescribe y  hereda de Persona
	@Override
	public String getDescription() {
		return "El alumno con nombre "+this.getNombre()+ " tiene la asignatura optativa "+this.a_optativas+" en el aula "+this.aula;
	}
	
	

}
