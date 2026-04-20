package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeoPersonasDelFichero {

	public static void main(String[] args) {
		
		ArrayList<Persona> personas=new ArrayList<Persona> ();
		
		try {
			FileReader fileReader=new FileReader("personas.txt");
			int car=0;
			String cad="";
			while(car!=-1) {
				car=fileReader.read();
				if(car!=-1) {
					cad+=(char)car;
				}
			}
			fileReader.close();
			String [] contenidoFichero=cad.split("\n");
			for(String linea:contenidoFichero) {
				String[] listaPersona=linea.split(";");
				personas.add(new Persona(listaPersona[0],Integer.parseInt(listaPersona[1])));
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		for(Persona p:personas) {
			System.out.println(p);
		}

	}

}
