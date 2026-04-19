package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
			listado+=alumno.imprime()+"\n\n";
		}
		
		return listado;
	}
	
	public void escribeFicheroAlumnos(String fichero) {
		
		FileWriter fileWriter=null;
		
		try {
			
			fileWriter=new FileWriter(fichero);
			for(Alumno alumno:alumnos) {
				fileWriter.write(alumno.getNombre()+"--"+alumno.getEdad()+"--"+alumno.getCalificacion()+"\n");
			}
			fileWriter.close();
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void leeFicheroAlumnos(String fichero) {
		alumnos.clear();
		FileReader fileReader=null;
		int car=0;
		String cad="";
		
		try {
			fileReader=new FileReader(fichero);
			while(car!=-1) {
				car=fileReader.read();
				if(car!=-1) {
					cad+=(char)car;
				}
		}
		fileReader.close();
		
		String [] datos=cad.split("\n");
		
		for(String dato:datos) {
			String []lineas=dato.split("--");
			alumnos.add(new Alumno(lineas[0],Integer.parseInt(lineas[1]),Double.parseDouble(lineas[2])));
			
		}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
