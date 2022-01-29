
package cargoJefes;

import java.util.Date;
//Comparable es una API predefinida
class Empleados extends Persona implements Comparable{
	//Atributos de la clase empleados
	private Date fechaAlta;
	private double sueldo;
	
	public Empleados(String nombre, Date fechaAlta, double sueldo) {
		super(nombre);
		this.fechaAlta=fechaAlta;
		this.sueldo=sueldo;
	}

	@Override
	//Se sobreescribe el método abstracto heredado de la superclase
	public String getDescription() {
		return "El empleado "+this.getNombre()+ " dado de alta en la fecha "+this.fechaAlta+" tiene un sueldo de "+this.sueldo+" € ";
		
	}
	//Getter y Setter
	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public int compareTo(Object o) {
		// Método que devulve negativo si el objeto es mayor, 0 si son iguales y positivo si el objeto que comparamos es mayor
		//Transformo un objeto de tipo Object al de Empleados
		Empleados otroEmpleado=(Empleados)o;
		//Comparamos por sueldo
		if(this.sueldo<otroEmpleado.sueldo) return -1;
		
		if(this.sueldo>otroEmpleado.sueldo) return 1;
		
		return 0;
	}

}
