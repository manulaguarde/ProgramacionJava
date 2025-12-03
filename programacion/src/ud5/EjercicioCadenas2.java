package ud5;

public class EjercicioCadenas2 {

	public static void main(String[] args) {
		String cad1="Holaa";
		String cad2="hola";
		System.out.println(cad1.equals(cad2));
		System.out.println(cad1.equalsIgnoreCase(cad2));
		
		System.out.println(cad1.indexOf('a')); //si no encuentra el caracter pone -1, y si estan repetidas pone la primera que encuentra (la primer ocurrencia)
		
		System.out.println(cad1.lastIndexOf('a')); //saca la ultima ocurrencia donde aparece el caracter (en este caso a)
		//si quiero saber si hay solo un carácter podemos comparar indexOf y lastIndexOf
		
	}

}
