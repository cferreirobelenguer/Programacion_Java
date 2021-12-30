
package elaboracion_informes;

public class informe {
	
	
	//Atributos
	private String codigo;
	private String datos;
	//Constructor
	public informe(String codigo,String datos) {
		this.codigo=codigo;
		this.datos=datos;
	}
	//Getters and Setters
	public String getCodigo() {
		return codigo;
	}
	public String getDatos() {
		return datos;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	//toString con el contenido que se va a leer en el for
	@Override
	public String toString() {
		return "Informe:\nCodigo=" + codigo + "\nDatos=" + datos+"\n____________\n";
	}
}
