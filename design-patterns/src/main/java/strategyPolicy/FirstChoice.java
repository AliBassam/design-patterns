package strategyPolicy;

/**
 * This is a variety of the IChoice interface, we can customize the action
 * inside it, and assign it to any main class we like
 * 
 * @author ali
 * 
 */
public class FirstChoice implements IChoice {

	public void myChoice(String s1, String s2) {
		System.out.println("****First Choice****");
		System.out.println("Concatenate " + s1 + s2);
	}

}
