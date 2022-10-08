package _06_vault;

import java.util.Random;

/**
 * 
 * A vault with a secret code
 *
 */
public class Vault {
	private int secret = new Random().nextInt(1000001);

	/**
	 * Tries to access the vault
	 * 
	 * @param guess the code being attempted
	 * @return true if the guess matches the code, false otherwise
	 * 
	 * A vault stands in the way of your progress. We need a secret agent to find the code to get through.


	1. You have been given a Vault class that describes how the vault will work. It has a secret code that will be randomly chosen each time the program is run.
	It also contains a tryCode() method that takes a number as a parameter and returns true if that number opens the vault, false otherwise.

	2. Create a Runner class with a main method. Create a vault object and call the tryCode() method. Print out the answer to see if you successfully opened the vault.

	3. Make a SecretAgent class that has a method findCode() that takes a Vault as a parameter.
	The codes are between 0 and 1 million. This method will try all the codes, and return the first code that opens the vault, or -1 if no code opened the vault.

	4. Add the SecretAgent object to main. Use a syso to print the result from findCode()


	 */
	public boolean tryCode(int guess) {
		return guess == secret;
	}
}
