package proxy;

public class Android extends Person {

	Human human;
	
	@Override
	public void talk() {
		if(human == null) {
			human = new Human();
		}
		human.talk();
	}

}
