public class Principal {
	public static void main(String[] args) {
		
		/* 
		  Construimos el array sin especificar número de columnas.
 		  Datos es un array que contiene referencias a otros arrays
 		  que tendrán que ser construidos en otro momento.
		 */
		int datos[][] = new int[5][];
		
		// Construcción arrays internos con longitudes diferentes.
		datos[0] = new int[4];
		datos[1] = new int[5];
		datos[2] = new int[8];
		datos[3] = new int[3];
		datos[4] = new int[9];
		
		// Rellenamos los elementos con números al azar entre 0 y 9.
		for (int f=0; f<datos.length; f++) {
			for (int c=0; c<datos[f].length; c++) {
				datos[f][c]= (int) (Math.random()*10);
			}
		}
		
		// Recorremos el array mostrando los valores en pantalla.
		for (int f=0; f<datos.length; f++) {
			for (int c=0; c<datos[f].length; c++) {
				System.out.print(datos[f][c]+" ");
			}
			System.out.println(); // Retorno de carro.
		}
	}	
}