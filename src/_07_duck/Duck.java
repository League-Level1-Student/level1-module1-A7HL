package _07_duck;

public class Duck {
	private int numberOfFriends;
	private String favoriteFood;
	
	public Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	public void quack() {
		
	}
	public void waddle() {
		
	}
	public int getFr() {
		return numberOfFriends;
	}
	public String fetFud() {
		return favoriteFood;
	}
}
	class Rabbit{
		private String occupation;
		private String accessory;
		
		public Rabbit(String a, String b) {
			this.occupation = a;
			this.accessory =b;
		}
		public String getC() {
			return occupation;
		}
		public String getB() {
			return accessory;
		}
		public void greeting() {
		System.out.println("Hiya-peko! Hiya-peko! Hiya-pekooo! I'm Usada Pekora, peko");
		}
	}
	
	
	/*
	 * int numberOfFriends
	 * String favoriteFood
	 * void quack()
	 * void waddle()
	 * 1. Create a Duck class in your java project. Add its member variables and methods to match the picture above. Now add the code for the constructor of the Duck class:


Duck(String favoriteFood, int numberOfFriends) {
       this.favoriteFood = favoriteFood;
       this.numberOfFriends = numberOfFriends;
}

2. Now pick your favorite animal and describe it with at least 2 member variables and 2 methods.
	fox
3. Create a java class for your animal including:

      member variables
      methods(with sysouts)
      a constructor that sets the member variables
      

4. Create a new java class. This will be a "runner" or "driver" class, so it will need a main method.

5. In your runner class, create a Duck object (instance) by calling its constructor as follows:

Duck daffy = new Duck("donuts",5);

      Now you have a duck object, you can make it quack:

daffy.quack();

6. Now create an instance of your animal (Hint: see step 5 above) and call its methods.

	*/