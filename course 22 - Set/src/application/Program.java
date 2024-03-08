package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Notebook");
		set.add("Smartphone");
		set.add("Calculator");
		set.add("TV");
		
		set.removeIf(x -> x.length() >= 3);
		
		for(String p : set) {
			System.out.println(p);
		}
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(1,3,5,7,9,0,2,6));
		Set<Integer> b = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
		
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(c);
		
		System.out.println("c: " + c);
		System.err.println("d: " + d);
		
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("e: " + e);
	}

}
