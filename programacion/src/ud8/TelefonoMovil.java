package ud8;

public class TelefonoMovil extends Telefono implements Comunicador{
	


	private String SistemaOperativo;
	
	public TelefonoMovil(String numero, String marca,String so) {
		super(numero, marca);
		this.SistemaOperativo=so;
	}
	
	public void enviarMensaje(String destino, String msj) {
		
		System.out.println("Se ha enviado el mensaje: "+msj);
		System.out.println("Desde ."+this.toString());
		
	}

	@Override
	public String toString() {
		return "TelefonoMovil [SistemaOperativo=" + SistemaOperativo + ", numero=" + numero + ", marca=" + marca + "]";
	}
	
	

}
