package day01.practice;

public class Cat {

//	attributes
	private boolean hasDots;
	private String color;
	
//	constructor 
	public Cat(boolean hasDots, String color) {
		
		this.hasDots = hasDots;
		this.color = color;
	}

	 // Getters and setters
	public boolean isHasDots() {
		return hasDots;
	}

	public void setHasDots(boolean hasDots) {
		this.hasDots = hasDots;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String speak() {
		
		return "Meow!";
	}
	
	
//	Main method to create cat objects
	public static void main(String[] args) {
		
//		create two cat objects
		Cat cat1 = new Cat(true, "Black");
		Cat cat2 = new Cat(false, "Brown");
		
//		print the attributes of each dog
		System.out.println("Cat 1:");
		System.out.println("Has Dots: "+ cat1.isHasDots());
		System.out.println("Color: "+ cat1.getColor());
		System.out.println("Speaks: "+cat1.speak());
		
		System.out.println("Cat 2:");
		System.out.println("Has Dots: "+ cat2.isHasDots());
		System.out.println("Color: "+ cat2.getColor());
		System.out.println("Speaks: "+ cat2.speak());
		
		
	}
	
	
}
