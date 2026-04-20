package ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej8 {

	public static void main(String[] args) {
		
	invierteLineasFichero("texto.txt","textoInvertido.txt");

	}
	
	public static void invierteLineasFichero(String fich1,String fich2) {
		
		int car=0;
		String cad="", lineaInvertida="",contenidoInvertido="";
		FileReader fileReader;
		FileWriter fileWriter;
		
		try {
			fileReader=new FileReader(fich1);
			while(car!=-1) {
				car=fileReader.read();
				if(car!=-1) {
					cad+=(char)car;
				}
			}
			fileReader.close();
			//System.out.println(cad);
			fileWriter=new FileWriter(fich2);
			String[] contenidoFichero=cad.split("\n");
			for(String linea:contenidoFichero) {
				//System.out.println(linea);
				for(int i=linea.length()-1;i>=0;i--) {
					lineaInvertida+=linea.charAt(i);
				}
				//System.out.println(lineaInvertida);
				contenidoInvertido+=lineaInvertida+"\n";
				lineaInvertida="";
			}
			fileWriter.write(contenidoInvertido);
			fileWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
