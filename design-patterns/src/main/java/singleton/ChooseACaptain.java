package singleton;

public class ChooseACaptain {

	/**
	 * A private default constructor prevents us from creating an instance of
	 * this object
	 */
	private ChooseACaptain() {
	}

	//Initialize this variable directly here in order to have Eager initialization
	private static ChooseACaptain _captain;

	/**
	 * This is a lazy initialization since the captain
	 * will not be created unless the getCaptain method is called
	 * Also this is not thread safe, concurrent calls at the same time 
	 * could create more than one instance of the same class
	 * @author ali
	 *
	 */
	public static ChooseACaptain getCaptain() {
		if (_captain == null) {
			System.out.println("Captain was chosen now");
			_captain = new ChooseACaptain();
		} else {
			System.out.println("Captain was already chosen");
		}
		return _captain;
	}

	/**
	 * This is thread safe
	 * @return
	 */
	public synchronized static ChooseACaptain getCaptainSynchronized() {
		if (_captain == null) {
			System.out.println("Captain was chosen now");
			_captain = new ChooseACaptain();
		} else {
			System.out.println("Captain was already chosen");
		}
		return _captain;
	}
}
