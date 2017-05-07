package command;

public class SellStock implements IOrder {

	private Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	public void Do() {
		stock.sell();
	}
}
