package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 1200.00));
		set.add(new Product("Notebook", 1300.00));
		set.add(new Product("Smartphone", 1500.00));
		
		for(Product p : set) {
			System.out.println(p);
		}
		
		sc.close();

	}
}
