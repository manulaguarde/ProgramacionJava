package Ud6;

public class Raices {

	private double a,b,c;
	
	public Raices(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void obtenerRaices() {
		System.out.println("Solución suma");
		System.out.println((-b)+Math.sqrt(getDiscriminante())/(2*a));
		System.out.println("Solución resta");
		System.out.println((-b)-Math.sqrt(getDiscriminante())/(2*a));
	}
	public void obtenerRaiz() {
		System.out.println("Solución única");
		System.out.println((-1*b)/(2*a));
	}
	public double getDiscriminante() {
		
		return Math.pow(b, 2)-4*a*c;
	}
	public boolean tieneRaices() {
		if (getDiscriminante()>0)
			return true;
		
		return false;
	}
	public boolean tieneRaiz() {
		if (getDiscriminante()==0)
			return true;
		
		return false;
	}
	public void calcular() {
		if(tieneRaices())
			obtenerRaices();
		else if (tieneRaiz())
			obtenerRaiz();
		else
			System.out.println("No existe solución");
	}
}
