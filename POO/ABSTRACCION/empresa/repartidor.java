package empresa;

public class repartidor extends empleados{


	private String zona;
	//Constructor
	public repartidor(String nombre, int edad, double salario,String zona) {
		//Atributos heredados
		super(nombre, edad, salario);
		this.zona=zona;
	}
	
	//Getter y Setter
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public boolean metodoPlus() {
		if((super.getEdad()<25)&&(this.zona.equalsIgnoreCase("zona 3"))) {
			super.setSalario(super.getSalario()+super.plus);
		}
		return false;
	}
	//toString
	
	@Override
	public String toString() {
		return "Ficha de repartidor [Nombre= "+super.getNombre()+" Edad= "+super.getEdad()+" Salario= "+super.getSalario()+" Zona=" + zona + "]";
	}
	

	
	
}
