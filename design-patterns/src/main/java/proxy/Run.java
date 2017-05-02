package proxy;

/**
 * Provide a surrogate or placeholder for another object to control access to
 * it. Use of the proxy can simply be forwarding to the real object, or can
 * provide additional logic. In the proxy extra functionality can be provided,
 * for example caching when operations on the real object are resource
 * intensive, or checking preconditions before operations on the real object are
 * invoked. For the client, usage of a proxy object is similar to using the real
 * object, because both implement the same interface.
 * 
 * @author ali
 * 
 */
public class Run {
	public static void main(String[] args) {
		SmartCard smartCard = new SmartCard();
		smartCard.drawMoney();
	}
}
