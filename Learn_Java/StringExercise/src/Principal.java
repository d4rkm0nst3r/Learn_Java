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
		//En may�sculas.
		System.out.println("May�scula: " + texto.toUpperCase());
		//M�todo split().
		System.out.println("Palabra a Palabra:");
		String[] subcadenas = texto.split(" ");
		for (int i=0; i<subcadenas.length; i++) {
			System.out.println(subcadenas[i]);
		}	//Contamos las letras minusculas.
			for (int k = 0; k < texto.length(); k++) {
			if (Character.isLowerCase(texto.charAt(k))) lowerCase++;
			}
			System.out.println("Hay " + lowerCase + " letras min�sculas.");
			//Creamos el triangulo.
			System.out.println("EL TRIANGULO");
			
			StringTokenizer creacion = new StringTokenizer("El se�or de los anillos-El se�or de los anillo-El se�or de los anill-El se�or de los anil-El se�or de los ani-El se�or de los an-El se�or de los an-El se�or de los a-El se�or de los -El se�or de los-El se�or de lo-El se�or de l-El se�or de -El se�or de-El se�or d-El se�or -El se�or-El se�o-El se�-El se-El s-El -El-E", "-");
			while (creacion.hasMoreTokens()) {
				//Con nextToken() va leyendo los tokens secuencialmente.
				String subcadena = creacion.nextToken();
				System.out.println(subcadena);
			}
		}
	}  
	

	
	
	


