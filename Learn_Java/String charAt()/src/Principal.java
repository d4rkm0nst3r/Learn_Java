/*
El método charAt() devuelve el carácter que ocupa la posición indicada en el argumento.
 El primer carácter ocupa la posición 0.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo";
		System.out.println(texto.charAt(0)); // Muestra C
		System.out.println(texto.charAt(3)); // Muestra o
	}
}

//Con ayuda de una estructura for y el método length()
//podemos recorrer todos los elementos de la cadena.

/*
public class Principal {
public static void main(String[] args) {
	String texto = "Cocodrilo";
	for (int i=0; i<texto.length(); i++) {
		System.out.println(texto.charAt(i));
	}
}
}
*/