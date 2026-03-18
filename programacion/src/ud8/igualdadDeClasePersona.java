package ud8;

import java.util.ArrayList;

public class igualdadDeClasePersona {

	public static void main(String[] args) {
		ArrayList<Persona> personas=new ArrayList<Persona>();
		
		Persona p1=new Persona("Javier",50);
		Persona p2=new Persona("Leonardo",39);
		Persona p3=new Persona("Javier",50);
		Persona p4=new Persona("Javier",39);
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		
		for(Persona p:personas) {
			if (p.equals(p1)) {
				System.out.println(p.getNombre()+" y "+p1.getNombre()+" es la misma persona");
			}else{
				System.out.println(p.getNombre()+" y "+p1.getNombre()+" Son personas distintas");
			}
		}
		
		
		
	}

}
