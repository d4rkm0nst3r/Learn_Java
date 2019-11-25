/*
El m�todo equals() compara la cadena del objeto al que se aplica con otra cadena pasada como argumento.
 Si las dos cadenas son iguales devuelve true y si las dos cadenas son distintas devuelve false.
 
 El m�todo equalsIgnoreCase() funciona igual que el m�todo equals() con la diferencia de que no
  distingue entre may�sculas y min�sculas.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "La cripta m�gica";	
		System.out.println(texto);
		boolean iguales1 = texto.equals("LA CRIPTA M�GICA");
		boolean iguales2 = texto.equalsIgnoreCase("LA CRIPTA M�GICA");
		System.out.println(iguales1); // Muestra false, no son iguales
		System.out.println(iguales2); // Muestra true, son iguales
	}
}