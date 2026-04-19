package ud10;

import java.util.Scanner;

public class UsoGrupo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Grupo g1=new Grupo();
		
		g1.insertaAlumnoLista("manuel", 25, 9);
		g1.insertaAlumnoLista("rocio", 26, 8);
		g1.insertaAlumnoLista("gabriel", 27, 7);
		
		/*for(int i=0;i<2;i++) {
			System.out.println("Inserta nombre, edad y calificación");
			String nombre=scanner.nextLine();
			int edad=scanner.nextInt();
			double calificacion=scanner.nextDouble();
			scanner.nextLine();
			g1.insertaAlumnoLista(nombre, edad, calificacion);
		}*/
		
		System.out.println(g1.imprime());
		
		g1.escribeFicheroAlumnos("grupo_1.txt");
		
		g1.leeFicheroAlumnos("grupo_1.txt");
		
		System.out.println(g1.imprime());

	}

}
