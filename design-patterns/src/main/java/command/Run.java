package command;

/**
 * Encapsulate a request as an object, thereby letting you parameterize clients
 * with different requests, queue or log requests, and support undoable
 * operations.
 * 
 * We cannot change our past, but frequently we wish we could do so.
 * Unfortunately, we do not have any such device yet to fulfill that wish. But
 * we can undo and redo many other operations in our daily life. We can erase a
 * pencil drawing with a rubber. We can re-architect our living places. And,
 * most important, we can forget bad memories and start a fresh journey. So, you
 * must acknowledge that undo/redo operations are part of our life and we are
 * doing those through some commands—either externally or internally.
 * 
 * @author ali
 * 
 */
public class Run {

	public static void main(String[] args) {
		Stock receiver = new Stock();
		/* Client holds Invoker and Command Objects */
		Broker invoker = new Broker();
		BuyStock buyCommand = new BuyStock(receiver);
		SellStock sellCommand = new SellStock(receiver);
		invoker.executeCommand(buyCommand);
		invoker.executeCommand(sellCommand);
	}

}
