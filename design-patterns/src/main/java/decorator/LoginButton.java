package decorator;

public class LoginButton extends ButtonDecorator {

	public void doClick() {
		System.out.println("Login button clicked");
		super.doClick();
	}

}
