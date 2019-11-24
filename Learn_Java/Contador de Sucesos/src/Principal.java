public class Principal {
	public static void main(String[] args) {
		int c=0;
		//Creamos el contador y lo inicializamos en 0.
		int mayor5=0;
		do {
			c=c+1;
			//Generamos un numero aleatorio hasta el 10.
			int azar=(int)(Math.random()*10+1);
			System.out.println(azar);
			//Si el numero generado es mayor que 5.
			if (azar>5) {
				//Se sumara al contador que hemos creado.
				mayor5=mayor5+1;
			}
		}
		while (c<10);
		System.out.println("Mayores de 5: " + mayor5);
	}
}