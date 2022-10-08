package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		/* Your mission and you have to accept it:
		 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
		 * The main method should create a bag of Popcorn and cook it in the microwave.
		 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
		 * Don't change the existing methods.
		 * 
		 */
		String popcorn = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		String time = JOptionPane.showInputDialog("How many minutes in the microwave?");
		int min = Integer.parseInt(time);
		Popcorn pop = new Popcorn(popcorn);
		 Microwave micro = new Microwave();
		 micro.putInMicrowave(pop);
		 micro.setTime(min);
		 micro.startMicrowave();
		 
		
	}
}
