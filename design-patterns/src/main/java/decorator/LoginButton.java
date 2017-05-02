package decorator;

public class LoginButton extends ButtonDecorator {

	public void doClick() {
		super.doClick();
		System.out.println("Login button clicked");
	}

}
