package observer;

/**
 * Define a one-to-many dependency between objects so that when one object changes state, 
 * all its dependents are notified and updated automatically
 * @author ali
 *
 */
public class Run {
	public static void main(String[] args) {
		//Create Fans
		Fan fan1 = new Fan("Ali", "M", 24);
		Fan fan2 = new Fan("Nour", "F", 18);
		Fan fan3 = new Fan("Ahmad", "M", 16);
		
		//Create Journalist
		Journalist journalist1 = new Journalist("Houssam", "M", 29);
		
		//Create Singer
		Singer singer1 = new Singer("Elissa", "F", 30);
		Singer singer2 = new Singer("Haifa", "F", 35);
		
		//Subscribe
		singer1.register(fan1);
		singer1.register(fan2);
		singer2.register(fan2);
		singer2.register(fan3);
		singer1.register(journalist1);
		singer2.register(journalist1);
		
		//Release Album
		singer1.releaseAlbum("Strange Love");
		singer2.releaseAlbum("Love is Good");
	}
}
