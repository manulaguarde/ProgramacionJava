package Ud6;

public class PruebaCuentas {

	public static void main(String[] args) {
		CuentaPersona persona=new CuentaPersona("005601561231053056");
		
		System.out.println(persona.toString());
		persona.recibeAbonos(700);
		System.out.println(persona.consultaSaldo());
		persona.pagaRecibos(500);
		System.out.println(persona.consultaSaldo());

	}

}
