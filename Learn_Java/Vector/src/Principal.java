public class Principal {
	public static void main(String[] args) {
		
		// Declaraci�n del vector.
		String nombre[] = new String[10];
		
		// Inicializaci�n de los valores del vector.
		nombre[0] = "Pepe";
		nombre[1] = "Juan";
		nombre[2] = "Luis";
		nombre[3] = "Alicia";
		nombre[4] = "Rosa";
		nombre[5] = "Carlos";
		nombre[6] = "Pedro";
		nombre[7] = "Lucas";
		nombre[8] = "Mar�a";
		nombre[9] = "Carlota";
		
		// Recorrido del vector.
		for (int i=0; i<nombre.length; i++) {
			System.out.println(nombre[i]);
		}	
	}
}

//public class Principal {
	//public static void main(String[] args) {
		// Declaraci�n del vector.
		//String nombre[] = {"Pepe", "Juan", "Luis", "Alicia", "Rosa"};
		
		// Recorrido del vector.
		//for (int i=0; i<nombre.length; i++) {
			//System.out.println(nombre[i]);
		//}
	//}
//}