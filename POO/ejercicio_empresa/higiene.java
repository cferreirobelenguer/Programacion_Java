
package ejercicio_metrica;

public class higiene extends productos{
	private int contenido;
	
	public higiene(String nombre, int contenido, int precio) {
		super(nombre,precio);
		this.contenido=contenido;
	}
	//Getter y Setter
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	//toString
	@Override
	public String toString() {
		return "Nombre= "+super.getNombre()+" Contenido ,"+contenido+" Precio= $" + super.getPrecio() + " ";
	}
	

}
