package Ud6;

import java.util.Scanner;

public class GestionaGrupo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String opcion, nombre;
		double nota;
		Grupo grupo=new Grupo(); 
		
		do {
			System.out.println("Ingrese una opción:\n1.Para subir las notas de los alumnos\n2.Para buscar un alumno\n3.Para modificar una nota\n4.Para conocer la media\n"
					+ "5.Para conocer los alumnos con más nota\n6.Para terminar");
			opcion=scanner.nextLine();
			
			switch(opcion) {
				case "1":
					for (int i=0;i<5;i++) {
						System.out.println("Ingresa el nombre del alumno");
						nombre=scanner.nextLine();
						System.out.println("Ingresa la nota del alumno");
						nota=scanner.nextDouble();
						scanner.nextLine();
						if(grupo.darAltaAlumnos(new Alumno(nombre,nota))) {
							System.out.println("Alumno y nota añadido correctamente");
						}
						else {
							System.out.println("El aula está completa");
						}
					}
					break;
				case "2":
					System.out.println("Ingresa el nombre del alumno que buscas");
					nombre=scanner.nextLine();
					System.out.println(grupo.buscarAlumno(nombre));
					break;
				case "3":
					System.out.println("Ingresa el nombre del alumno");
					nombre=scanner.nextLine();
					System.out.println("Ingresa la nota nueva");
					nota=scanner.nextDouble();
					scanner.nextLine();
					if(grupo.modificaNota(nombre, nota)) {
						System.out.println("Nota modificada correctamente");
					}
					else {
						System.out.println("La nota no pudo modificarse o el alumno no se encuentra");
					}
					break;
				case "4":
					System.out.println(grupo.realizaMedia());
					break;
				case "5":
					Alumno [] mejoresAlumnos=grupo.mostrarMejorAlumno();
					for(int i=0;i<mejoresAlumnos.length;i++) {
						System.out.println(mejoresAlumnos[i]);
					}
					break;
				case "6":
					System.out.println("Hasta luego");
					break;
				default:
					System.out.println("Opción no válida");
				
					
			}
			
		}while(!opcion.equals("6"));

	}

}
