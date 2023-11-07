package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public void increaseSalary(double percentage) {
       this.grossSalary = this.grossSalary + (this.grossSalary * (percentage / 100.0));
    }
	
	public String toString() {
        double netSalary = this.grossSalary - this.tax;
        return "Employee: " + name + ", Gross Salary: $" + String.format("%.2f", this.grossSalary) +
                ", Net Salary: $" + String.format("%.2f", netSalary);
    }
}
