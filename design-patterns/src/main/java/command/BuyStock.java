package command;

public class BuyStock implements IOrder {

	private Stock stock;

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	public void Do() {
		stock.buy();
	}

}
