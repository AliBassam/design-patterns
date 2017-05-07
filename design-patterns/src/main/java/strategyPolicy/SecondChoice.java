package strategyPolicy;

/**
 * This is a variety of the IChoice interface, we can customize the action
 * inside it, and assign it to any main class we like
 * 
 * @author ali
 * 
 */
public class SecondChoice implements IChoice {

	public void myChoice(String s1, String s2) {
		System.out.println("****Second Choice****");
		System.out.println("Separate " +s1+ "," + s2);
	}

}
