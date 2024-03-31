package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		/* não dá erro pois uma BussinessAccount TAMBÉM É uma Account!
		já que utilizamos "BussinessAccount extends Account" */
		
		Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
		/* não dá erro pois estou atribuindo um objeto da subclasse para a
		superclasse! */
		
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		/* não dá erro pois uma SavingsAccount que nem a BussinessAccount,
		é uma Account! "SavingsAccount extends Account" */
	
		
		// DOWNCASTING
		BussinessAccount acc4 = (BussinessAccount)acc2;
		acc4.loan(100.00); /* com o downcasting podemos daí utilizar a função de
		 empréstimo em uma Account que poderíamos originalmente apenas utilizar
		 em uma BussinessAccount! */
		
		/* BussinessAccount acc5 = (BussinessAccount)acc3; dá erro pois uma 
		SavingsAccount -> (acc3) é uma Account, mas não é uma BussinessAccount*/
		
		if (acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
