package practicaVeterinaria;

import java.util.ArrayList;

public class ClinicaVeterinaria {

	private ArrayList<Animal> animales;
	
	public ClinicaVeterinaria() {
		animales=new ArrayList<Animal>();
	}
	
	public void insertaAnimal(Animal animal) {
		animales.add(animal);
	}
	
	public Animal buscaAnimal (String nombre) {
		
		for(Animal animal:animales) {
			if(animal.getNombre().equalsIgnoreCase(nombre)) {
				return animal;
			}
		}
		return null;
	}
	
	public boolean modificaComentarioAnimal(String nombre, String comentario) {
		Animal animal=buscaAnimal(nombre);
		if(animal==null){
			return false;
		}
		animal.setComentarios(comentario);
		return true;
		
	}
	
	public String toString() {
		String cad="";
		for(Animal animal:animales) {
			cad+=animal.toString()+"\n";
		}
		return cad;
	}
}
