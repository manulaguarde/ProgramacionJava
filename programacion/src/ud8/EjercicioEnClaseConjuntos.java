package ud8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EjercicioEnClaseConjuntos {
	
	static Scanner scanner=new Scanner(System.in);
	static ArrayList<String> correosTotales=new ArrayList<String>();

	public static void main(String[] args) {
		
		ingresaCorreo();
		muestraRegistros();

	}
	
	public static void ingresaCorreo() {
		String opcion="";
		do {
			System.out.println("Ingresa una opción\n1. Para ingresar correo\n2. Para salir");
			opcion=scanner.nextLine();
			switch(opcion) {
			case "1":
				System.out.println("Ingresa un correo");
				String correo=scanner.nextLine();
				correosTotales.add(correo);
				break;
			case "2":
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
			
		}while(!opcion.equals("2"));
	}
	/*public static void muestraRegistros() {
		 
		System.out.println("nº total de registros recibidos " +correosTotales.size());
		
		for(String correo:correosTotales) {
			correosSinRepetir.add(correo);
		}
		System.out.println("nº total de asistentes únicos "+correosSinRepetir.size());
		
		HashSet<String> correosDuplicados=new HashSet<String>();
		
		
		for(String correo:correosTotales) {
			if(correosTotales.indexOf(correo)!=correosTotales.lastIndexOf(correo)) {
				correosDuplicados.add(correo);
			}
		}
		
		System.out.print("Los emails duplicados son: ");
		for(String correo:correosDuplicados) {
			System.out.print(correo+", ");
		}
		
	}*/
	
	public static void muestraRegistros() {
		HashSet<String> correosSinRepetir=new HashSet<String>();
		HashSet<String> correosDuplicados=new HashSet<String>();
		
		for(String correo:correosTotales) {
			if(!correosSinRepetir.contains(correo)) {
				correosSinRepetir.add(correo);
			}
			else {
				correosDuplicados.add(correo);
			}
		}
		
		System.out.println(correosTotales.size());
		System.out.println(correosSinRepetir.size());
		System.out.println("email duplicados: ");
		for(String correo:correosDuplicados) {
			System.out.println(correo);
		}
	}
}
