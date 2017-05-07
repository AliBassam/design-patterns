package strategyPolicy;

/**
 * This interface will not be implemented by the original main actors. It will
 * be implemented by differnet other classes that represents a variety in
 * actions and outcomes, instead of the real objects.
 * 
 * @author ali
 * 
 */
public interface IChoice {

	void myChoice(String s1, String s2);
}
