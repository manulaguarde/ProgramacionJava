package Ud6;

public class Fraccion {

	private int numerador,denominador;
	
	public Fraccion(int num, int den) {
		this.numerador=num;
		this.denominador=den;
	}

	public int getNumerador() {
		return numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public String toString() {
		return this.numerador+"/"+this.denominador;
	}
	public Fraccion suma(Fraccion f2) {
		int numerador,denominador;
		if(this.denominador==f2.getDenominador()) {
			numerador=this.numerador+f2.getNumerador();
			denominador=this.denominador;
		}else {
			numerador=this.numerador*f2.getDenominador()+this.denominador*f2.getNumerador();
			denominador=this.denominador*f2.getDenominador();
		}
		Fraccion resultado=new Fraccion(numerador,denominador);
		return resultado;
	}
	public Fraccion resta(Fraccion f2) {
		int numerador,denominador;
		if(this.denominador==f2.getDenominador()) {
			numerador=this.numerador-f2.getNumerador();
			denominador=this.denominador;
		}else {
			numerador=this.numerador*f2.getDenominador()-this.denominador*f2.getNumerador();
			denominador=this.denominador*f2.getDenominador();
		}
		Fraccion resultado=new Fraccion(numerador,denominador);
		return resultado;
	}
	public Fraccion multiplica(Fraccion f2) {
		int numerador=this.numerador*f2.getNumerador();
		int denominador=this.denominador*f2.getDenominador();
		Fraccion resultado=new Fraccion(numerador,denominador);
		return resultado;
	}
	public Fraccion divide(Fraccion f2) {
		Fraccion fraccionInvertida=new Fraccion (f2.getDenominador(),f2.getNumerador());
		Fraccion resultado=multiplica(fraccionInvertida);
		return resultado;
	}
	public Fraccion simplifica(Fraccion f1) {
		int mayor=f1.getNumerador(), divisorComun=0;
		if(mayor<f1.getDenominador()) {
			mayor=f1.getDenominador();
		}
		for(int i=1;i<mayor/2;i++) {
			if(f1.getNumerador()%i==0 && f1.getDenominador()%i==0) {
				divisorComun=i;
			}
		}
		int numSimple=f1.getNumerador()/divisorComun;
		int denSimple=f1.getDenominador()/divisorComun;
		Fraccion fraccionSimple=new Fraccion(numSimple,denSimple);
		return fraccionSimple;
	}
}
