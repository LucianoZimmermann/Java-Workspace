package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver*/

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people need to keep data?");
        int n = sc.nextInt();

        People[] vect = new People[n];
        double minorCount = 0; 
        People[] minorPeople = new People[n]; 

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();
            vect[i] = new People(name, age, height);
            if (vect[i].getAge() < 16) {
                minorPeople[(int) minorCount] = vect[i]; 
                minorCount++;
            }
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }

        double avg = sum / n;
        double porcentageMinor = ((double) minorCount / n) * 100; 

        System.out.printf("Average Height: %.2f%n", avg);
        System.out.printf("People under 16 years old: %.2f (%.2f%%)%n", minorCount, porcentageMinor);

        System.out.println("Names of people under 16 years old:");
        for (int i = 0; i < minorCount; i++) {
            System.out.println(minorPeople[i].getName());
        }

        sc.close();
    }
}
