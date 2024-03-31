package entities;

public class BussinessAccountPlus extends BussinessAccount {
	
	// dará erro pois há o "final" em BussinessAccounts no método "withdraw"!
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
