package decorator;

/**
 * Attach additional responsibilities to an object dynamically. Decorators
 * provide a flexible alternative to subclassing for extending functionality.
 * 
 * @author ali
 * 
 */
public class Run {

	public static void main(String[] args) {
		//Create Original Button
		OriginalButton originalButton = new OriginalButton();
		
		//Decorating Original Button with Login Button
		LoginButton loginButton = new LoginButton();
		loginButton.setButton(originalButton);
		loginButton.doClick();
		
		//Decorating Login Button with Facebook Login Button
		FacebookLoginButton facebookLoginButton = new FacebookLoginButton();
		facebookLoginButton.setButton(loginButton);
		facebookLoginButton.doClick();
		
	}
}
