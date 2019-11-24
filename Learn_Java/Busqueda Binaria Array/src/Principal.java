//Solo puede utilizarse en vectores ordenados.

public class Principal {
	public static void main(String[] args) {
		// Declaración del vector.
		String nombre[] = new String[10];
		
		// Inicialización de los valores del vector en orden alfabético.
		nombre[0] = "Alicia";
		nombre[1] = "Carlos";
		nombre[2] = "Carlota";
		nombre[3] = "Juan";
		nombre[4] = "Lucas";
		nombre[5] = "Luis";
		nombre[6] = "María";
		nombre[7] = "Pedro";
		nombre[8] = "Pepe";
		nombre[9] = "Rosa";
		
		// Búsqueda binaria
		String buscado = "Rosa";
		
		int inicio = 0;
		int fin = 9;
		int posicion = -1; 
		
		while (posicion==-1 && inicio <= fin) {
			int medio = (int)((inicio+fin)/2);
			if (nombre[medio].equals(buscado)) {
				posicion = medio;
			}
			else {
				if (buscado.compareTo(nombre[medio])<0)
					fin=medio-1;
				else
					inicio = medio+1;
			}
		}
		
		if (posicion > -1)
			System.out.println("Encontrado en posición "+posicion);
		else
			System.out.println("No encontrado");
		
	}
}