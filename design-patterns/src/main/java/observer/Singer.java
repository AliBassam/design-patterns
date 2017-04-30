package observer;

import java.util.ArrayList;
import java.util.List;


public class Singer extends Person implements ISubject {

	public Singer(String name, String gender, Integer age) {
		super(name, gender, age);
	}

	List<IObserver> observers = new ArrayList<IObserver>();
	
	public void register(IObserver observer) {
		observers.add(observer);
	}

	public void unregister(IObserver observer) {
		observers.remove(observer);
	}

	public void notifyObservers(String... params) {
		for(IObserver observer: observers) {
			observer.update(params[0]);
		}
	}

	public void releaseAlbum(String albumName) {
		System.out.println(getName() + " released album " + albumName);
		notifyObservers(albumName);
	}
	
}
