package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
da pessoa mais velha*/

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas possui a lista? ");
		int n = sc.nextInt();
		
		People[] vect = new People[n];
		int maiorIdade = 0;
		int menorIdade = 0;
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String name = sc.nextLine();
			System.out.println("Digite a idade: ");

			int age = sc.nextInt();
			if(menorIdade == 0) {
				menorIdade = age;
			}
			vect[i] = new People(name, age);
			if(vect[i].getAge() > maiorIdade) {
				maiorIdade = vect[i].getAge();
			}
			if(vect[i].getAge() < menorIdade) {
				menorIdade = vect[i].getAge();
			}
		}
		
		for(int i=0;i<vect.length;i++) {
			if(vect[i].getAge() == maiorIdade)
			System.out.println("Pessoa mais velha: " + vect[i].getName());
		}
		
		for(int i=0;i<vect.length;i++) {
			if(vect[i].getAge() == menorIdade)
			System.out.println("Pessoa mais nova: " + vect[i].getName());
		}
		
		sc.close();
	}

}
