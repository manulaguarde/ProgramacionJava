package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej5 {

	static FileWriter salida;
	static FileReader entrada;
	static Scanner scanner;

	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Escribe el nombre del fichero");
		String fichero=scanner.nextLine();
		escribeFicheroTexto(fichero);
		leeFicheroTexto(fichero);
		
		

	}
	public static void escribeFicheroTexto(String fichero) {
		
		try {
			salida=new FileWriter(fichero);
			String entrada="";
			do {
				System.out.println("Ingresa el texto, cuando no desees ingresar más pulsa enter");
				entrada=scanner.nextLine();
				salida.write(entrada+"\n");
			}while(!entrada.equals(""));
			
			salida.close();
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void leeFicheroTexto(String fichero) {
		int car=0;
		try {
			entrada=new FileReader(fichero);
			while(car!=-1){
				car=entrada.read();
				if(car!=-1) {
					System.out.print((char)car);
				}
			}
			
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	
}
