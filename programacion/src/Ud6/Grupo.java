package Ud6;

public class Grupo {

	private Alumno [] alumnos;
	private int indice=0;
	//private int numAlumno;
	
	public Grupo() {
		alumnos=new Alumno[5];
	}
	public boolean darAltaAlumnos(Alumno alum) {
		if(indice<alumnos.length) {
			this.alumnos[indice]=alum;
			indice++;
			return true;
		}
		return false;
		
	}
	public Alumno buscarAlumno(String nom) {
		for(int i=0;i<indice;i++) {
			if(nom.equals(alumnos[i].getNombre())) {
				return alumnos[i];
			}
		}
		return null;
	}
	public boolean modificaNota(String nom, double nota) {
		Alumno a=buscarAlumno(nom);
		if(a==null) {
			return false;
		}
		if(a.getNombre().equals(nom)) {
			a.setNota(nota);
			return true;
		}
		return false;
		
		
	}
	public double realizaMedia() {
		double suma=0;
		for (int i=0;i<alumnos.length;i++) {
			suma+=alumnos[i].getNota();
		}
		return suma/alumnos.length;
	}
	
	public Alumno[] mostrarMejorAlumno() {
		double mejor=alumnos[0].getNota();
		int cont=0,j=0;
		for(int i=1;i<alumnos.length;i++) {
			if(mejor<alumnos[i].getNota()) {
				mejor=alumnos[i].getNota();
			}
		}
		for (int i=0;i<alumnos.length;i++) {
			if(mejor==alumnos[i].getNota()) {
				cont++;
			}
		}
		Alumno[] mejoresAlumnos=new Alumno[cont];
		for (int i=0;i<alumnos.length;i++) {
			if(mejor==alumnos[i].getNota()) {
				mejoresAlumnos[j]=alumnos[i];
				j++;
			}
		}
		return mejoresAlumnos;
		
	}
	public String toString() {
		String cad="";
		for(int i=0;i<this.indice;i++) {
			cad+=alumnos[i].toString()+"\n\n";
		}
		return cad;
	}
}
