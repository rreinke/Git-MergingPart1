
public class TheInsultor {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You obviously need to challenge yourself with a harder class.");
		else if (score > 90)
			System.out.println("Were you asleep during the exam?");
		else if (score > 60)
			System.out.println("Really?");
		else
			System.out.println("I have nothing to say to you");
	}
	
}
