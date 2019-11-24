public class Principal {
	public static void main(String[] args) {
		
		// Creamos un array desordenado.
		String nombre[]=new String[5];
		nombre[0]="Lucas";
		nombre[1]="María";
		nombre[2]="Alicia";
		nombre[3]="Rosa";
		nombre[4]="Carlos";
		
		
		// Ordenamos por el método de la burbuja
		for (int i=0; i<=4; i++) {
			for (int j=0; j<=3; j++) {
				if (nombre[j].compareTo(nombre[j+1])>0) {
					String aux = nombre[j];
					nombre[j] = nombre[j+1];
					nombre[j+1] = aux;
				}
			}
		}
		
		// Muestra en pantalla los 5 nombres ya ordenados
		for (int i=0; i<=4; i++) {
			System.out.println(nombre[i]);
		}
		
	}
}