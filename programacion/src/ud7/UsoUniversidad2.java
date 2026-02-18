package ud7;

import java.util.Scanner;

public class UsoUniversidad2 {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Persona[]personas=new Persona[6];
		int opcion, posicion=0;
		
		do {
			System.out.println("Ingresa una opcion:\n1.Dar de alta estudiante\n2.Dar de alta Profesor\3.dar de alta Personal de Servicio\n4.Estadísticas\n5.Salir");
			opcion=scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
				case 1:
					Persona p=ingresaPersona();
					System.out.println("Ingresa el curso");
					String curso=scanner.nextLine();
					personas[posicion]=new Estudiantes(p.getNombre(),p.getApellidos(),p.getDni(),p.getEstadoCivil(),curso);
					posicion ++;
					
					break;
				case 2:
					Empleados e=ingresaEmpleado();
					System.out.println("Ingresa departamento");
					String depto=scanner.nextLine();
					personas[posicion]=new Profesores(e.getNombre(),e.getApellidos(),e.getDni(),e.getEstadoCivil(),e.getNumDespacho(),e.getAñoIncorporacion(),depto);
					posicion++;
					break;
				case 3:
					e=ingresaEmpleado();
					System.out.println("Ingresa departamento");
					String seccion=scanner.nextLine();
					personas[posicion]=new Profesores(e.getNombre(),e.getApellidos(),e.getDni(),e.getEstadoCivil(),e.getNumDespacho(),e.getAñoIncorporacion(),seccion);
					posicion++;
					break;
				case 4:
					int contEst=0, contProf=0,contPS=0;
					for(int i=0;i<posicion;i++) {
						if (personas[i] instanceof Estudiantes)
							contEst++;
						else if(personas[i] instanceof Profesores) 
							contProf++;
						else
							contPS++;
					}
					System.out.println("Hay "+contEst+" que son estudiantes\n"+contProf+" que son profesores\n"+contPS+" que son personal de servicio");
					break;
				case 5:
					System.out.println("Has salido");
					break;
				default:
					System.out.println("Opción incorrecta");
			}
		}while(opcion!=5);

	}
	public static Persona ingresaPersona() {
		System.out.println("Ingresa nombre");
		String nombre=scanner.nextLine();
		System.out.println("Ingresa apellidos");
		String apellidos=scanner.nextLine();
		System.out.println("Ingresa dni");
		String dni=scanner.nextLine();
		System.out.println("Ingresa estado civil");
		String estadoCivil=scanner.nextLine();
		
		return new Persona(nombre,apellidos,dni,estadoCivil);
	}
	public static Empleados ingresaEmpleado() {
		Persona p=ingresaPersona();
		System.out.println("Ingresa número de despacho");
		String numDesp=scanner.nextLine();
		System.out.println("Ingresa año de incorpocación");
		int anioInc=scanner.nextInt();
		scanner.nextLine();

		
		return new Empleados(p.getNombre(),p.getApellidos(),p.getDni(),p.getEstadoCivil(),numDesp,anioInc);
	}

}
