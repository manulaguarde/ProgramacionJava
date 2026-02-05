package tresEnRaya;

public class TresEnRaya {

	private int[][] posiciones;
	
	public TresEnRaya(){
		this.posiciones=new int[3][3];
	}
	public void mueveJugador1(int pos) {
		int i;
		if(pos<=3) {
			i=0;
			for(int j=0;j<3;j++) {
				if(j==pos-1) {
					posiciones[i][j]=1;
				}
			}
		}else if(pos<=6 && pos >3) {
			i=1;
			for(int j=0;j<3;j++) {
				if(j==pos-4) {
					posiciones[i][j]=1;
				}
			}
		}
		else {
			i=2;
		}
		
	}
	public void dibujaTablero() {
		System.out.println("-------------");
		for (int filas = 0; filas < 3; filas++) {
			for (int columnas = 0; columnas < 3; columnas++) {
				System.out.print("| " + " " + " ");
			}
			System.out.println("|\n-------------");

		}
	}
}
