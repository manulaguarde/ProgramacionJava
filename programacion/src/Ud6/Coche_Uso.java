package Ud6;

public class Coche_Uso {

	public static void main(String[] args) {
		//Creación de un objeto de tipo coche
		Coche seat=new Coche("abc123", "100v", "azul");
		
		//Asignación de valores en los atributos del objeto (antes de utilizar los modificadores de acceso)
		/*seat.matricula="123abc";
		seat.motor="125cv";
		seat.color="rojo";
		seat.ruedas=3;*/
		
		//para arrancar el "coche"
		seat.arrancar();
		
		//para que el coche pite
		seat.pitar();
		
		System.out.println("nº de ruedas: "+seat.dameRuedas());
		
		seat.establecerColor("verde");
		System.out.println("El color del color es: "+seat.dameColor());
		
		System.out.println("La matricula es: "+seat.dameMatricula());
	}

}
