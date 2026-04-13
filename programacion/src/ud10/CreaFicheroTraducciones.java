package ud10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreaFicheroTraducciones {

	static FileWriter salida;
	
	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		String [] palabras= {
				"patata, potato",
				"mar, sea",
				"delfín, dolphin",
				"madre, mother"
		};
		
		try {
			salida=new FileWriter("traducciones.txt");
			for(String fila:palabras) {
				salida.write(fila+"\n");
			}
			salida.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
