//El m�todo codePointAt() devuelve el c�digo ASCII
//asociado al car�cter de la posici�n pasada como argumento.

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo";
		for (int i=0; i<texto.length(); i++) {
			System.out.println(texto.codePointAt(i));
		}
	}
}