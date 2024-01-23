package application;

import java.util.Locale;
import java.util.Scanner;

import service.BrazilInterestService;
import service.InterestService;
import service.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService br = new BrazilInterestService();
		InterestService us = new UsaInterestService();
		
		double brPayment = br.payment(amount, months);
		double usPayment = us.payment(amount, months);
	
		System.out.println("\nPayment after " + months + " months, in Brazil Interest Rate: " + String.format("%.2f", brPayment));
		System.out.println("\nPayment after " + months + " months, in U.S.A. Interest Rate: " + String.format("%.2f", usPayment));
		
		sc.close();

	}

}
