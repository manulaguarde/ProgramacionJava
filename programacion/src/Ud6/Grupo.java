package Ud6;

public class Grupo {

	private Alumno [] alumnos;
	//private int numAlumno;
	
	public Grupo() {
		alumnos=new Alumno[20];
	}
	public void darAltaAlumnos(Alumno alum) {
		for (int i=0;i<alumnos.length;i++) {
			this.alumnos[i]=alum;
		}
	}
	public Alumno buscarAlumno(String nom) {
		for(int i=0;i<alumnos.length;i++) {
			if(nom.equals(alumnos[i].getNombre())) {
				return alumnos[i];
			}
		}
		return null;
	}
	public boolean modificaNota(String nom, double nota) {
		Alumno a=buscarAlumno(nom);
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
}
