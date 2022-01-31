

package ejercicio_Texto;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
*
Diseñar la clase Texto que gestiona una 
cadena de caracteres con algunas características:
  La cadena de caracteres tendrá una longitud máxima 
  que se especifica en el constructor
  Permite añadir un caracter al principio o al final, 
  siempre y cuando no se exceda de la longitud máxima, 
  es decir, exista espacio disponible.
  Igualmente,permite añadir una cadena, al principio 
  o al final del texo, siempre y cuando no se rebase 
  el tamaño máximo establecido.
  Es necesario saber cuántas vocales (mayúsculas, minúsculas) 
  hay en le texto.
  Cada objeto de tipo Texto tiene que conocer la fecha en 
  la que se creó, así como la fecha y hora de la última 
  modificación efectuada.
  Deberá existir un método que muestre la información que 
  gestiona cada texto.
  */

public class Texto {
	
	private String cadena="pepitogrillo";
	private int longitudMax=0;
	private LocalDate creacion;
	private LocalDateTime modificacion;
	public static String msg="No se puede procesar su solicitud, ha llegado al tamaño máximo permitido";
	//Constructor que establece como parámetro la longitud Máxima que puede tener el caracter
	public Texto(int longitudMax) {
		this.cadena=cadena;
		this.longitudMax=longitudMax;
		//Fijamos el atributo creacion como la fecha actual con LocalDate
		this.creacion=LocalDate.now();
		this.modificacion=null;
	
	}
	//Getter y Setter
	public String getCadena() {
		return cadena;
	}
	public int getLongitudMax() {
		return longitudMax;
	}
	public LocalDate getCreacion() {
		return creacion;
	}
	public LocalDateTime getModificacion() {
		return modificacion;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	public void setLongitudMax(int longitudMax) {
		this.longitudMax = longitudMax;
	}
	public void setCreacion(LocalDate creacion) {
		this.creacion = creacion;
	}
	public void setModificacion(LocalDateTime modificacion) {
		this.modificacion = modificacion;
	}
	//Método que añade caracter al principio si la cadena no supera la longitud
	public void anadirInicio(String cadena2) {
		if(longitudMax>cadena.length()) {
			
			this.cadena=cadena2+this.cadena;
			System.out.println("Palabra resultante tras el cambio :"+this.cadena);
			//Establece la fecha de la modificación cuando se produce una modificación
			this.modificacion=LocalDateTime.now();
			
		}else {
			System.err.println(msg);
			
		}
	}
	//Método que añade caracter al final si la cadena no supera la longitud
		public void anadirFinal(String cadena2) {
			if(longitudMax>cadena.length()) {
				this.cadena=cadena+cadena2;
				System.out.println("Palabra resultante tras el cambio :"+this.cadena);
				//Establece la fecha de la modificación cuando se produce una modificación
				this.modificacion=LocalDateTime.now();
			}else {
				System.err.println(msg);
			}
		}
		//Método que añade char al principio del caracter
		public void anadirInicioChar(char caracter2) {
			if(longitudMax>cadena.length()) {
				this.cadena=String.valueOf(caracter2)+cadena;
				System.out.println("Palabra resultante tras el cambio :"+this.cadena);
				//Establece la fecha de la modificación cuando se produce una modificación
				this.modificacion=LocalDateTime.now();
			}else {
				System.err.println(msg);
			}
		}
		//Método que añade char al final del caracter
		public void anadirFinalChar(char caracter2) {
			if(longitudMax>cadena.length()) {
				this.cadena=cadena+String.valueOf(caracter2);
				System.out.println("Palabra resultante tras el cambio :"+this.cadena);
				//Establece la fecha de la modificación cuando se produce una modificación
				this.modificacion=LocalDateTime.now();
				
			}else {
				System.err.println(msg);
			}
		}
	public void contarVocales() {
		//Método que cuenta vocales mayúsculas y minúsculas
		String vocalesMinus="aeiou";
		String vocalesMayus="AEIOU";
		int contador=0;
		for(int i=0;i<=cadena.length()-1;i++) {
			String valor=String.valueOf(cadena.charAt(i));
			if(vocalesMinus.indexOf(valor)!=-1) {
				contador++;
			}else if(vocalesMayus.indexOf(valor)!=-1) {
				contador++;
			}
		}
		System.out.println("Total de vocales: "+contador);
	}
	
	//toString
	@Override
	public String toString() {
		return "Datos de texto [Cadena=" + this.cadena + ", Longitud Máxima=" + this.longitudMax + ", Fecha de creación de cadena=" + this.creacion + ", Fecha de última modificación de cadena="
				+ this.modificacion + "]";
	}
}
