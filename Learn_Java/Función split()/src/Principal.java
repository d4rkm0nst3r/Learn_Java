//La funci�n split() devuelve un array de objetos String que resulta de la divisi�n
//de la cadena del objeto al que se aplica en subcadenas divididas por elcar�cter
//especificado como argumento.

public class Principal {
	public static void main(String[] args) {
		String texto = "Hola-Hello-Hallo-Ciao-Ni hao-salut-ahoj";
		String[] subcadenas = texto.split("-");
		for (int i=0; i<subcadenas.length; i++) {
			System.out.println(subcadenas[i]);
		}
	}
}