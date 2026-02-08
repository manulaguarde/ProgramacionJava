package tresEnRaya;

import java.util.Random;

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
			for(int j=0;j<3;j++) {
				if(j==pos-7) {
					posiciones[i][j]=1;
				}
			}
		}
		
	}

	public void mueveJugador2(int pos) {
		int i;
		if(pos<=3) {
			i=0;
			for(int j=0;j<3;j++) {
				if(j==pos-1) {
					posiciones[i][j]=2;
				}
			}
		}else if(pos<=6 && pos >3) {
			i=1;
			for(int j=0;j<3;j++) {
				if(j==pos-4) {
					posiciones[i][j]=2;
				}
			}
		}
		else {
			i=2;
			for(int j=0;j<3;j++) {
				if(j==pos-7) {
					posiciones[i][j]=2;
				}
			}
		}
		
	}
	public boolean movimientoValido(int pos) {
		int i;
		
		if(pos<1 || pos>9) 
			return false;
		if(pos<=3) {
			i=0;
			for(int j=0;j<3;j++) {
				if(j==pos-1) {
					if(posiciones[i][j]==0)
						return true;
				}
			}
		}else if(pos<=6 && pos >3) {
			i=1;
			for(int j=0;j<3;j++) {
				if(j==pos-4) {
					if(posiciones[i][j]==0)
						return true;
				}
			}
		}
		else {
			i=2;
			for(int j=0;j<3;j++) {
				if(j==pos-7) {
					if(posiciones[i][j]==0)
						return true;
				}
			}
		}
		return false;
		
	}
	public void dibujaTablero() {
		System.out.println("-------------");
		for (int filas = 0; filas < 3; filas++) {
			for (int columnas = 0; columnas < 3; columnas++) {
				if(posiciones[filas][columnas]==1)
					System.out.print("| X ");
				else if(posiciones[filas][columnas]==2)
					System.out.print("| O ");
				else
					System.out.print("|   ");
			}
			System.out.println("|\n-------------");

		}
	}
	public boolean ganaJugador1() {
		int cont=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(posiciones[i][j]==1) {
					cont++;
				}
			}
			if(cont==3) {
				return true;
			}else {
				cont=0;
			}
		}
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				if(posiciones[i][j]==1) {
					cont++;
				}
			}
			if(cont==3) {
				return true;
			}
			else {
				cont=0;
			}
		}
		if(posiciones[0][0]==1 && posiciones[1][1]==1 && posiciones[2][2]==1)
			return true;
		if(posiciones[0][2]==1 && posiciones[1][1]==1 && posiciones[2][0]==1)
			return true;
		
		return false;

	}

	// Comprueba si gana el jugador 2
	public boolean ganaJugador2() {
		int cont=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(posiciones[i][j]==2) {
					cont++;
				}
			}
			if(cont==3) {
				return true;
			}else {
				cont=0;
			}
		}
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				if(posiciones[i][j]==2) {
					cont++;
				}
			}
			if(cont==3) {
				return true;
			}
			else {
				cont=0;
			}
		}
		if(posiciones[0][0]==2 && posiciones[1][1]==2 && posiciones[2][2]==2)
			return true;
		if(posiciones[0][2]==2 && posiciones[1][1]==2 && posiciones[2][0]==2)
			return true;
		
		return false;
		/*// Victorias horizontales
		if (tablero[0] == ficha2 && tablero[1] == ficha2 && tablero[2] == ficha2) {
			return true;
		}
		if (tablero[3] == ficha2 && tablero[4] == ficha2 && tablero[5] == ficha2) {
			return true;
		}
		if (tablero[6] == ficha2 && tablero[7] == ficha2 && tablero[8] == ficha2) {
			return true;
		}
		// Victorias verticales
		if (tablero[0] == ficha2 && tablero[3] == ficha2 && tablero[6] == ficha2) {
			return true;
		}
		if (tablero[1] == ficha2 && tablero[4] == ficha2 && tablero[7] == ficha2) {
			return true;
		}
		if (tablero[2] == ficha2 && tablero[5] == ficha2 && tablero[8] == ficha2) {
			return true;
		}
		// Victorias en diagonal
		if (tablero[0] == ficha2 && tablero[4] == ficha2 && tablero[8] == ficha2) {
			return true;
		}
		if (tablero[2] == ficha2 && tablero[4] == ficha2 && tablero[6] == ficha2) {
			return true;
		}

		return false;*/
	}
	public boolean quedanCasillas() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(posiciones[i][j]==0) {
					return true;
				}
			}
		}
		return false;
	}
	public void mueveOrdenador1() {
		Random genAle=new Random();
		int i=genAle.nextInt(3);
		int j=genAle.nextInt(3);
		posiciones[i][j]=1;
	}
	public void mueveOrdenador2() {
		Random genAle=new Random();
		int i=genAle.nextInt(3);
		int j=genAle.nextInt(3);
		posiciones[i][j]=2;
	}
	public void Iniciar() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				posiciones[i][j]=0;
			}
		}
	}
}
