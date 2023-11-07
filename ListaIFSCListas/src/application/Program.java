package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Parts;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many parts do you need to keep data? ");
        int n = sc.nextInt();

        List<Parts> list = new ArrayList<>();

        System.out.print("percentage of IPI accrual: ");
        Double IPI = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter the part data");
            System.out.print("Code: ");
            int code = sc.nextInt();
            sc.nextLine();
            System.out.print("Unit price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity of parts: ");
            int quantity = sc.nextInt();
            Parts part = new Parts(code, price, quantity);

            list.add(part);
            part.grossPrice(IPI); // Pass IPI as an argument to the method
        }
        
        for(Parts part : list) {
        	System.out.println();
        	System.out.println(part);
        }
        
        double totalGrossPrice = calcTotalGrossPrice(list);
        System.out.println("Total Gross Price of all parts: " + totalGrossPrice);

        sc.close();
    }

    // Calculate the total gross price of all parts in the list
    public static double calcTotalGrossPrice(List<Parts> list) {
        double total = 0.0;
        for (Parts part : list) {
            total += part.getGrossPrice();
        }
        return total;
    }
}
