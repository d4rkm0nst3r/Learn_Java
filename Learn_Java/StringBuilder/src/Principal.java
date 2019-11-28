//Diferencias entre String y StringBuilder:

/*
Para construir un objeto StringBuilder tienes que usar el operador new, mientras que con String se puede omitir.

Los objetos de la clase String son inmutables, mientras que los objetos de la clase StringBuilder son mutables.

Los objetos de la clase String, al ser inmutables, no cambian su tamaño. Un objeto StringBuilder cambia su tamaño
 de almacenamiento en la memoria RAM para adaptarse a los cambios que va sufriendo.
*/

/*
Pero, ¿qué es un objeto mutable?

Se dice que un objeto es mutable cuando al utilizar sus métodos cambiamos su estado, es decir, el valor de sus propiedades.
 En el caso de un objeto StringBuilder es mutable porque sus métodos cambian el texto original con que se construyó. Sin embargo,
  los métodos de un objeto String no modifican el texto que representa.
*/

public class Principal {
	public static void main(String[] args) {
		StringBuilder texto1 = new StringBuilder("El perro de Roque no tiene rabo ");
		
		texto1.append("porque Ramon Ramirez se lo ha robado"); // Añadir al final.
		System.out.println(texto1);
		
		texto1.delete(45, 53); // Eliminamos la subcadena Ramirez.
		System.out.println(texto1);
		
		texto1.insert(45, "Pérez "); // Insertar en la posición indicada.
		System.out.println(texto1);
	}
}