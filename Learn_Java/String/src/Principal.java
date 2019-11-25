public class Principal {
	public static void main(String[] args) {
		String texto;
		//Usamos new para declarar un nuevo objeto de la clase string.
		texto = new String("La cripta mágica");	
		System.out.println(texto);
	}
}

/* Podemos declarar la referencia al objeto en la misma linea.
 * 
 * public class Principal {
	public static void main(String[] args) {
		String texto = new String("La cripta mágica");	
		System.out.println(texto);
	}
}

En el caso de los objetos de la clase string podemos omnitir la sentencia new.

public class Principal {
	public static void main(String[] args) {
		String texto = "La cripta mágica";	
		System.out.println(texto);
	}
}

*/
