/*
La expresión texto.replace('a', 'e') devuelve una nueva cadena que resulta de sustituir
 en texto todos los caracteres 'a' por 'e'.Puede aplicarse también a subcadenas, con lo 
 que funcionaría igual que replaceAll().

La expresión texto.replaceFirst("gato", "perro") devuelve una nueva cadena que resulta
 de sustituir en texto la primera ocurrencia de la subcadena "gato" por la subcadena "perro".

La expresión texto.replaceAll("gato", "perro") devuelve una nueva cadena que resulta de sustituir
 todas las ocurrencias de la subcadena "gato" por la subcadena "perro".
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "Este gato es un gato persa que se come la comida de mi gato";
		String cadena1 = texto.replace('a', 'e');
		String cadena2 = texto.replaceFirst("gato", "perro");
		String cadena3 = texto.replaceAll("gato", "perro");
		System.out.println(cadena1); // Muestra "Este geto es un geto perse que se come le comide de mi geto"
		System.out.println(cadena2); // Muestra "Este perro es un gato persa que se come la comida de mi gato"
		System.out.println(cadena3); // Muestra "Este perro es un perro persa que se come la comida de mi perro"
		
	}
}