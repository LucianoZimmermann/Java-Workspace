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

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            System.out.println("Employee #" + (j + 1) + ": ");
            System.out.printf("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            while (Employee.idAlreadyUsed(list, id)) {
                System.out.println("Id already in use, set another Id:");
                id = sc.nextInt();
                sc.nextLine();
            }

            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println("Employee information:\n");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).setCounter(i + 1);
            System.out.println(list.get(i));
            System.out.println();
        }

        sc.close();
    }
}
