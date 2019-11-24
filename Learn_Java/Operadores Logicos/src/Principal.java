
public class Principal {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		boolean evaluacion;
		
		//El resultado final sera verdadero si las 2 son verdaderas.
		evaluacion = a>b && b>1;
		System.out.println(evaluacion); // Resultado falso
		
		//El resultado final sera verdadero mientras una sea verdadera.
		evaluacion = a>b || b>1;
		System.out.println(evaluacion); // Resultado verdadero
		
		//Se aplica a 1 solo operando y cambia su valor al opuesto.
		evaluacion = !(a>b);
		System.out.println(evaluacion); // Resultado verdadero 
		// a>b es falso, luego !(a>b) es verdadero
	}
}
