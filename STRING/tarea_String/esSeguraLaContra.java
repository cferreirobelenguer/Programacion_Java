
package ejerciciosstring;
/*Tamaño superior a 8 caracteres en total
 * Contiene caracteres alfabeticos donde hay mayúsculas o minúsculas (una como mínimo de cada)
 * Contiene algún dígito
 * Contiene algún carácter no alfanumérico ni dígito ni alfabético.
 * (Ver métodos de la clase Character)
 * El método me devuelve 0 que indica que la contraseña es segura si cumple todas las condiciones 
 * anteriores.
 * Devuelve 1,2,3 o 4 indicando la condición que no se cumple. Si no cumple una no es necesario chequear
 * la siguiente. */
import java.util.Scanner;

public class esSeguraLaContra {
	static String nombre;
	static String contra;
	static String contra2;
	static boolean nombreOK;
	static boolean contraOK;
	static boolean contra2OK;
	static String especiales=",.-;:_´ç¨Ç{}`+^*[]ºª!·$%&/()=?¿|@€¬";
	static Scanner sc=new Scanner(System.in);
	public static void comprobarNombre() {
		//Comprobar que el primer caracter de nombre sea mayúscula
		String caracter0=String.valueOf(nombre.charAt(0));
		String mayus=String.valueOf(nombre.charAt(0)).toUpperCase();
		if(caracter0.equals(mayus)) {
			nombreOK=true;
		}else {
			System.out.println("Nombre debe tener el primer caracter en mayúsculas");
			System.exit(0);
		}
	}
	public static void comprobarContra() {
		boolean mayus=false;
		boolean minus=false;
		boolean num=false;
		boolean especial=false;
		
		if(contra.length()>8) {
		for(int i=0;i<contra.length();i++) {
			char caracter=contra.charAt(i);
			if(caracter==Character.toLowerCase(caracter)) {
				minus=true;
				if(caracter==Character.toUpperCase(caracter)) {
					mayus=true;
					if(Character.isDigit(caracter)) {
						num=true;
						
						}else {
							especial=true;
					}
				}
			}
		}
		}else {
			System.out.println("1. La contraseña debe ser mayor que 8 caracteres");
			
		}
		if(minus==false) {
			System.out.println("2. Contraseña debe contener minúsculas");
		}else
		if(mayus==false) {
			System.out.println("3. Contraseña debe contener mayúsculas");
		}else
		if(num==false) {
			System.out.println("4. Contraseña debe contener números");
		}else
		if(especial==false) {
			System.out.println("5. Contraseña debe contener caracteres especiales");
		}
		if((minus==true)&&(mayus==true)&&(num==true)&&(especial==true)) {
			contraOK=true;
		}
	}
	public static void comprobarRepe() {
		if(contra.equals(contra2)) {
			contra2OK=true;
		}else {
			System.out.println("Ambas contraseñas deben ser iguales");
		}
	}
	public static void comprobar() {
		if((nombreOK==true)&&(contraOK==true)&&(contra2OK==true)) {
			String msg="";
			System.out.println(0);
			System.out.println("Se ha registrado correctamente");
			System.out.println("Datos registrados:");
			System.out.println("Nombre: "+nombre);
			for(int i=0;i<contra.length();i++) {
				msg+="*";
			}
			System.out.println("Contraseña: "+contra);
		}
	}
	public static void main(String[] args) {
		System.out.println("Introduzca nombre");
		nombre=sc.nextLine();
		esSeguraLaContra.comprobarNombre();
		System.out.println("Introduzca contraseña");
		contra=sc.nextLine();
		System.out.println("Introduzca contraseña repe");
		contra2=sc.nextLine();
		esSeguraLaContra.comprobarContra();
		esSeguraLaContra.comprobarRepe();
		esSeguraLaContra.comprobar();
		
		

	}

}
