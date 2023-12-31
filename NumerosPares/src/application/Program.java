package application;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
tela todos os números pares, e também a quantidade de números pares.*/

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double[] pares = new double[n];
		int contPares = 0;
		
		for(int i=0;i<vect.length;i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if(vect[i] % 2 == 0) {
				pares[i] = vect[i];
				contPares++;
			}
		}
		
		System.out.printf("\nNumeros Pares: \n");
		
		for(int i=0; i<vect.length;i++) {
			if(pares[i] != 0) {
			System.out.printf("%.0f ", pares[i]);
			}
		}
		
		System.out.printf("\n\nQuantidade de numeros pares: %d", contPares);
		
		sc.close();
	}

}