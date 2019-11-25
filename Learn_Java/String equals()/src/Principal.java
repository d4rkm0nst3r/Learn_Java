/*
El método equals() compara la cadena del objeto al que se aplica con otra cadena pasada como argumento.
 Si las dos cadenas son iguales devuelve true y si las dos cadenas son distintas devuelve false.
 
 El método equalsIgnoreCase() funciona igual que el método equals() con la diferencia de que no
  distingue entre mayúsculas y minúsculas.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "La cripta mágica";	
		System.out.println(texto);
		boolean iguales1 = texto.equals("LA CRIPTA MÁGICA");
		boolean iguales2 = texto.equalsIgnoreCase("LA CRIPTA MÁGICA");
		System.out.println(iguales1); // Muestra false, no son iguales
		System.out.println(iguales2); // Muestra true, son iguales
	}
}