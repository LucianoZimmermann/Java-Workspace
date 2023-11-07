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
        int numberOfPeople = sc.nextInt(); // Alteração 1: Troquei o nome da variável para tornar mais claro.
        sc.nextLine(); // Consumir a quebra de linha pendente.
        char continuar = 's';

        List<Person> list = new ArrayList<>(numberOfPeople);

        for (int i = 0; i < numberOfPeople; i++) {
        	
            while (continuar == 's') {
            	continuar = 's';
            	System.out.println("Nome:");
                String name = sc.nextLine(); // Alteração 2: Usar nextLine para ler toda a linha, evitando problemas.

                Person person = new Person(name);
                list.add(person);

                System.out.println("Deseja continuar? (s/n)");
                continuar = sc.next().charAt(0);
                sc.nextLine(); // Consumir a quebra de linha pendente.
            }
        }

        for (Person x : list) {
            System.out.println(x);
        }

        System.out.println("A lista contém " + list.size() + " posições"); // Alteração 3: Corrigi a mensagem.

        System.out.print("Escolha uma posição para imprimir da lista: ");
        int posicao = sc.nextInt();
        sc.nextLine();

        System.out.println(list.get(posicao - 1)); // Alteração 4: Corrigi a indexação.

        System.out.print("Deseja remover algum integrante? (s/n)");
        char remover = sc.next().charAt(0);

        if (remover == 's' || remover == 'S') {
            System.out.print("Qual posição deseja remover? ");
            posicao = sc.nextInt();
            list.remove(posicao - 1); // Alteração 5: Corrigi a indexação.
        }

        System.out.println("Lista atualizada");

        for (Person x : list) {
            System.out.println(x);
        }

        System.out.print("Digite uma inicial para realizar a busca: ");
        char busca = sc.next().charAt(0);

        for (Person x : list) {
            if (x.getName().charAt(0) == busca || x.getName().charAt(0) == busca+32) { // Alteração 6: Corrigi a busca na lista.
                System.out.println(x);
            }
        }

        sc.close();
    }
}
