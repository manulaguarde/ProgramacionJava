package ud5;

//Clase String

public class CadenaDeCaracteres {

	public static void main(String[] args) {
		String cad1= new String();
		
		cad1="Hola";
		cad1=cad1+" a todos";
		
		System.out.println(cad1);

		String cad2="hola";
		
		cad2+= " a todos";
		
		System.out.println(cad2);
		
		System.out.println("La Longitud es: "+cad2.length());
		System.out.println("El primer caracter es: "+cad2.charAt(0));
		System.out.println("Y el ultimo caracter es: "+cad2.charAt(cad2.length()-1));
		System.out.println("Cadena en mayusculas: "+cad2.toUpperCase());
	}

}
