package KittieFabric;

public class Kitties {
	private String catRace;
	private String catColor;
	private String eyeColor;
	private String favouriteFood;
	private int catMood = 0;
	public static int NumberOfCats = 0;
	
	protected void finalize() {
		System.out.println("The cat have a new family!");
	}
	
	public Kitties(String catRace, String catColor, String eyeColor, String favouriteFood) {
		this.catRace = catRace;
		this.catColor = catColor;
		this.eyeColor = eyeColor;
		this.favouriteFood = favouriteFood;
		NumberOfCats++;
	}
	
	public Kitties(String catColor) {
		this.catRace = "Cheshire";
		this.catColor = "Blue";
		this.eyeColor = "Magic GreenBlue";
		this.favouriteFood = "Worms";
		NumberOfCats++;
	}

	public Kitties() {
		this.catRace = "Persa";
		this.catColor = "White";
		this.eyeColor = "Green";
		this.favouriteFood = "Pizza";
		NumberOfCats++;
	}
	
	public void GiveLoveToCat() {
		this.catMood = this.catMood + 1;
	}
	
	public void GiveLoveToCat(int cuant) {
		this.catMood = this.catMood + cuant;
	}
	
	public void AdoptOneKitten() { 
		NumberOfCats++;
	}
	
	public String InfoKitties() {
		return "Is a " + this.catRace + " cat " + "with " + this.catColor + " hair," + this.eyeColor + " color eyes, and his favourite food is " + this.favouriteFood;
	}
	
	
}
