package command;

public class Broker {

	IOrder order;
	
	public void executeCommand(IOrder order) {
		this.order = order;
		this.order.Do();
	}
}
