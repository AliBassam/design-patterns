package observer;

public class Journalist extends Person implements IObserver {

	public Journalist(String name, String gender, Integer age) {
		super(name, gender, age);
	}

	public void update(String... params) {
		System.out.println("Journalist " + getName() + " wrote an article about the album " + params[0]);
	}

}
