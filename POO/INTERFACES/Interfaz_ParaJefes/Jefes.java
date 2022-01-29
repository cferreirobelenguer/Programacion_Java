
package cargoJefes;

import java.util.Date;

//Esta clase hereda de Empleados e implementa una interfaz para definir el cargo del jefe
public class Jefes extends Empleados implements Parajefes{
	//Atributo de la clase Jefes
	private double incentivo;
	private String cargo;
	public Jefes(String nombre, Date fechaAlta, double sueldo, double incentivo) {
		//Constructor que hereda de Empleados los atributos
		super(nombre,fechaAlta,sueldo);
		this.incentivo=incentivo;
	}
	
	//Se llama a getDescripcion para describir al empleado
	public String getDescripcion() {
		return "El empleado Jefe cuyo nombre es "+this.getNombre()+" cuya fecha de alta fue el "+this.getFechaAlta()+" y cuyo sueldo es "+this.getSueldo()+"€ con un incentivo de "+this.incentivo+"€ ,tiene un cargo de ";
		
	}

	@Override
	public void setCargo(String cargo) {
		this.cargo=cargo;
		
	}

	@Override
	public String getCargo() {
		return cargo;
	}

	@Override
	public double setBonus(double gratificacion) {
		// Se llama al método heredado de la interfaz ParaTrabajadores
		double prima=2000;
		//Para llamar a la constante bonus hay que llamar a la interfaz primero que es ParaTrabajadores
		return prima+gratificacion+ParaTrabajadores.bonus;
	}

}
