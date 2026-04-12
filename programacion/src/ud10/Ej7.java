package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej7 {

	static FileWriter salida;
	static FileReader entrada;
	static Scanner scanner;
	public static void main(String[] args) {
		/*scanner=new Scanner(System.in);
		System.out.println("Escribe el nombre del fichero que deseas leer");
		String fichero1=scanner.nextLine();
		System.out.println("Escribe el nombre del fichero donde vas a copiar");
		String fichero2=scanner.nextLine();*/
		
		//copiaFicheroTexto("texto.txt","copia.txt");
		//invierteFicheroTexto("texto.txt","textoInvertido.txt");
		separaPalabrasFichero("texto.txt","palabrasSeparadas.txt");
		
		
		

	}
	
	public static void copiaFicheroTexto(String fich1, String fich2) {
		int car=0;
		
		try {
			entrada=new FileReader(fich1);
			salida=new FileWriter(fich2);
			while(car!=-1) {
				car=entrada.read();
				salida.write((char)car);
			}
			entrada.close();
			salida.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
			
		
		
	}
	public static void invierteFicheroTexto(String fich1, String fich2) {
		int car=0;
		String cad="";
		
		try {
			entrada=new FileReader(fich1);
			salida=new FileWriter(fich2);
			while(car!=-1) {
				car=entrada.read();
				if(car!=-1)
					cad+=(char)car;
			}
			String[] lista=cad.split("\n");
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

	public static void separaPalabrasFichero(String fich1, String fich2) {
		int car=0;
		String cad="";
		
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
