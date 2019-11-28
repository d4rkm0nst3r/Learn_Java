import java.util.Scanner;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		String texto;
		int lowerCase;
		lowerCase=0;
		
		System.out.println("Escribe un texto:");
		texto = lector.nextLine();
		//Longitud.
		System.out.println("Longitud: " + texto.length());
		//En mayúsculas.
		System.out.println("Mayúscula: " + texto.toUpperCase());
		//Método split().
		System.out.println("Palabra a Palabra:");
		String[] subcadenas = texto.split(" ");
		for (int i=0; i<subcadenas.length; i++) {
			System.out.println(subcadenas[i]);
		}	//Contamos las letras minusculas.
			for (int k = 0; k < texto.length(); k++) {
			if (Character.isLowerCase(texto.charAt(k))) lowerCase++;
			}
			System.out.println("Hay " + lowerCase + " letras minúsculas.");
			//Creamos el triangulo.
			System.out.println("EL TRIANGULO");
			
			StringTokenizer creacion = new StringTokenizer("El señor de los anillos-El señor de los anillo-El señor de los anill-El señor de los anil-El señor de los ani-El señor de los an-El señor de los an-El señor de los a-El señor de los -El señor de los-El señor de lo-El señor de l-El señor de -El señor de-El señor d-El señor -El señor-El seño-El señ-El se-El s-El -El-E", "-");
			while (creacion.hasMoreTokens()) {
				//Con nextToken() va leyendo los tokens secuencialmente.
				String subcadena = creacion.nextToken();
				System.out.println(subcadena);
			}
		}
	}  
	

	
	
	


