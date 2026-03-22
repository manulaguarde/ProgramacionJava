package practicaVeterinaria;

public class Gato extends Animal {
	
	private String raza;
	private String microchip;
	
	public Gato(String nombre, String fechaNacimiento, double peso, String raza, String microchip) {
		super(nombre,fechaNacimiento,peso);
		if(raza.equalsIgnoreCase("Comun")||raza.equalsIgnoreCase("Siames")||raza.equalsIgnoreCase("Persa")||raza.equalsIgnoreCase("Angora")||raza.equalsIgnoreCase("Scottish Fold"))
			this.raza=raza;
		else
			this.raza="Comun";
		this.microchip=microchip;
		
	}

	public String getRaza() {
		return raza;
	}

	public String getMicrochip() {
		return microchip;
	}

	@Override
	public String toString() {
		return super.toString()+ " Gato [raza=" + raza + ", microchip=" + microchip + "]";
	}
	
	public String dameDatosAnimal() {
		String cad="Nombre: "+super.getNombre()+
				"\nRaza: "+this.raza+
				"\nFecha de Nacimiento: "+super.getFechaNacimiento()+
				"\nPeso: "+super.getPeso()+
				"\nMicrochip: "+this.microchip+
				"\nComentarios: "+super.getComentarios();
		
		return cad;
		
	}
	
	
}
