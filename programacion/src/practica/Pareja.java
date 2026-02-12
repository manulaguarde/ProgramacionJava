package practica;

public class Pareja {

	private Persona persona1;
	private Persona persona2;
	private Regalo regaloParaPersona1;
	private Regalo regaloParaPersona2;
	
	public Pareja(Persona p1,Persona p2) {
		this.persona1=p1;
		this.persona2=p2;
		this.regaloParaPersona1=null;
		this.regaloParaPersona2=null;
	}
	public void setRegaloParaPersona1(Regalo regalo) {
		this.regaloParaPersona1=regalo;
	}
	public void setRegaloParaPersona2(Regalo regalo) {
		this.regaloParaPersona2=regalo;
	}
	public double calcularCostoTotal() {
		return regaloParaPersona1.getPrecio()+regaloParaPersona2.getPrecio();
	}
	public void mostrarDetalles() {
		System.out.println(regaloParaPersona1.toString());
		System.out.println(regaloParaPersona2.toString());
		System.out.println("Costo total de los regalos: "+calcularCostoTotal()+"\n");
	}
	public String toString() {
		String cad=persona1.toString()+regaloParaPersona1.toString()+persona2.toString()+regaloParaPersona2.toString()+"\n";
		return cad;
	}
	
}
