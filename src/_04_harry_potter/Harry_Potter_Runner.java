package _04_harry_potter;

public class Harry_Potter_Runner {
	public static void main(String[] args) {
		HarryPotter RonWeasley = new HarryPotter();
		RonWeasley.makeInvisible(true);
		RonWeasley.spyOnSnape();
		RonWeasley.makeInvisible(false);
		RonWeasley.castSpell("Stupefy");
		
	}
}
