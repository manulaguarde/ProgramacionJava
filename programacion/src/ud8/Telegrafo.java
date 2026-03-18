package ud8;

public class Telegrafo extends Reliquia implements Comunicador {
	


	private String codigo;
	
	public Telegrafo(String anio, String codigo) {
		super(anio);
		this.codigo=codigo;
	}
	
	public void enviarMensaje(String destino, String msj) {
		
		System.out.println("Se ha enviado el mensaje: "+msj);
		System.out.println("Desde ."+this.toString());
		
	}

	@Override
	public String toString() {
		return "Telegrafo [codigo=" + codigo + ", anio=" + anio + "]";
	}
	

	
}
