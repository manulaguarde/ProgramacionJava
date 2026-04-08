package ud10;

import java.util.Scanner;



public class Contrasenia {
	public static void son8Digitos(String psw) throws ContraseniaIncorrecta{
		if(!(psw.contains("0123456789"))) {
			throw new ContraseniaIncorrecta("La contraseña debe ser solo números");
		}
	}
	public static void longitud8(String psw) throws ContraseniaIncorrecta{
		if(psw.length()!=8) {
			throw new ContraseniaIncorrecta("La contraseña debe ser de 8 dígitos");
		}
	}
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Ingresa la contraseña. Tienen que ser 8 dígitos numéricos");
		String contrasenia=scanner.nextLine();
		
		try {
			son8Digitos(contrasenia);
			System.out.println("Contraseña correcta");
		}catch(ContraseniaIncorrecta e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
