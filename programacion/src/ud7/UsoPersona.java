package ud7;

import java.util.ArrayList;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> personas=new ArrayList<Persona>();
		
		personas.add(new Estudiantes("nombre","apellido","dni1","solt","daw1"));
		personas.add(new Profesores("nom","ap1","dni2","cas","dep1",0,"info"));
		
		for(int i=0;i<personas.size();i++) {
			System.out.println(personas.get(i));
		}
		
		//for each
		for(Persona persona:personas) {
			System.out.println(persona);
		}
	}

}
