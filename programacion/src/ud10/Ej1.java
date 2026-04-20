package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ej1 {
	
	static FileWriter salida;
	static FileReader entrada;
	static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Escribe el nombre del fichero");
		String fichero=scanner.nextLine();
		escribeFicheroNumRandom10(fichero);
		
		System.out.println("La suma de los números del fichero es: "+sumaFicheroInt10(fichero));
		
		
		

	}
	public static void escribeFicheroNumRandom10(String nomFichero) {
		Random numAle=new Random();
		try {
			salida=new FileWriter(nomFichero);
			for(int i=0;i<10;i++) {
				int num=numAle.nextInt(10);
				salida.write(num+"\n");
			}
			
			salida.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static int sumaFicheroInt10(String nomFichero) {
		int suma=0,car=0;
		String cad="";
		try {
			entrada=new FileReader(nomFichero);
			while(car!=-1) {
				car=entrada.read();
				if(car!=-1) {
					cad+=(char)car+"";
				}
				
				
			}
			//System.out.println(cad);
			String[]lista=cad.split("\n");

			for(String num:lista) {
				//System.out.println(num);
				suma+=Integer.parseInt(num);
			}
			
			entrada.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return suma;
	}
	

}
