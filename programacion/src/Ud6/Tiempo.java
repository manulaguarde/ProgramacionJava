package Ud6;

public class Tiempo {
	//atributos
	private int hora, minuto, segundo;
	
	//Métodos constructores
	//---------------------------------
		public Tiempo(int h, int m, int s) {
			//Comprobación de hora
			if(h<0 || h>23) {
				hora=0;
			}
			else {
				hora=h;
			}
			//Comprobación de minuto
			if(m<0 || m>59) {
				minuto=0;
			}
			else {
				minuto=m;
			}
			
			//Comprobación de segundo
			if(s<0 || s>59) {
				segundo=0;
			}
			else {
				segundo=s;
			}
		}
	/*public Tiempo(int h, int m, int s) {
		setHora(h);
		
		setMinuto(m);
		
		setSegundo(s);
	}*/
	
	
	//---------------------------------
	/*public Tiempo(int h, int m) {
		//Comprobación de hora
		if(h<0 || h>23) {
			hora=0;
		}
		else {
			hora=h;
		}
		
		//Comprobación de minuto
		if(m<0 || m>59) {
			minuto=0;
		}
		else {
			minuto=m;
		}
		
		segundo=0;
	}*/
	
	public Tiempo(int h, int m) {
		this(h,m,0);
		//Es posible llamar al método constructor desde otro método, esto nos permite convertir el 
		//código en algo más legible
		//this, llama a un método que está dentro de esa misma clase
	}
	
	
	//---------------------------------
		public Tiempo(int h) {
			//Comprobación de hora
			if(h<0 || h>23) {
				hora=0;
			}
			else {
				hora=h;
			}
			
			minuto=0;
			segundo=0;
		}
	
	//Getters
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	//Setters
	public void setHora(int h) {
		if(h<0 || h>23) {
			hora=h;
		}
		else {
			hora=0;
		}
	}
	
	public void setMinuto(int m) {
		if(m<0 || m>59) {
			minuto=m;
		}
		else {
			minuto=0;
		}
	}
	
	public void setSegundo(int s) {
		if(s<0 || s>59) {
			segundo=s;
		}
		else {
			segundo=0;
		}
	}
	
	public String toString() {
		String horaCompleta=hora+":"+minuto+":"+segundo;
		return horaCompleta;		
	}
	
	public String anyadeUnSegundo() {
		String horaSegAnyadido="";
		
		
		
		return horaSegAnyadido;
	}
}
