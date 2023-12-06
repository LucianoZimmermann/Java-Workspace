package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entities.Movies;
import entities.enums.Author;
import entities.enums.Genre;

public class Program {

    public static void main(String[] args) {

        List<Movies> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\lucia\\eclipse-workspace\\Filmes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(", ");

                Author author = Author.valueOf(fields[0]);
                int index = Integer.parseInt(fields[1]);
                String title = fields[2];
                Genre genre = Genre.valueOf(fields[3]);
                int release = Integer.parseInt(fields[4]);
                list.add(new Movies(author, index, title, genre, release));
                line = br.readLine();
            }

            char search = 's';

            do {
                System.out.println("\n--- Filtro ---");

                try {
                    System.out.println("Qual dado deseja filtrar?");
                    System.out.println("Opções");
                    System.out.println("1 - Autor");
                    System.out.println("2 - Index");
                    System.out.println("3 - Título");
                    System.out.println("4 - Gênero");
                    System.out.println("5 - Lançamento");

                    System.out.print("Filtro: ");
                    int filter = sc.nextInt();

                    System.out.print("Pesquisa: ");
                    String searchTerm = sc.next();

                    switch (filter) {
                        case 1:
                            filterAndPrint(list, movie -> movie.getAuthor().toString().equalsIgnoreCase(searchTerm));
                            break;
                        case 2:
                            filterAndPrint(list, movie -> String.valueOf(movie.getIndex()).equalsIgnoreCase(searchTerm));
                            break;
                        case 3:
                            filterAndPrint(list, movie -> movie.getTitle().equalsIgnoreCase(searchTerm));
                            break;
                        case 4:
                            filterAndPrint(list, movie -> movie.getGenre().toString().equalsIgnoreCase(searchTerm));
                            break;
                        case 5:
                            filterAndPrint(list, movie -> String.valueOf(movie.getRelease()).equalsIgnoreCase(searchTerm));
                            break;
                        default:
                            System.out.println("Opção de filtro inválida.");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite um número válido para o filtro.");
                    sc.nextLine();
                }

                System.out.print("Deseja fazer um novo filtro? (s/n) ");
                search = sc.next().charAt(0);

            } while (search != 'n');

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }

    private static void filterAndPrint(List<Movies> movies, Predicate<Movies> predicate) {
        List<Movies> filteredList = movies.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println("\nFilmes Filtrados:");
        System.out.println();
        if (filteredList.isEmpty()) {
            System.out.println("Nenhum filme encontrado");
        } else {
            filteredList.forEach(movie -> {
                System.out.println(movie);
                System.out.println();
            });
        }
    }
}
