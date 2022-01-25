

package ejerciciosString;


public class StringEjercicio00 {

	 // Método main que prueba las funciones
	
	 static public void main ( String arg[]){
		 //Cuenta las vocales de una cadena
		 String cadenatest = "hola pepe luis";
		 System.out.println(" Nº de vocales de '"+cadenatest+"' :"+cuentaVocales(cadenatest));
		 
		 System.out.println("_________________________________");
		 //Se busca una palabra dentro de una cadena
		 cadenatest = "La gripe es un VIRUS, mas común que el VIRUS del Ebola";
		 System.out.println(" La cadena VIRUS aparece "+ buscarVIRUS(cadenatest)+" veces.");
		 
		 System.out.println("_________________________________");
		 //Oculta las vocales
		 cadenatest = "Que calor";
		 System.out.println(cadenatest + " --> sin vocales -->"+ocultaVocales(cadenatest));
		 
		 System.out.println("_________________________________");
		 //Corta una cadena dentro de las posiciones indicadas
		 cadenatest = "El examen no parece difícil";
		 System.out.println(" Recorta la cadena '"+ cadenatest+ "' posiciones 9, 11\n -->"+ cortarCadena(cadenatest, 9,11));
		
		 cadenatest = "abcdefghijklm";
		 System.out.println(" Recorta la cadena '"+ cadenatest+ "' posiciones 3, 8\n-->"+ cortarCadena(cadenatest, 3,8));
		 
		 cadenatest = "El examen no parece difícil";
		 System.out.println(" Recorta la cadena '"+ cadenatest+ "' posiciones 9, 11\n -->"+ cortarCadena(cadenatest, 9,11));
		
		 cadenatest = "abcdefghijklm";
		 System.out.println(" Recorta la cadena '"+ cadenatest+ "' posiciones 3, 8\n-->"+ cortarCadena(cadenatest, 3,8));
		 
		 System.out.println("_________________________________");
		 //Se oculta una cadena secreta
		 verCadenaSecreta("Tierra y Libertad","[aert]");
		 verCadenaSecreta("La estrategia del caracol","[aeiC]");
		 
		 System.out.println("_________________________________");
		 //Muestra una cadena sin repes
		 cadenatest = "hhoollaaaaPPeeeppeeHola";
		 System.out.println(" Quitar repetidos :" + cadenatest + " :" + cadenaSinRepes(cadenatest));
		 
		 System.out.println("_________________________________");
		 //Se verifica si es capicúa un string
		 String cadena="2002";
		 esCapicua(cadena);
		 
		 System.out.println("_________________________________");
		 //Se repite el string el número de veces que se indica
		 String cadena2="hola mundo";
		 System.out.println(ponEco(cadena2, 6));
		 
		 System.out.println("_________________________________");
		 //Se borran los últimos números que se escriben
		 String Palabra="HolaMundoaa";
		 int num=4;
		 System.out.println(borrarUltimos(Palabra,num));
		 
		 System.out.println("_________________________________");
		 
		 //Quita la letra de una palabra
		 String Palabra1="Hola Mundo";
		 char letra='a';
		 System.out.println(quitarLetra(Palabra1,letra));

		 System.out.println("_________________________________");
		 String cadena1="Adheg.";
		 esSeguraLaContraseña(cadena);
	 }
	 // -----------------------------------
	 // Métodos a Implementar
	 // -----------------------------------
	 
	static public int cuentaVocales (String parámetro){
		//Cuenta las vocales de una cadena
		 int cont = 0;
		 String vocales="aeiouAEIOU";
		 //Se recorre la cadena y se mira si vocales contiene caracter
		 for(int i=0;i<parámetro.length();i++) {
			 String caracter=String.valueOf(parámetro.charAt(i));
			 if(vocales.indexOf(caracter)!=-1) {
				 cont++;
			 }
		
		 }
		 return cont;
	 }
	
	static public int buscarVIRUS (String parámetro){
		//Cuenta el número de veces que aparece una subcadena en una cadena
		   int veces = 0;
		   String cadena="VIRUS";
		   //Se busca la primera búsqueda
		   int posicion=parámetro.indexOf(cadena);
		   while(posicion!=-1) {
			   //Se avanza de posición hasta llegar a -1
			   veces++;
			   //Se amplía el contador y se avanza de posición
			   posicion=parámetro.indexOf(cadena,posicion+1);
		   }
		   return veces;
	 }
	 
	// Version con String poco eficiente
	static public String  ocultaVocales ( String parámetro){
		//Oculta vocales de una cadena
		String nueva = ""; // Creo una cadena vacia
		String vocal="[aeiouAEIOU]";
		nueva=parámetro.replaceAll(vocal,"" );
		
		return nueva;	
	  }
	
	
		
	 // Haciendo uso de la libreria String
	 static public String  cortarCadena ( String cadenaOrigen,  int posini, int posfin){
		 //Se corta la cadena tomando dos parámetros de posición
		 
		 String nueva=cadenaOrigen.substring(posini,posfin);
		 return nueva;
		 
	 }
	 
	 static public void verCadenaSecreta ( String cadena,  String listaletras ){
		 //Ocutar la cadena secreta
		 String nueva="";
		 nueva=cadena.replaceAll(listaletras, "");
		 System.out.println(nueva);
		 
		 
	 }
	 
	 static public void esCapicua ( String cadena ){
		 //Se indica si una cadeana es capicúa o no
		 String parte1="";
		 String parte2="";
		 //Se recorre la mitad de la cadena en un lado
		 for(int i=0;i<cadena.length()/2;i++) {
			 parte1+=String.valueOf(cadena.charAt(i));
		 }
		 //Se recorre la mitad de la cadena en el otro lado
		 for(int i=cadena.length()-1;i>=cadena.length()/2;i--) {
			 parte2+=String.valueOf(cadena.charAt(i));
		 }
		 //Se comparan las cadenas para saber si es capicúa o no
		 if(parte1.equals(parte2)) {
			 System.out.println("Es capicúa");
		 }else {
			 System.out.println("No es capicúa");
		 }
		 System.out.println(parte1);
		 System.out.println(parte2);
		
	 }
	 
	 static public String ponEco  (String Palabra, int nveces){
		 //Se concatena la cadena tantas veces como se indique
		 String nueva="";
		 nueva+=Palabra;
		 for(int i=0;i<nveces;i++) {
			 nueva+=Palabra;
		 }
		 
		 return nueva;
	 }
	 
	 static public String borrarUltimos  ( String Palabra, int num  ){
		 //Borra los últimos caracteres partiendo de un número de parámetro
		 String nueva="";
		 nueva=Palabra.substring(0,num);
		 
		 return nueva;
	 }
	 
	 static public String quitarLetra ( String Palabra, char Letra){
		 //Quita letra pasada por parámetro de una cadena
		 String nueva="";
		 String caracter=String.valueOf(Letra);
		 nueva=Palabra.replaceAll(caracter, "");
		 
		 return nueva;
	 }
	 
	 static public int esSeguraLaContraseña( String cadena1) {
		 boolean mayus=false;
		 boolean minus=false;
		 boolean numero=false;
		 boolean especial=false;
		 	
		 	if(cadena1.length()>=8) {
			 for(int i=0;i<cadena1.length();i++) {
			 //Verifica si son mayúsculas
			 if(cadena1.charAt(i)==Character.toUpperCase(cadena1.charAt(i))) {
				 	mayus=true;
				if(cadena1.charAt(i)==Character.toLowerCase(cadena1.charAt(i))) {
					minus=true;
					if(Character.isDigit(cadena1.charAt(i))) {
						numero=true;
							especial=true;
						}
					}
				}
			 }
		 	}else {
		 		System.out.println("La contraseña debe ser mayor que 8 caracteres");
		 	}
		
		 System.out.println(mayus);
		 System.out.println(minus);
		 System.out.println(numero);
		 System.out.println(especial);
		 if((mayus==true)&&(minus==true)&&(especial==true)) {
			 System.out.println("Contraseña correcta");
		 }else {
			 System.out.println("Contraseña incorrecta");
		 }
		 
		 return 0;
	 }
	 
	
	 static public String cadenaSinRepes ( String cadena){
		 StringBuilder resu=new StringBuilder();
		 for(int i=0;i<cadena.length()-1;i++) {
			String caracter=String.valueOf(cadena.charAt(i));
			if(resu.toString().indexOf(caracter)==-1) {
				resu.append(caracter);			}
			
		 }
		 return resu.toString();
	 }
	
	 
		 
	 
}
