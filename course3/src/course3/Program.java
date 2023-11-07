package course3;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Rectangle a;
	a = new Rectangle();
	
	System.out.println("Enter the measures of the rectangle: ");
	System.out.print("Width: ");
	a.width = sc.nextDouble();
	System.out.print("Height: ");
	a.height = sc.nextDouble();
	
	System.out.println("Area = " + a.area());
	System.out.println("Perimeter = " + a.perimeter());
	System.out.println("Diagonal = " + a.diagonal());

	sc.close();
	}
}
