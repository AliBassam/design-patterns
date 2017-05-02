package templateMethod;

public abstract class BasicEngineering {

	public void papers() {
		physics();
		math();
		special();
	}

	private void physics() {
		System.out.println("Physics!");
	}

	private void math() {
		System.out.println("Math!");
	}
	
	public abstract void special();
}
