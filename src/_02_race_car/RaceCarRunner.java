package _02_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar car = new RaceCar("Renault",5);
		// 2. Print the RaceCar's position in the race
		System.out.println("Place: " + car.getPositionInRace()+"th");
		// 3. Crash the RaceCar
		car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		car.pit();
		// 5. Help the car move into first place.
		while(true) {
			if(car.getPositionInRace()>1) {
				car.overtake();
			}
		}
		}
		
	}
