package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ej3y4 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Escribe el nombre del fichero");
		String fichero=scanner.nextLine();
		
		escribeFicheroNumRandom(fichero);
		
		System.out.println("La suma de los números del fichero es: "+sumaFicheroInt(fichero));
		
		
		

	}
	public static void escribeFicheroNumRandom(String nomFichero) {
		Random numAle=new Random();
		FileWriter salida;
		System.out.println("Escribe la cantidad de números random que quieres generar");
		int nums=scanner.nextInt();
		try {
			salida=new FileWriter(nomFichero);
			for(int i=0;i<nums;i++) {
				int num=numAle.nextInt(10);
				salida.write(num+"\n");
			}
			
			salida.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static int sumaFicheroInt(String nomFichero) {
		int suma=0,car=0;
		String cad="";
		FileReader entrada;
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
