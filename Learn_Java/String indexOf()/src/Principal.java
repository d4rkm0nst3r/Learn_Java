/*
El m�todo indexOf() devuelve la posici�n que ocupa la primera ocurrencia del
 car�cter especificado como argumento dentro de la cadena del objeto al que se aplica.
 Si el car�cter no se encuentra dentro de la cadena devuelve -1.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo";
		int posicion = texto.indexOf('d');
		System.out.println(posicion); // Muestra 4
	}
}

//Tambi�n puede utilizarse para localizar la posici�n de una subcadena en lugar de un solo car�cter.

/*
public class Principal {
public static void main(String[] args) {
	String texto = "Cocodrilo";
	int posicion = texto.indexOf("ril"); // Muestra 5
	System.out.println(posicion);
}
}
*/