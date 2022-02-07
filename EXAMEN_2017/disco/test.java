

package disco;

public class test {

	public static void main(String[] args) {
		ControlAcceso puerta = new ControlAcceso();

		puerta.vetaUsuario("Luis");
		puerta.vetaUsuario("Conchi");

		puerta.entraUsuario("Fernando");
		puerta.entraUsuario("Pedro");
		puerta.entraUsuario("Ana");
		puerta.entraUsuario("Luis");
		puerta.entraUsuario("Conchi");
		puerta.entraUsuario("Miguel");
		puerta.entraUsuario("Eva");
		System.out.println("===USUARIOS DENTRO===");
		puerta.verAforo();
		System.out.println("===VETADOS===");
		puerta.verVetados();

	}


}
