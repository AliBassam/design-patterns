package decorator;

public class OriginalButton extends Button {

	@Override
	public void doClick() {
		System.out.println("Original Button clicked");
	}

}
