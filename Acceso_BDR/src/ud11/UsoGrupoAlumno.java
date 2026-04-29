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
				System.out.println("Ingresa nombre:");
				String nombre=scanner.nextLine();
				System.out.println("Ingresa edad:");
				String edad=scanner.nextLine();
				System.out.println("Ingresa calificación");
				String calificacion=scanner.nextLine();
				if(Integer.parseInt(edad)<17 || Integer.parseInt(edad)>99) {
					System.out.println("La edad tiene que ser entre 17 y 99 años");
				}else if(Double.parseDouble(calificacion)<0 || Double.parseDouble(calificacion)>10){
					System.out.println("La calificación debe estar entre 0 y 10");
				}else {
					g1.insertaAlumnoLista(nombre, Integer.parseInt(edad), Double.parseDouble(calificacion));
				}
				break;
			case "2":
				g1.insertaAlumnoEnBD();
				break;
			case "3":
				g1.consultaBD();
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
