package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered?");
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Employee> list = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
        	System.out.println();
        	System.out.println("Employee #" + (i+1) + ": ");
        	System.out.print("Id: ");
        	Integer id = sc.nextInt();
        	
        	while(hasID(list, id)) {
        		System.out.println("Id already taken! Try again: ");
        		id = sc.nextInt();
        	}
        	
        	sc.nextLine();
        	System.out.print("Name: ");
        	String name = sc.nextLine();
        	System.out.print("Salary: ");
        	Double salary = sc.nextDouble();
        	Employee emp = new Employee(id, name, salary);
        	list.add(emp);
        }
        
        System.out.print("Enter the employee id that will have salary increase: ");
		int idSalaryIncrease = sc.nextInt();
		
		Integer pos = position(list, idSalaryIncrease);
		if(pos == null) {
			System.out.println("Id not found!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println("\nList of employees: ");
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasID(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
