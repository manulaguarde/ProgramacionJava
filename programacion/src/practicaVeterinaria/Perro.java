package practicaVeterinaria;

public class Perro extends Animal {
	
	private String raza;
	private String microchip;
	
	public Perro(String nombre, String fechaNacimiento, double peso, String raza, String microchip) {
		super(nombre,fechaNacimiento,peso);
		if(raza.equalsIgnoreCase("Pastor Aleman")||raza.equalsIgnoreCase("Husky")||raza.equalsIgnoreCase("Fox Terrier"))
			this.raza=raza;
		else
			this.raza="Pastor Aleman";
		
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
		return super.toString()+ " Perro [raza=" + raza + ", microchip=" + microchip + "]";
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
