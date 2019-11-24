public class Principal {
	public static void main(String[] args) {
		// Construcción de la matriz (vector de vectores).
		String plaza[][] = new String[10][7];
		
		// Primero rellenamos todas las plazas como libres.
		for (int f=0; f<plaza.length; f++) {
			for (int c=0; c<plaza[0].length; c++) {
				plaza[f][c]="libre";
			}
		}	
		
		// Ahora entran coches. 
		// Asigno a las plazas ocupadas la matricula correspondiente.
		plaza[1][0]="1234BJK";
		plaza[2][4]="9948LIP";
		plaza[3][1]="2345HPJ";
		plaza[4][3]="7654ABJ";
		plaza[6][0]="3395RJK";
		plaza[6][4]="3357BHA";
		plaza[7][2]="9954PRJ";
		plaza[8][6]="5594PJR";
		
		// Recorremos el array (las plazas).
		for (int f=0; f<plaza.length; f++) {
			for (int c=0; c<plaza[0].length; c++) {
				System.out.println("Plaza "+f+"."+c+
                            ": "+plaza[f][c]);
			}
		}
	}
}