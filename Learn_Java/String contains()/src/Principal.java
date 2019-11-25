/*
El método contains() devuelve true si la cadena del objeto al que se aplica contiene
 la subcadena especificada en el argumento.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo";
		System.out.println(texto.contains("dri")); // Muestra true
		System.out.println(texto.contains("pot")); // Muestra false
	}
}