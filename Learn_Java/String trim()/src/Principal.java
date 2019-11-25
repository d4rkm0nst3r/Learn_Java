/*
El método trim() devuelve una nueva cadena que resulta de recortar en la cadena original
 los espacios en blanco que haya al principio y al final.
*/

public class Principal {
	public static void main(String[] args) {
		String texto = "              La cripta mágica         ";

		System.out.println("--"+texto+"--");
		System.out.println("--"+texto.trim()+"--");
	}
}