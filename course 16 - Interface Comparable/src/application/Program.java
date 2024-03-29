package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\lucia\\eclipse-workspace\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String employeeCsv = br.readLine();
			while(employeeCsv != null) {
				String [] fields = employeeCsv.split(",");
				list.add(new Employee(fields [0], Double.parseDouble(fields [1])));
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			for(Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
