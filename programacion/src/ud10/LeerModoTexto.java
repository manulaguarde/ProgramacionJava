package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerModoTexto {

	public static void main(String[] args) {
		
		FileReader entrada;
		//defino un carácter genérico
		int car=0;
		String cadenaFichero="";
		try {
			entrada=new FileReader("fichero.txt");
			while(car!=-1) { //-1 es EOF (end of file)
				car=entrada.read();
				if(car!=-1)
					cadenaFichero+=(char)car;
				
			}
			System.out.println(cadenaFichero);
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}catch(IOException e) { //puede haber un try con varios catch, y la forma de ordenarlos es que el primero es el más concreto y el último el más genérico
			System.out.println(e.getMessage());
		}
		
	

	}

}
