package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> myShapes = new ArrayList<>();
		
		myShapes.add(new Rectangle(3.0,2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(3.0));
		myCircles.add(new Circle(5.0));
		
		System.out.print("Total area: " + totalArea(myCircles));
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		List<Integer> intList = new ArrayList<Integer>();
		
		List<? extends Number> newList = intList;
		sc.close();
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
