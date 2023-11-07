package application;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros vai digitar?");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double soma = 0.0;
		
		for(int i=0;i<vect.length;i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.printf("\nValores: ");
		
		for(int i=0; i<vect.length;i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		double media = soma / n;
		System.out.println();
		
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Media: %.2f%n", media);
		
		sc.close();
	}

}
