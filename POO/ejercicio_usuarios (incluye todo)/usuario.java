

public class usuario extends persona implements conectar, Comparable<usuario>{
	
	private sexo genero;
	private int llamadasRealizadas=0;
	private int totalWhatsapp=0;
	public usuario(String apellidos) {
		super(apellidos);
		this.genero=elegirGenero();
		this.llamadasRealizadas=llamadasRealizadas;
		this.totalWhatsapp=totalWhatsapp;
	}
	
	public sexo elegirGenero() {
		int aleatorio=(int) Math.floor(Math.random()*(2-0)+0);
		if(aleatorio==0) {
			genero=sexo.FEMENINO;
		}else if(aleatorio==1) {
			genero=sexo.MASCULINO;
		}
		return genero;
	}
	@Override
	void llamar() {
		if(this.telefono==MOVIL.ENCENDIDO) {
			System.out.println("Ha realizado una llamada");
			this.llamadasRealizadas++;
		}
		
	}

	//Getter y Setter
	
	public sexo getGenero() {
		return genero;
	}
	public void setGenero(sexo genero) {
		this.genero=genero;
	}
	public int geLlamadasRealizadas() {
		return llamadasRealizadas;
	}
	public void setLlamadasRealizadas(int llamadasRealizadas) {
		this.llamadasRealizadas=llamadasRealizadas;
	}
	public int totalWhatsapp() {
		return totalWhatsapp;
	}
	public void setTotalWhatsapp(int totalWhatsapp) {
		this.totalWhatsapp=totalWhatsapp;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Datos persona \nApellidos= " + super.getApellidos() + "\nGénero=" + genero+"\nEstado del teléfono= " + super.getTelefono()+"\nTotal de llamadas realizadas: "+llamadasRealizadas+"\nTotal de whatsapp realizados: "+totalWhatsapp;
	}
	
	//Métodos de interfaces
	
	
	//Método que permite ordenar los objetos por nombre
	@Override
	public int compareTo(usuario o) {
		return this.getApellidos().compareTo(o.getApellidos());
		
	}
	
	//Interfaces de encender y apagar el móvil
	
	@Override
	public void encender() {
		//Función que enciende el m´vil
		
		if(this.telefono==MOVIL.APAGADO){
			this.telefono=MOVIL.ENCENDIDO;
		}
		
		
	}
	//Métodos abstractos sobreescritos
	@Override
	public void apagar() {
		//Función que apaga el móvil
		
		if(this.telefono==MOVIL.ENCENDIDO){
			this.telefono=MOVIL.APAGADO;
		}
	}
	
	@Override
	void mandarWhatsapp() {
		if(this.telefono==MOVIL.ENCENDIDO) {
			System.out.println("Ha mandado un Whatsapp");
			this.totalWhatsapp++;
		}
		
		
	}

	
	
	
	
}
