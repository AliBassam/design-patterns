package singleton;

/**
 * Ensure a class only has one instance, and provide a global point of access to
 * it
 * 
 * Suppose you are a member of a cricket team. And in a tournament your team is
 * going to play against another team. As per the rules of the game, the captain
 * of each side must go for a toss to decide which side will bat (or bowl)
 * first. So, if your team does not have a captain, you need to elect someone as
 * a captain first. And at the same time, your team cannot have more than one
 * captain.
 * 
 * @author ali
 * 
 */
public class Run {
	public static void main(String[] args) {
		// Retrieve Singleton instance
		ChooseACaptain c1 = ChooseACaptain.getCaptain();

		// Retrieve again
		ChooseACaptain c2 = ChooseACaptain.getCaptain();

		if (c1 == c2) {
			System.out.println("Instances are equal");
		}
	}
}
