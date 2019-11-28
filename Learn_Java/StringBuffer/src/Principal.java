/*
La clase StringBuffer funciona exactamente igual que la clase StringBuilder.
 La diferencia es que sus objetos son sincronizados, lo que significa que 
 son más seguros para trabajar en aplicaciones multitarea.
*/

public class Principal {
	public static void main(String[] args) {
		StringBuffer texto1 = new StringBuffer("El perro de Roque no tiene rabo ");
		
		texto1.append("porque Ramon Ramirez se lo ha robado"); // Añadir al final.
		System.out.println(texto1);
		
		texto1.delete(45, 53); // Eliminamos la subcadena Ramirez.
		System.out.println(texto1);
		
		texto1.insert(45, "Pérez "); // Insertar en la posición indicada.
		System.out.println(texto1);
	}
}

/*
Todo funciona igual, ¿verdad? Sin embargo, si no vamos a trabajar con hilos y concurrencia,
 deberías seguir utilizando StringBuilder.

La concurrencia es una propiedad de algunos programas que tienen la capacidad de permitir
 la ejecución simultanea de varios procesos. Incluso es posible que los procesos que se ejecutan
  simultáneamente puedan comunicarse entre sí.
*/