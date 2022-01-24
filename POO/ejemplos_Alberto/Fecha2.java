
/*
 * Ejemplo básico II de una clase con atributos privados
 * que se acceden mediante get y serr
 * 
 */
public class Fecha2 {
	// Atributos o variables miembros privados
	private int dia;
	private int mes;
	private int año;

	// Métodos get y set
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// Método toString que devuelve una cadena con el valor del objeto 
	public String toString() {
		return  dia + "/" + mes + "/" + año;
	}

	public void imprimir() {
		System.out.printf(this.toString());
	}

	public boolean esAñoBisiesto() {

		// Divisible ente 4 y no entre 100 pero si entre 400
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
			return true;
		else
			return false;
	}

}
