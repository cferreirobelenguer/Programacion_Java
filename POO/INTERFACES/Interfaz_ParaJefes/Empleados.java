
package cargoJefes;

import java.util.Date;

class Empleados extends Persona {
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
	
		
	
}
