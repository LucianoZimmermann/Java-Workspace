package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros vai digitar?");
		int n = sc.nextInt();
		int[] negativos = new int[n];
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
            System.out.println("Enter a number: ");
            vect[i] = sc.nextInt();
            if (vect[i] < 0) {
                negativos[i] = vect[i];
            }
        }
		
		System.out.println("Numeros negativos: ");
		for(int i=0;i<negativos.length;i++) {
			if(negativos[i] !=0) {
			System.out.println(negativos[i]);
			}
		}
		
		sc.close();
	}

}
