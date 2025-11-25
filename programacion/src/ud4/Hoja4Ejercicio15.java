package ud4;

/*
 * Que pinte un tablero de ajedrez, los peones con la letra P, las torres con T, los
 * caballos con C, los alfiles con A, el rey con R y la reina con M.
 */


public class Hoja4Ejercicio15 {

	public static void main(String[] args) {
		char[][] tablero= new char[8][8];
		//inicializamos tablero vacio
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				tablero[i][j]=' ';
			}
		}
		
		tablero[0][0]='T';
		tablero[0][1]='C';
		tablero[0][2]='A';
		tablero[0][3]='M';
		tablero[0][4]='R';
		tablero[0][5]='A';
		tablero[0][6]='C';
		tablero[0][7]='T';
		
		for (int i=0;i<8;i++) {
			tablero[7][i]=tablero[0][i];
		}
		for (int i=0;i<8;i++) {
			tablero[1][i]='P';
			tablero[6][i]='P';
		}
		System.out.println("---------------------------------");
		int i=0;
		for (int fila=0;fila<8;fila++) {
			for(int columnas=0;columnas<8;columnas++) {
				System.out.print("| "+tablero[i][columnas]+" ");
			}
			System.out.println("|\n---------------------------------");
			i++;
		}
		

	}

}
