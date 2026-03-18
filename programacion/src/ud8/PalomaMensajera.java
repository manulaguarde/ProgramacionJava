package ud8;

public class PalomaMensajera extends Paloma implements Comunicador{
	


	private double tiempoDeVuelo;
	
	public PalomaMensajera(boolean vuela, String color, String sexo,double tiempoVuelo) {
		super(vuela,color, sexo);
		this.tiempoDeVuelo=tiempoVuelo;
	}
	
	public void enviarMensaje(String destino, String msj) {
		
		System.out.println("Se ha enviado el mensaje: "+msj);
		System.out.println("Desde ."+this.toString());
		
	}

	@Override
	public String toString() {
		return "PalomaMensajera [tiempoDeVuelo=" + tiempoDeVuelo + ", color=" + color + ", sexo=" + sexo + ", vuela="
				+ vuela + ", especie=" + especie + "]";
	}

}
