package ud10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Grupo {

	private ArrayList<Alumno> alumnos;
	
	public Grupo() {
		alumnos=new ArrayList<Alumno>();
	}
	
	public void insertaAlumnoLista(String nombre, int edad, double calificacion) {
		
		alumnos.add(new Alumno(nombre,edad,calificacion));
	}
	
	public String imprime() {
		String listado="";
		
		for(Alumno alumno:alumnos) {
			listado+=alumno.imprime()+"\n";
		}
		
		return listado;
	}
	
	public void escribeFicheroAlumnos(String fichero) {
		
		FileWriter fileWriter=null;
		
		try {
			
			fileWriter=new FileWriter(fichero);
			for(Alumno alumno:alumnos) {
				fileWriter.write(alumno.getNombre()+"--"+alumno.getEdad()+"--"+alumno.getCalificacion());
			}
			fileWriter.close();
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
