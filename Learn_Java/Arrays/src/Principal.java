public class Principal {
	public static void main(String[] args) {
		int valor[];
		valor = new int[4];
		
		valor[0]=3;
		valor[1]=7;
		valor[2]=25;
		valor[3]=12;
		
		int numeros[] = valor;
		numeros[2]=252;
		
		System.out.println(valor[2]);
	}
}

//Declarar Vector en Java:

//String nombre[] = new String[10];
//String []nombre = new String[10];
//Para acceder al elemento 7: nombre[7]


//Declarar matriz en Java:
//String plaza[][] = new String[10][7];
//String [][]plaza = new String[10][7];
//Para acceder a un elemento: plaza[4][3]


//Declarar cubo en Java:
//String plaza[][][] = new String[10][7][3];
//String [][][]plaza = new String[10][7][3];
//Para acceder a un elemento del cubo: plaza[4][3][0]


//Declarar Array de 4 dimensiones:
//String plaza[][][][] = new String[10][7][5][3];
//String [][][][]plaza = new String[10][7][5][3];
//Para acceder a un elemento: plaza[4][3][2][1]
