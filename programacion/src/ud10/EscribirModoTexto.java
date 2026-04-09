package ud10;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirModoTexto {

	public static void main(String[] args) {
		//defino el flujo o canal de salida
		
		FileWriter salida;
		
		try {
			// aquí creo el canal: (output stream
			salida=new FileWriter("fichero.txt");
			for(int i=1;i<=10;i++) {
				salida.write(i+"\n");
			}
			//cuando no se usa se cierra el canal
			salida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
