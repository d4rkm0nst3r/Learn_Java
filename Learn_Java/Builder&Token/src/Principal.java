import java.util.Scanner;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {
		
		//Declaramos el scanner por teclado.
		Scanner leer = new Scanner(System.in);
		String texto=null;
		String resultado=null;
		//creamos el objeto StringBuilder.
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Introduzca textos:");
		//Creamos el primer escaner por teclado.
		texto=leer.nextLine();
		//Bucle while mientras el texto sea distinto a "FIN".
		while (!texto.equalsIgnoreCase("FIN")) {
			System.out.println("Introduzca textos:");
			System.out.println("El texto '" + texto + "' tiene " + texto.length() + " letras.");
			resultado += texto;
			//Añadimos con .append al objeto StringBuilder.
			sb.append(texto.toUpperCase());
			sb.append(";\n");
			texto=leer.nextLine();
			
			//Pruebas de que bucle meter en Tokenizer
		
			}
				System.out.println("Con StringBuilder:\n" + sb);
				
				StringTokenizer st = new StringTokenizer(resultado);
				System.out.println("Con StringTokenizer:");
			    while (st.hasMoreTokens()) {
			    System.out.println(st.nextToken());
				leer.close();
			}
		}
}
	


	
		
	
			
			
		
			