package strategyPolicy;

/**
 * This is usually the main object that we give the ability to have a choice. If
 * IChoice was implemented, we would be stuck to one single implementation that
 * cannot be changed, unless we make subclasses, and assuming this class has
 * subclasses we may need to have different implementations, or just the ability
 * to ignore the parent class implementation, this is a bad approach.
 * 
 * So what we do here is that we use the interface as an object in this class
 * which can be set and changed.
 * 
 * That interface will be implemented by other different classes that behaves as
 * a different implementation depending on the need.
 * 
 * This way, this main class or any of its subclasses are free to have any
 * implementation that can be changed at any time and it does not affect any of
 * the parent class or sub classses.
 * 
 * @author ali
 * 
 */
public class Context {
	/*Interface object that can be modified at any time*/
	IChoice choice;

	public void setChoice(IChoice choice) {
		this.choice = choice;
	}

	public void showChoice(String s1, String s2) {
		this.choice.myChoice(s1, s2);
	}
}
