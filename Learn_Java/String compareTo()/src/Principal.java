/*
El método compareTo() compara la cadena del objeto a la que se aplica con la cadena pasada como argumento.
 Si son iguales devuelve 0, si la primera cadena es menor que la segunda devuelve un número negativo,
  y si la primera cadena es mayor que la segunda devuelve un número positivo.
 El método compareToIgnoreCase() funciona igual pero no distingue entre mayúsculas y minúsculas.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "Pepe";
		System.out.println(texto.compareTo("Pepe")); // Muestra 0 ya que "Pepe" = "Pepe"
		System.out.println(texto.compareTo("Rosa")); // Muestra -2 ya que "Pepe" < "Rosa"
		System.out.println(texto.compareTo("Alicia")); // Muestra 15 ya que "Pepe" > "Alicia"
	}
}