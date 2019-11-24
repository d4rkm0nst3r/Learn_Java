
public class Principal {

	public static void main(String[] args) {
		int dia=3;
		switch (dia) {
			case 1:
				System.out.println("Hoy es lunes");
				break;
			case 2:
				System.out.println("Hoy es martes");
				break;	
			case 3:
				System.out.println("Hoy es miércoles");
				break;		
			case 4:
				System.out.println("Hoy es Jueves");
				break;		
			case 5:
				System.out.println("Hoy es Viernes");
				break;		
			case 6:
				System.out.println("Hoy es Sábado");
				break;	
			case 7:
				System.out.println("Hoy es Domingo");
				break;		
			default:
				System.out.println("El número " + dia + 
					" no es un dia de la semana");
		}
	}
}

//Agrupación de evarios casos.
//public class Principal {
	//public static void main(String[] args) {
		//int valor=7;
		//switch(valor) {
		      //case 1:
   		      //case 2:
		      //case 3:
			      //System.out.println("El valor es 1, 2 o 3");
			      //break;
		      //case 4:
		      //case 5:
		      //case 6:
			      //System.out.println("El valor es 4, 5 o 6");
			      //break;
		      //case 7:
		      //case 8:
		      //case 9:
			      //System.out.println("El valor es 7, 8 o 9");
			      //break;
		      //default:
			      //System.out.println("El valor de mayor que 9");
		//}
	//}
//}

//Con string
//public class Principal {
	//public static void main(String[] args) {
		//String user = "Juan";
		
		//switch (user) {
			//case "Pepe":
				//System.out.println("Hola Pepe, eres bienvenido");
				//break;
			//case "Juan":
				//System.out.println("¿Qué pasa Juan?, adelante");
				//break;
			//case "Luis":
				//System.out.println("Hola Luis, quieres jugar al ajedrez");
				//break;
			//default:
				//System.out.println("Lo siento "+user+" no puedes pasar");
		//}
	//}
//}

