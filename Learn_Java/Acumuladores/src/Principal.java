public class Principal {
	public static void main(String[] args) {
		//Si usamos el acumulador sumando lo niciamos a 0.
		int suma=0;
		//Pero si lo usamos multiplicando lo iniciamos a 1.
		long prod=1;
		//Creamos un contador de control de bucle.
		int c=8;
		do {
			c = c + 2;
			suma = suma + c;
			prod = prod * c;
		}
		while (c<30);
		System.out.println("Suma: " + suma);
		System.out.println("Producto: " + prod);
	}
}