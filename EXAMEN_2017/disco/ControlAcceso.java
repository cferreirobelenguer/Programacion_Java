

package disco;
/*
 *  Se desea implementar un sistema de Control de Acceso en un recinto con aforo limitado. 
 *  Para ello, cada usuario tendrá asociado un identificador (una cadena de caracteres) que 
 *  permitirá registrar si ese usuario se encuentra o no dentro del recinto. 
	Además, se podrá implementar un mecanismo de lista negra donde se incluirán aquellos usuarios que 
	por la razón que sea tienen prohibida la entrada al recinto (usuarios con la entrada vetada). 
	El sistema de Control de Acceso guardará, por tanto: 
- 	Una lista con todos los usuarios que se encuentran dentro del recinto 
-	Una lista con todos los usuarios que tienen vetada la entrada al recinto 
- 	El número de usuarios que se encuentran en ese momento en el recinto.
	Se pide completar la clase ControlDeAcceso incluyendo

1. Campos o atributos necesarios 
2. Constructor de la clase
3. Método vetaUsuario() 
4. Método entraUsuario()
	5. Método verAforo()


Nota: el aforo del recinto es de 30 usuarios como máximo codificado como constante. Se puede elegir libremente 
la forma de implementarlo: Array de String, ArrayList o mediante listas encadenadas.
 */

import java.util.ArrayList;

public class ControlAcceso {

		private final static int AFORO = 30;
		//lista de usuarios vetados y usuarios dentro del recinto
		ArrayList<String>listaVetados=new ArrayList<String>();
		ArrayList<String>listaDentro=new ArrayList<String>(AFORO);
		private String id;

		/**
		 * Constructor. Inicializa las listas de usuarios dentro del recinto y de
		 * usuarios con la entrada vetada.
		 */
		public ControlAcceso() {
			this.listaVetados=listaVetados;
			this.listaDentro=listaDentro;
		}

		/**
		 * Añade un usuario a la lista de usuarios que tienen 
		 * la entrada prohibida al recinto.
		 * 
		 * @param id
		 *            Identificador del usuario.
		 */
		public void vetaUsuario(String id) {
			//Se añaden un usuario vetado
			this.listaVetados.add(id);
		}

		/**
		 * Para saber si un usuario puede entrar en el recinto. El usuario 
		 * puede entrar si:
		 *  1. no está en la lista de usuarios vetados y 2. no se ha
		 * alcanzado el aforo del recinto. 
		 * Si el usuario finalmente puede entrar, se añade a la lista
		 *  de usuarios que se encuentran dentro del recinto.
		 * 
		 * @param id
		 *            Identificador del usuario.
		 * @return true si el usuario puede entrar;
		 *          false en caso contrario.
		 */
		public boolean entraUsuario(String id) {
			boolean esvetado=false;
			for(int i=0;i<listaVetados.size();i++) {
				if(listaVetados.get(i)==id) {
					esvetado=true;
					break;
				}
			}
			
			if( (listaDentro.size()<30)&&(esvetado==false)) {
				listaDentro.add(id);
				return true;
			}else {
				return false;
			}
			
			
		}

		/**
		 * Muestra la lista de usuarios que han entrado en la sala, 
		 * así como el número de plazas disponibles.
		 */
		public void verAforo() {
			//Muestra la lista de usuarios dentro del recinto
			for(String i:listaDentro) {
				System.out.println(i);
			}
		
		};
		public void verVetados() {
			//Muestra la lista de usuarios dentro del recinto
			for(String j:listaVetados) {
				System.out.println(j);
			}
		}


	public static void main(String[] args) {
		//Se crean los objetos de usuarios y se llama a los métodos de ControlAccesos

	

	}
}
