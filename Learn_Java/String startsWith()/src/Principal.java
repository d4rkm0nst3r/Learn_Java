/*
 * Los métodos startsWith() y endsWith() comprueban si la cadena del objeto al que se aplican
 *  empieza o termina con la subcadena especificada como argumento.
 */

public class Principal {
	public static void main(String[] args) {
		String texto = "Cocodrilo";
		System.out.println(texto.startsWith("Coc")); // Muestra true
		System.out.println(texto.endsWith("lo")); // Muestra true
	}
}