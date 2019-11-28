import java.util.Scanner;

public class Principal {

              public static void main(String[] args) {
            	  			//La clase Scanner sirve para construir objetos que representan flujos
            	  			//de datos de entrada o lectura. En este caso hemos creado el objeto pasando como
            	  			//argumento System.in (flujo de entrada por teclado).
                            Scanner lector = new Scanner(System.in);
                            
                            String nombre;

                            System.out.println("¿Cómo te llamas? ");
                            //Permite al usuario introducir una línea de texto por teclado y la almacena en la variable nombre.
                            nombre = lector.nextLine();

                            System.out.println("Hola "+nombre);
                            //Debemos cerrar el objeto Scanner cuando ya no lo necesitemos.
                            lector.close();

               }

}