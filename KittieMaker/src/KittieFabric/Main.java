package KittieFabric;

public class Main {

	public static void main(String[] args) {
		Kitties Tom = new Kitties();
		Kitties Levi = new Kitties("Australian", "Black", "Red", "Waffles");
		Kitties Cheshire = new Kitties("Blue");
		Kitties Bastian = new Kitties("Germany", "Silver", "Golden", "Meat");
		
		System.out.println("LIST OF VIRTUAL CATS:");
		
		System.out.println(Tom.InfoKitties());
		System.out.println(Levi.InfoKitties());
		System.out.println(Cheshire.InfoKitties());
		System.out.println(Bastian.InfoKitties());
		
		System.out.println("The program was breed " + Kitties.NumberOfCats + " kittens. :)");

		Tom = null;
		Levi = null;
		Cheshire = null;
		Bastian = null;
		
		Runtime garbage = Runtime.getRuntime();
		
		garbage.gc();
	}
}


