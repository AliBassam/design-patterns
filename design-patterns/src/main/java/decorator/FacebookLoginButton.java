package decorator;

public class FacebookLoginButton extends ButtonDecorator {

	public void doClick() {
		super.doClick();
		System.out.println("Facebook Login button clicked");
	}
}
