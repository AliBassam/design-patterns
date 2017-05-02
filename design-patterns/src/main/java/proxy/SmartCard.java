package proxy;

public class SmartCard implements IBankAccount {

	BankAccount bankAccount;

	public void drawMoney() {
		if(bankAccount == null) {
			bankAccount = new BankAccount();
		}
		System.out.println("Smart Card is used to draw money");
		bankAccount.drawMoney();
	}
	
	

}
