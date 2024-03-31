package entities;

public class BussinessAccount extends Account {
	
	private Double loanLimit;
	
	public BussinessAccount() {
		super();
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	/* Suponha que você não queira que esse método "withdraw" na BussinessAccount seja sobreposto!
	Para isso, utiliza-se a palavra "final" no método! */
	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount); // implementa o saque normalmente pegando da superclasse Account
		balance -= 2.0; // adiciona mais uma taxa de 2.0
	}
	
}
