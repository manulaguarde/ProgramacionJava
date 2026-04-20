package ud10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EscriboPersonasEnFichero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String opcion="";
		ArrayList<Persona> personas=new ArrayList <Persona>();
		
		do {
			System.out.println("Elije una opción\n1. Para ingresar una persona\n2. Para salir");
			opcion=scanner.nextLine();
			
			switch (opcion) {
			case "1":
				System.out.println("Ingresa nombre: ");
				String nombre=scanner.nextLine();
				System.out.println("Ingresa edad: ");
				int edad=scanner.nextInt();
				scanner.nextLine();
				
				personas.add(new Persona(nombre,edad));
				break;
			case "2":
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Opción incorrecta, vuelve a ingresar");
			}
		}while(!opcion.equals("2"));
		
		escribeFichero(personas);
	}
	
	public static void escribeFichero(ArrayList<Persona> p) {
		
		try {
			FileWriter fileWriter=new FileWriter("personas.txt");
			for(Persona pers:p) {
				fileWriter.write(pers.getNombre()+";"+pers.getEdad()+"\n");
			}
			fileWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
