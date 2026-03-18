package ud8;

public interface Comunicador {
	//por defecto los atributos son:
	// public final static
	//SON CONSTANTES (aunque es raro que tenga definidas constantes)
	int CONSTANTE=10;
	
	//los métodos son abstractos y públicos
	void enviarMensaje(String destino, String msj);

}
