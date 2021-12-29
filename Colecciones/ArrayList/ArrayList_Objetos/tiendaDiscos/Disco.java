

package tiendaDiscos;

public class Disco {
	//Se crea la clase disco con los atributos de disco

	private String titulo;
	private String autor;
	private String genero;
	private int duracion;
	
	public Disco(String titulo,String autor,String genero,int duracion) {
		//Función constructora
		this.titulo=titulo;
		this.autor=autor;
		this.genero=genero;
		this.duracion=duracion;
	}
	//Funciones getter y setter de atributos privados
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getGenero() {
		return genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	public static void main(String[] args) {
		

	}
	//Función toString
	@Override
	public String toString() {
		return "Datos de disco:\nTitulo=" + titulo +"\nAutor=" + autor + "\nGenero=" + genero + "\nDuracion=" + duracion + "\n";
	}

	

}
