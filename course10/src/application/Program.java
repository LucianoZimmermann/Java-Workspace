package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many products do you want to take data?");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVARAGE PRICE: %.2f%n", avg);
		
		sc.close();
	}

}
