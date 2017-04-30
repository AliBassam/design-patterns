package observer;

public class Fan extends Person implements IObserver {

	public Fan(String name, String gender, Integer age) {
		super(name, gender, age);
	}

	public void update(String... params) {
		System.out.println("Fan " + getName() + " bought the album " + params[0]);
	}

	
}
