
package empresa;

public class comercial extends empleados{

	private double comision;
	//Constructor
	public comercial(String nombre, int edad,double salario,double comision) {
		//Atributos heredados
		super(nombre,edad,salario);
		this.comision=comision;
	}
	//Getter y Setter
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	@Override
	public boolean metodoPlus() {
		if((super.getEdad()>30)&&(this.comision==200)){
			super.setEdad(super.getEdad()+super.plus);
			return true;
		}
		return false;
	}
	//toString
	@Override
	public String toString() {
		return "Ficha de comercial: [Nombre= "+super.getNombre()+" Edad= "+super.getEdad()+" Salario= "+super.getSalario()+" Comision=" + comision + "]";
	}
	
	
	
}
