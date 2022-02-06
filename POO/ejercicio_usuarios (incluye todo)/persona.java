

abstract public class persona {

	private String apellidos;
	protected MOVIL telefono=MOVIL.APAGADO;
	
	//Constructor con parámetros
	public persona(String apellidos) {
		
		this.apellidos=apellidos;
		this.telefono=telefono;
	}
	//Getter y Setter

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public MOVIL getTelefono() {
		return telefono;
	}

	public void setTelefono(MOVIL telefono) {
		this.telefono = telefono;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Apellidos=" + apellidos + ", Estado del telefono=" + telefono;
	}
	
	abstract void llamar();
	abstract void mandarWhatsapp();
	abstract void encender();
	abstract void apagar();

	
	
	
}
