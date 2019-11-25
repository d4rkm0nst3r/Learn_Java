//El método codePointAt() devuelve el código ASCII
//asociado al carácter de la posición pasada como argumento.

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo";
		for (int i=0; i<texto.length(); i++) {
			System.out.println(texto.codePointAt(i));
		}
	}
}