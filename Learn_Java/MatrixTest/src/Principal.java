//Importamos la clase Scanner para poderla utilizar.
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String matrizIngles[][] = {
				{"bear", "oso"},
				{"cat", "gato"},
				{"cheetah", "guepardo"},
				{"dog", "perro"},
				{"eagle", "aguila"},
				{"fish", "pez"},
				{"frog", "rana"},
				{"horse", "caballo"},
				{"lion", "leon"},
				{"lizard", "lagarto"},
				{"meerkat", "suricata"},
				{"monkey", "mono"},
				{"orangutan", "orangután"},
				{"panther", "pantera"},
				{"parrot", "loro"},
				{"pig", "cerdo"},
				{"tiger", "tigre"},
				{"toad", "sapo"},
				{"tortoise", "tortuga"},
				{"yegua", "mare"}
		};	
			Scanner respuesta = new Scanner(System.in);
			int acumcorrect;
			int acumincorrect;
			String traduccion;
			
			acumcorrect=0;
			acumincorrect=0;
			
			System.out.println("-Test de traducción de 20 palabras-");
			//Creamos el nuevo objeto Scanner y le pasamos de argumento introducción por teclado.
			
			for (int i=0; i<matrizIngles.length; i++) {
				System.out.println("Traduce " + matrizIngles[i][0] + ":");
				traduccion = respuesta.nextLine();
				if (traduccion.equalsIgnoreCase(matrizIngles[i][1]) == true) {
					System.out.println("Bien!");
					acumcorrect++;
				}
				else {
					System.out.println("No, es " + matrizIngles[i][1]);
					acumincorrect++;
				}
			}
			if (acumcorrect>=20) {
				System.out.println("ENHORABUENA!");
			}
			else {
				if (acumcorrect<=5) {
					System.out.println("Tienes que estudiar mas");
				}
			}
			respuesta.close();
			
			System.out.println("Has finalizado el test.");
			System.out.println("Has tenido " + acumcorrect + " aciertos.");
			System.out.println("Has tenido " + acumincorrect + " fallos.");
		}
	}


	




	

	