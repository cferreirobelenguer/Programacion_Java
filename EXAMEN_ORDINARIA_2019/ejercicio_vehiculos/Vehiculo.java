
package examen_2019;

//Interfaz Comparable 
public class Vehiculo implements Comparable<Vehiculo>{
	
	//Atributos privados
	private String matricula;
	public int vecesPrestado=0;
	private estado estadoCoche;
	
	//Constructor con un sólo parámetro matricula
	public Vehiculo(String matricula) {
		this.matricula=matricula;
		this.estadoCoche=estado.disponible;
		this.vecesPrestado=vecesPrestado;
	}
	//Getter y Setter
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getVecesPrestado() {
		return vecesPrestado;
	}


	public void setVecesPrestado(int vecesPrestado) {
		this.vecesPrestado = vecesPrestado;
	}


	public estado getEstadoCoche() {
		return estadoCoche;
	}


	public void setEstadoCoche(estado estadoCoche) {
		this.estadoCoche = estadoCoche;
	}

	
	//Métodos públicos propios de la clase
	//Método que alquila el coche si está disponible, en caso de estar prestado no puede alquilarse
	public boolean alquilar() {
		boolean alquilado=false;
		if(estadoCoche==estado.prestado) {
			estadoCoche=estado.prestado;
			alquilado=false;
		}else if(estadoCoche==estado.disponible) {
			estadoCoche=estado.prestado;
			alquilado=true;
			//En caso de que se preste se incremente las veces que se presta
			
			vecesPrestado++;
			System.out.println(vecesPrestado);
		}
		return alquilado;
	}
	//Método que devuelve el vehículo y pasa a estado disponible
	public void devolver() {
		estadoCoche=estado.disponible;
		System.out.println("Ha devuelvo el vehículo");
	}
	//toString
	@Override
	public String toString() {
		return "Datos de vehiculo : Matricula =" + matricula + ", Nº de veces prestado =" + vecesPrestado + ", Estado del coche =" + estadoCoche;
	}
	//Método compareTo de la interfaz Comparable que ordena los objetos por matrícula en orden alfabético
	@Override
	public int compareTo(Vehiculo o) {
		
		return this.matricula.compareTo(o.matricula);
	}
	

}
