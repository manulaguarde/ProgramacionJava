package ud4;
/*	Escribe la función CompruebaSudoku a la que le pasas un array de 9x9 enteros y te
	dice si el array contiene un sudoku correcto (devuelve un bool que será true si es
	correcto). Un sudoku será correcto si en cada fila, en cada columna y en cada
	submatriz de 3x3 aparecen todos los números del 1 al 9 y una sola vez cada uno.
	Se recomienda crear la función CompruebaArray19 al que le pasas un array de 9
	enteros y te dice si en él se encuentran todos los números del 1 al 9 una sola vez.
	Con esta función, sólo tendréis que pasar cada fila, columna y submatriz a un array de
	9 enteros y pasárselo a esta función para comprobar si está bien.
*/
public class HojaArraysBidimensionalesEjercicio21 {

	public static void main(String[] args) {
		int[][] sudoku = {
			    {5, 3, 4, 6, 7, 8, 9, 1, 2},
			    {6, 7, 2, 1, 9, 5, 3, 4, 8},
			    {1, 9, 8, 3, 4, 2, 5, 6, 7},

			    {8, 5, 9, 7, 6, 1, 4, 2, 3},
			    {4, 2, 6, 8, 5, 3, 7, 9, 1},
			    {7, 1, 3, 9, 2, 4, 8, 5, 6},

			    {9, 6, 1, 5, 3, 7, 2, 8, 4},
			    {2, 8, 7, 4, 1, 9, 6, 3, 5},
			    {3, 4, 5, 2, 8, 6, 1, 7, 9}
			};
		boolean comprueboFilas=true, comprueboColumnas=true;
		
		for(int k=0;k<9;k++) {
			for (int i=0;i<9;i++) {
				for (int j=1;j<9;j++) {
					if(sudoku[k][i]==sudoku[i][j]) {
						comprueboFilas=false;
					}
				}
				
			}
		}
		for(int k=0;k<9;k++) {
			for (int i=0;i<9;i++) {
				for (int j=1;j<9;j++) {
					if(sudoku[i][k]==sudoku[j][i]) {
						comprueboColumnas=false;
					}
				}
			}
		}
		if (comprueboFilas==true && comprueboColumnas==true) {
			System.out.println("Sudoku válido");
		}
		else {
			System.out.println("Sudoku no válido");
		}
	}

}
