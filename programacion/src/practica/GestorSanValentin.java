package practica;

public class GestorSanValentin {

	public static void main(String[] args) {
		Pareja pareja=new Pareja(new Persona ("123456e","Ricardo"),new Persona("654321f","Mirta"));
		pareja.setRegaloParaPersona1(new Regalo("Oso de Peluche",9.90,"Osito de peluche de Taiwan"));
		pareja.setRegaloParaPersona2(new Regalo("caja de bombones",12.50,"Bombones y chocolates Suizos"));
		
		System.out.println(pareja.toString());

	}

}
