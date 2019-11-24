//Recordar sucesos.
public class Principal {
	public static void main(String[] args) {
		int c=0;
		boolean sw=false;
		do {
			c=c+1;
			int azar = (int)(Math.random()*10+1);
			System.out.println(azar);
			if (azar==10) {
				sw=true;
			}
		} while (c<10);
		System.out.println("¿Se ha encontrado un 10? "+sw);
	}
}
//Para hacer que 2 acciones se ejecuten alternativamente dentro de un bucle.
//public class Principal {
	//public static void main(String[] args) {
		//int c=0;
		//int sw=-1;
		//do {
			//c=c+1;
			//sw=-sw;
			//if (sw==1) {
				//System.out.println("Hola");
			//}
			//else {
				//System.out.println("Adiós");
			//}
		//}
		//while (c<10);
	//}
//}