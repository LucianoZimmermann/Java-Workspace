package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

/* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
de homens. */

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people are on the list? ");
        int n = sc.nextInt();
        int masculine = 0;
        int feminine = 0;
        double sumHeight = 0.0;
        double femaleSumHeight = 0.0;
        double shorterHeight = Double.MAX_VALUE; // Inicializado com o maior valor possível
        double greaterHeight = Double.MIN_VALUE; // Inicializado com o menor valor possível

        People[] vect = new People[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Gender (M/F): "); // Corrigido para solicitar apenas um caractere
            char gender = sc.nextLine().charAt(0);
            System.out.println("Height: ");
            double height = sc.nextDouble();
            vect[i] = new People(name, gender, height);
            sumHeight += vect[i].getHeight();

            // Verifica e atualiza as alturas mínima e máxima
            if (vect[i].getHeight() > greaterHeight) {
                greaterHeight = vect[i].getHeight();
            }

            if (vect[i].getHeight() < shorterHeight) {
                shorterHeight = vect[i].getHeight();
            }

            // Conta homens e acumula altura das mulheres
            if (vect[i].getGender() == 'M' || vect[i].getGender() == 'm') {
                masculine++;
            } else if (vect[i].getGender() == 'F' || vect[i].getGender() == 'f') {
                feminine++;
                femaleSumHeight += vect[i].getHeight();
            }

            double mediumHeight = sumHeight / (i+1);
            System.out.printf("Partial average height: %.2f%n", mediumHeight);
            
        }

        // Evita a divisão por zero ao calcular a média da altura das mulheres
        double femaleAvgHeight = (feminine != 0) ? femaleSumHeight / feminine : 0.0;

        System.out.printf("Shorter height = %.2f%n"
                + "Greater height = %.2f%n"
                + "Average height of women = %.2f%n"
                + "Number of men = %d%n", shorterHeight, greaterHeight, femaleAvgHeight, masculine);

        sc.close();
    }
}
