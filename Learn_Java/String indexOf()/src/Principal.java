/*
El método indexOf() devuelve la posición que ocupa la primera ocurrencia del
 carácter especificado como argumento dentro de la cadena del objeto al que se aplica.
 Si el carácter no se encuentra dentro de la cadena devuelve -1.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo";
		int posicion = texto.indexOf('d');
		System.out.println(posicion); // Muestra 4
	}
}

//También puede utilizarse para localizar la posición de una subcadena en lugar de un solo carácter.

/*
public class Principal {
public static void main(String[] args) {
	String texto = "Cocodrilo";
	int posicion = texto.indexOf("ril"); // Muestra 5
	System.out.println(posicion);
}
}
*/