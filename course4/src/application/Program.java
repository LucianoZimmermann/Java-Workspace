package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter employee data: ");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println("Which percentage to increase salary?");
        employee.increaseSalary(sc.nextDouble());

        System.out.println("Updated data: " + employee);

        sc.close();
    }
	
}
