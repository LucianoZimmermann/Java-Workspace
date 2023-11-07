package entities;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int counter;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return String.format("Employee #%d \nId: %d \nName: %s \nSalary: %.2f", counter, id, name, salary);
    }

    public static boolean idAlreadyUsed(List<Employee> list, int id) {
        for (Employee employee : list) {
            if (employee.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
