package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej9 {

	static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Escribe el nombre del fichero que deseas leer");
		String fichero1=scanner.nextLine();
		
		invierteFicheroTexto(fichero1);
		
		

	}
	public static void invierteFicheroTexto(String fich1) {
		int car=0;
		String cad="";
		FileReader entrada;
		FileWriter salida;
		try {
			entrada=new FileReader(fich1);
			while(car!=-1) {
				car=entrada.read();
				if(car!=-1)
					cad+=(char)car;
			}
			System.out.println(cad);
			String[] lista=cad.split("\n");
			
			salida=new FileWriter(fich1);
			for(int i=lista.length-1;i>=0;i--) {
				salida.write(lista[i]+"\n");
			}
			entrada.close();
			salida.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
