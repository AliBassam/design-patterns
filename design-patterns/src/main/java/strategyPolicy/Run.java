package strategyPolicy;

/**
 * Define a family of algorithms, encapsulate each one, and make them
 * interchangeable. The strategy pattern lets the algorithm vary independently
 * from client to client
 * 
 * In a football match, at the last moment, in general, if Team A is leading
 * Team B by a score of 1-0, instead of attacking, Team A becomes defensive. On
 * the other hand, Team B goes for an all-out attack to score.
 * 
 * @author ali
 * 
 */
public class Run {
	public static void main(String[] args) {
		IChoice choice;
		/*Main Object*/
		Context context = new Context();
		System.out.println("User decides to take First Choice");
		choice = new FirstChoice();
		/*Changing the implementation dynamically*/
		context.setChoice(choice);
		context.showChoice("Ali", "Bassam");
		System.out.println("User decides to take Second Choice");
		choice = new SecondChoice();
		/*Changing the implementation dynamically*/
		context.setChoice(choice);
		context.showChoice("Ali", "Bassam");
		/*Child Class*/
		Context child = new ChildContext();
		child.setChoice(choice);
		child.showChoice("Hey", "You");
	}
}
