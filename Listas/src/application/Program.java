package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas irá cadastrar? ");
		int n = sc.nextInt() - 1;
		sc.nextLine();
		char continuar = 's';
		
		List<Person> list = new ArrayList<>(n);
		
		for(int i=0;i<n;i++) {
			
			while(continuar == 's' || continuar == 'S') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				Person person = new Person(name);
				list.add(person);
				
				System.out.print("Deseja continuar? (s/n) ");
				continuar = sc.next().charAt(0);
				sc.nextLine();
				System.out.println();
			}
		}
		
		for (Person x : list) {
			System.out.println(list.indexOf(x) + 1 + " - " + x);
		}
		
		System.out.println("A lista contem " + list.size() + " posicoes");
		
		System.out.print("Escolha uma posicao para imprimir da lista: ");;
		int posicao = sc.nextInt();
		sc.nextLine();
		
		System.out.println(list.get(posicao - 1));
		
		System.out.print("Deseja remover algum integrante? (s/n)");
		char remover = sc.next().charAt(0);
		
		if(remover == 's' || remover == 'S') {
			System.out.print("Qual posicao deseja remover? ");
			posicao = sc.nextInt();
			list.remove(posicao-1);
		}
		
		System.out.print("Lista atualizada\n");
		
		for (Person x : list) {
			System.out.println(list.indexOf(x) + 1 + " - " + x);
		}
		
		System.out.print("\nDigite uma inicial para realizar a busca: ");
		char busca = sc.next().charAt(0);
		
		for (Person x : list) {
			if(x.getName().charAt(0) == busca) {
				System.out.println(list.indexOf(x) + 1 + " - " + x);
			}
		}
		
		sc.close();
	}
}
