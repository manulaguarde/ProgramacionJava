package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej10 {

	static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Escribe el nombre del fichero que deseas leer");
		String fichero1=scanner.nextLine();
		System.out.println("Escribe el nombre del fichero donde vas a copiar palabra por palabra");
		String fichero2=scanner.nextLine();
		separaPalabrasFichero(fichero1,fichero2);

	}

	public static void separaPalabrasFichero(String fich1, String fich2) {
		int car=0;
		String cad="";
		FileReader entrada;
		FileWriter salida;
		try {
			entrada=new FileReader(fich1);
			salida=new FileWriter(fich2);
			while(car!=-1) {
				car=entrada.read();
				if(car!=-1)
					cad+=(char)car;
			}
			String[] lista=cad.split("\n");
			for(String frase:lista) {
				String[]palabras=frase.split(" ");
				for(String p:palabras) {
					salida.write(p+"\n");
				}
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
