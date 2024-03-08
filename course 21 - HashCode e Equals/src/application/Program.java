package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Ane", "ane@gmail.com");
		Client c2 = new Client("Ane", "luciano@gmail.com");
		Client c3 = new Client("Ane", "luciano@gmail.com");
		
		
		System.out.println("c1 HashCode " + c1.hashCode());
		System.out.println("c2 HashCode " + c2.hashCode());
		System.out.println("c1 equals c2 " + c1.equals(c2));
		
		System.out.println("c2 equals c3 " +c2.equals(c3));
		
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = new String("Test");
		System.out.print("s1 == s2 ");
		System.out.println(s1 == s2);
		
		System.out.print("s3 equals s4 ");
		System.out.println(s3 == s4);
	}

}
