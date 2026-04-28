package ud11;

import java.util.Scanner;

public class UsoGrupoAlumno {

	public static void main(String[] args) {
		Grupo g1=new Grupo();
		Scanner scanner=new Scanner(System.in);
		String opcion="";
		
		do {
			muestraMenu();
			opcion=scanner.nextLine();
			switch(opcion) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		}while(!opcion.equals("4"));
		

	}
	public static void muestraMenu() {
		System.out.println("Selecciona una opción:\n1.Para ingresar Alumno\n2.Para ingresar todos los alumnos a la Base de datos"
				+"\n3.Para mostrar todos los alumnos de la Base de Datos\n4.Para salir");
	}

}
