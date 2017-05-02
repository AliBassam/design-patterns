package observer;

/**
 * Interface object for Observers in the Observer pattern
 * that is responsible in interacting to the event generated by the Subject
 * @author ali
 *
 */
public interface IObserver {

	/**
	 * Reaction upon being notified from the Subject
	 * @param params
	 */
	public void update(String... params);
}