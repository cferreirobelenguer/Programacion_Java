package ejerciciosstring;
/* Devuelve true si cadena es capicua false en caso contrario*/
public class Capicua {
	public static void vercapicua(String palabra) {
		String palabra1="";
		String palabra2="";
		//Se lee la mitad de la palabra
		for(int i=0;i<palabra.length()/2;i++) {
			palabra1+=palabra.charAt(i);
		}
		System.out.println(palabra1);
		//Se lee la otra mitad de la palabra,invirtiendo la palabra
		//y partiéndola en 2
		StringBuilder inverso=new StringBuilder(palabra);
		inverso.reverse();
		palabra2=inverso.toString();
		palabra2=palabra2.substring(0,palabra2.length()/2);
		System.out.println(palabra2);
		//Se comparan ambas porciones
		if(palabra1.equals(palabra2)) {
			System.out.println("La palabra es capicúa");
		}else {
			System.out.println("La palabra no es capicúa");
		}
	}
	public static void main(String[] args) {
		String palabra="AE959EA";
		Capicua.vercapicua(palabra);
	}

}
