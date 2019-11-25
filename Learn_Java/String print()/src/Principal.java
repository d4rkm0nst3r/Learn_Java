//Escribimos Cocodrilo en una sola linea del revés.

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo";
		for (int i=texto.length()-1; i>=0; i--) {
			System.out.print(texto.charAt(i));
		}
	}
}