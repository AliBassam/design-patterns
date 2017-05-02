package decorator;

/**
 * Attach additional responsibilities to an object dynamically. Decorators
 * provide a flexible alternative to subclassing for extending functionality.
 * 
 * Suppose you already own a house. Now you have decided to add an additional
 * floor. Obviously, you do not want to change the architecture of ground floor
 * (or existing floors). You may want to change the design of the architecture
 * for the newly added floor without affecting the existing architecture for
 * existing floor(s).
 * 
 * @author ali
 * 
 */
public class Run {

	public static void main(String[] args) {
		// Create Original Button
		OriginalButton originalButton = new OriginalButton();

		// Decorating Original Button with Login Button
		LoginButton loginButton = new LoginButton();
		loginButton.setButton(originalButton);
		loginButton.doClick();

		// Decorating Login Button with Facebook Login Button
		FacebookLoginButton facebookLoginButton = new FacebookLoginButton();
		facebookLoginButton.setButton(loginButton);
		facebookLoginButton.doClick();

	}
}
