package ud10;

//Esto es un ejemplo de Excepción definida por nosotros

public class EdadNoEstaEnRango extends Exception { //Hereda de exception y solo se programa el constructor

	public EdadNoEstaEnRango(String msj) {
		super(msj);
	}
}
