//Escalera IF ELSE
public class Principal {

	public static void main(String[] args) {
		int edad = 18;
		if (edad<13) {
			System.out.println("Infantil");
		}
		else {
			if (edad<18) {
				System.out.println("Adolescente");
			}
			else {
				if (edad<40) {
					System.out.println("Joven mayor de edad");
				}
				else {
					if (edad<65) {
						System.out.println("Adulto mayor de edad");
					}
					else {
						System.out.println("Jubilado");
					}
				}
			}
		}
	}
}

//Simplificación de IF ELSE
//int edad = 12;
//if (edad<13) {
	//System.out.println("Infantil");
//}
//else if (edad<18){
	//System.out.println("Adolescente");
//}
//else if (edad<40) {
	//System.out.println("Joven mayor de edad");
//}
//else if (edad<65) {
	//System.out.println("Adulto mayor de edad");
//}
//else {
	//System.out.println("Jubilado");
//}
