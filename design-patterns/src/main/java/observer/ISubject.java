package observer;

/**
 * Interface object for the Subject that allows registration of Observers, 
 * un-registration and notifying the Observers
 * @author ali
 *
 */
public interface ISubject {

	/**
	 * Registers an Observer that will be notified
	 * @param observer
	 */
	public void register(IObserver observer);
	/**
	 * Unregisters an Observer to avoid it to be notified
	 * @param observer
	 */
	public void unregister(IObserver observer);
	/**
	 * Notify the observers
	 * @param params
	 */
	public void notifyObservers(String... params);
}
