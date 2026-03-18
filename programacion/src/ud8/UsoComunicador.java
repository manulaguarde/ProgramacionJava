package ud8;

import java.util.ArrayList;

public class UsoComunicador {
	
	//boolean vuela, String especie, String color, String sexo,double tiempoVuelo

	public static void main(String[] args) {
		ArrayList<Comunicador> mensajes=new ArrayList<Comunicador>();
		
		mensajes.add(new PalomaMensajera(true,"blanca","hembra",5.5));
		mensajes.add(new TelefonoMovil("1234516","Xiaomi","Android"));
		mensajes.add(new Telegrafo("1956","Codigo Morse"));
		
		for(Comunicador mensaje:mensajes) {
			mensaje.enviarMensaje("España", "Hola que tal");
		}
	}
	


}
