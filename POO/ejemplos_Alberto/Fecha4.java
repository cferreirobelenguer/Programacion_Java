/*
 * Ejemplo básico IV de una clase con atributos y métodos estaticos
 */


public class Fecha4 {
	
	   // Atributos de clase
			static private int contadorfechas = 0;
			static private String tmesString [] = { "Enero", "Febrero", "Marzo", "Abril","Mayo","Junio",
							"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
			
		// Los métodos estáticos solo pueden acceder a atributos estáticos
		static public int getContadorfechas(){
			return contadorfechas;
		}
		
		// Método estático auxiliar 
		static String mesToString ( int mes){
			  if ( mes >=0 || mes < 12){
				  return tmesString[mes];
			  }
			  else {
				  return "Error";  
			  }
		}
		
			
	// Atributos o variables miembros privados a nivel de OBJECTO
			private int dia;
			private int mes;
			private int año;

			// Defino mi propio CONSTRUCTOR
			public Fecha4 ( int dia, int mes, int año ){
				this.dia = dia;
				this.mes = mes;
				this.año = año;
				// Los metodos de INSTANCIA pueden acceder a TODOS los atributos
				contadorfechas++;
				
			}
			
			// Defino un constructor por copia
			public Fecha4 ( Fecha4 fechaAcopiar){
				this.dia = fechaAcopiar.dia;
				this.mes = fechaAcopiar.mes;
				this.año = fechaAcopiar.año;
				contadorfechas++;
			}
			
		
			// Redefino el método equals para comparar
			public boolean equals(Fecha4 objfecha) {
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
				System.out.println(this.toString());
			}
			
			// NUEVO MÉTODO DE USA ATRIBUTOS Y MÉTODOS ESTÁTICOS
			
			public void imprimir2(){
				System.out.println(dia + " de "+ tmesString[mes] + " de " + año);
			}

			public boolean esAñoBisiesto() {

				// Divisible ente 4 y no entre 100 pero si entre 400
				if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
					return true;
				else
					return false;
			}
}
