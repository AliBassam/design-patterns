package singleton;


/**
 * Ensure a class only has one instance, and provide a global point of 
 * access to it
 * @author ali
 *
 */
public class Run {
	public static void main(String[] args) {
		//Retrieve Singleton instance
		ChooseACaptain c1 = ChooseACaptain.getCaptain();
		
		//Retrieve again
		ChooseACaptain c2 = ChooseACaptain.getCaptain();
		
		if(c1 == c2) {
			System.out.println("Instances are equal");
		}
	}
}
