package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		
		String pathReader = "C:\\Users\\lucia\\eclipse-workspace\\SourceFile.txt";
		String pathWriter = "C:\\Users\\lucia\\eclipse-workspace\\OutputFile.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(pathReader))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				list.add(new Product(name, price, quantity));
				line = br.readLine();
			}
			
			for(Product product : list) {
				System.out.println(product);
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathWriter))){
				for(Product product : list) {
					bw.write(product.getName() + ", " + String.format("%.2f", product.total()));
					bw.newLine();
				}
				System.out.println("\nFile with total price created!");
			}
			catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
