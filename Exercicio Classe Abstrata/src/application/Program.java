package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;


/*Crie uma classe abstrata chamada ContaBancaria com métodos abstratos depositar(double valor) e sacar(double
 * 
valor). Crie classes concretas ContaCorrente e ContaPoupanca que herdam de ContaBancaria e implementam os 

métodos abstratos*/

// Ajustar para que não seja possivel cadastrar uma conta com o mesmo numero de outra anterior.
//Implementar o uso dos metodos abstratos

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Conta> list = new ArrayList<>();
		
		char cadastrar = 's';
		
		while(cadastrar == 's' || cadastrar == 'S') {
			System.out.print("Deseja cadastrar uma conta corrente ou uma conta poupança? (c ou p)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Titular: ");
			String holder = sc.nextLine();
			System.out.print("Numero da conta: ");
			int number = sc.nextInt();
			System.out.print("Saldo: ");
			double amount = sc.nextDouble();
			if(ch == 'p') {
				System.out.print("Taxa de juros: ");
				double fee = sc.nextDouble();
				list.add(new ContaPoupanca(holder, number, amount, fee));
			}
			if(ch == 'c') {
				System.out.print("Investimento inicial: ");
				double moneyInvested = sc.nextDouble();
				list.add(new ContaCorrente(holder, number, amount, moneyInvested));
			}
			System.out.print("Deseja cadastrar uma nova conta? (s ou n) ");
			cadastrar = sc.next().charAt(0);
		}
		
		for(Conta conta : list) {
			System.out.println();
			System.out.print(conta);
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
