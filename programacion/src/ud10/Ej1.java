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
		//System.out.println("Escribe el nombre del fichero");
		//String fichero=scanner.nextLine();
		//EscribeFicheroNumRandom10(fichero);
		
		System.out.println(SumaFicheroInt10("numerosRandom.txt"));
		
		
		

	}
	public static void EscribeFicheroNumRandom10(String nomFichero) {
		Random numAle=new Random();
		try {
			salida=new FileWriter(nomFichero);
			for(int i=0;i<10;i++) {
				int num=numAle.nextInt(10);
				salida.write(num+"\n");
			}
			
			salida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static int SumaFicheroInt10(String nomFichero) {
		int suma=0,car=0;
		String cad="";
		try {
			entrada=new FileReader(nomFichero);
			while(car!=-1) {
				entrada.read();
				if(car!=-1) {
					cad+=(char)car+" ";
				}
				
				
			}
			String[]lista=cad.split(" ");
			/*for (int i=0;i<cad.length();i++) {
				suma+=(int)cad[i];
			}*/
			for(String num:lista) {
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
