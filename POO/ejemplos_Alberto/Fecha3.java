/*
 * Ejemplo básico III de una clase con constructores y método igual para comparar
 */
public class Fecha3 {
	// Atributos o variables miembros privados
		private int dia;
		private int mes;
		private int año;

		// Defino mi propio CONSTRUCTOR
		public Fecha3 ( int dia, int mes, int año){
			this.dia = dia;
			this.mes = mes;
			this.año = año;
		}
		
		// Defino un constructor por copia
		public Fecha3 ( Fecha3 fechaAcopiar){
			this.dia = fechaAcopiar.dia;
			this.mes = fechaAcopiar.mes;
			this.año = fechaAcopiar.año;
		}
		
		// Redefino el método equals para comparar
		public boolean equals(Fecha3 objfecha) {
			// Caso especial me pasan un objeto no instanciado / creado
			if (objfecha == null)
				return false;
			
			if ( (año == objfecha.año) && (dia == objfecha.dia) &&
			     (mes == objfecha.mes) )
				return true;
			else 
				return false;
		}

		// RESTO DE MÉTODOS 
		
		
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

		// Método toString
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
