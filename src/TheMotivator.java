
public class TheMotivator {
	public void feedback(int score) {
		if (score == 98)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Maybe you should study more next time.");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(97);
		TheInsultor ti = new TheInsultor();
		ti.feedback(40);
	}
}
