/*
El método concat() devuelve una nueva cadena, que es el resultado de concatenar la cadena del objeto
 al que se aplica con la cadena pasada como argumento.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo ";
		String texto2 = texto.concat("Dundee");
		System.out.println(texto2); // Muestra Cocodrilo Dundee
	}
}