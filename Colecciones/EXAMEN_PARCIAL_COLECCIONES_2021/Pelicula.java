

public class Pelicula implements Comparable <Pelicula>{
	private int id;
	private String titulo;
	private int anio;
	private critica valoracion;
	private String director;
	
	//Constructor con todos los atributos como parámetro menos director
	public Pelicula(int id,String titulo,int anio,critica valoracion) {
		this.id=id;
		this.titulo=titulo;
		this.anio=anio;
		this.valoracion=valoracion;
		this.director="Alejandro Amenabar";
	}
	//Getter y Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public critica getValoracion() {
		return valoracion;
	}

	public void setValoracion(critica valoracion) {
		this.valoracion = valoracion;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	//toString
	@Override
	public String toString() {
		return "Datos de la pelicula: [ID=" + id + ", Titulo=" + titulo + ", Año=" + anio + ", Valoracion=" + valoracion
				+ ", Director=" + director + "]";
	}
	//Método de la interfaz Comparable que ordena los objetos por id
	@Override
	public int compareTo(Pelicula o) {
		if(this.id>o.id) return 1;
		if(this.id<o.id) return -1;
		return 0;
	}
	
	
	
	
	

}
