package application;

import java.util.Locale;
import java.util.Scanner;

import service.BrazilInterestService;
import service.InterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		
		double payment = is.payment(amount, months);
		
		System.out.print("Payment after " + months + " months: " + String.format("%.2f", payment));
		
		sc.close();

	}

}
