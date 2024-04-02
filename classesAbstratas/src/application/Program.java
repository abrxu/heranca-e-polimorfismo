package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		
		System.out.println("Somando saldos:");
		for (Account acc : list) {
			sum += acc.getBalance();
			System.out.println(String.format("%.2f", sum));
		}
		
		System.out.println();
		
		System.out.println("Depositando 10 reais em cada conta:");
		for (Account acc : list) {
			acc.deposit(10.00);
			System.out.println(String.format("%.2f", acc.getBalance()));
		}
	}
}
