package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Enter account data:");
			System.out.print("Numer: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			Account account = new Account(number, holder, balance, limit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
		try {	
			account.withdraw(amount);
			System.out.println("New Balance: " + account.getBalance());
		} 
		catch(WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
