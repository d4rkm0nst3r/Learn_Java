/*
El m�todo substring() extrae de la cadena principal una subcadena. Puede utilizarse
 de dos formas distintas. Si pasamos un n�mero entero como argumento, devuelve una
  subcadena a partir de la posici�n indicada en el argumento y hasta el final.
   Si pasamos dos n�meros enteros como argumentos, estos son interpretados como
    las posiciones de inicio y fin de la subcadena a extraer.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "La cripta m�gica";

		String cadena1 = texto.substring(3);
		String cadena2 = texto.substring(3, 8);
		System.out.println(cadena1); // Escribe "cripta m�gica".
		System.out.println(cadena2); // Escribe "cripta".
	}
}