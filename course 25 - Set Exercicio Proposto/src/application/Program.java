package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int studentA = sc.nextInt();
		for(int i=0;i<studentA;i++) {
			set.add(new Student(sc.nextInt()));
		}
		System.out.print("How many students for course B? ");
		int studentB = sc.nextInt();
		for(int i=0;i<studentB;i++) {
			set.add(new Student(sc.nextInt()));
		}
		System.out.print("How many students for course C? ");
		int studentC = sc.nextInt();
		for(int i=0;i<studentC;i++) {
			set.add(new Student(sc.nextInt()));
		}
		
		System.out.print("Total students: " + set.size());
		sc.close();
	}

}
