package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data for bank account:");
		System.out.println("Account Number:");
		int accountNumber = sc.nextInt();
		System.out.println("Name:");
		String name = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Is there a initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		double initialDeposit = 0;
		
		if(response == 'y') {
			System.out.println("Initial Deposit Value: ");
			initialDeposit = sc.nextDouble();
		}
		
		Account account1 = new Account(name, accountNumber, initialDeposit);
		
		System.out.println("Account data: ");
		System.out.println();
		System.out.println("Name: " + account1.getName());
		System.out.println("Account Number: " + account1.getAccountNumber());
		System.out.println("Initial Deposit: $" + account1.getInitialDeposit());
		System.out.println();
		
		System.out.println("Account Data: \n" + account1);
		System.out.println("");
		
		System.out.println("Enter deposit value: ");
		account1.deposit(sc.nextDouble());
		System.out.println();
		System.out.println("Account Data: \n" + account1);
		System.out.println("");
		
		System.out.println("Enter withdraw value: ");
		account1.withdraw(sc.nextDouble());
		System.out.println();
		System.out.println("Updated Data: \n" + account1);
		System.out.println("");
		
		sc.close();
	}

}
