/*
Al construir un nuevo objeto de la clase StringTokenizer pasamos dos argumentos,
 el primero es la cadena de texto que queremos dividir y el segundo es el delimitador.
*/

//Con esta l�nea hemos importado la clase StringTokenizer del paquete java.util,
//que es donde se encuentra la librer�a que la contiene.

import java.util.StringTokenizer;

public class Principal {
	public static void main(String[] args) {
		StringTokenizer texto = new StringTokenizer("Hola-Hello-Hallo-Ciao-Ni hao-salut-ahoj", "-");
		System.out.println("N�mero de tokens: " + texto.countTokens());
		while (texto.hasMoreTokens()) {
			//Con nextToken() va leyendo los tokens secuencialmente.
			String subcadena = texto.nextToken();
			System.out.println(subcadena);
		}
	}
}

//El m�todo countTokens() devuelve el n�mero de tokens que tiene la cadena.