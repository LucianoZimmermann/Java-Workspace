package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Genero;
import model.entities.ItemBiblioteca;
import model.entities.Leitor;
import model.entities.Livro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ItemBiblioteca> list = new ArrayList<>();
		
		//C:\Users\lucia\eclipse-workspace\bibliotecaIn.txt
		
		System.out.println("Entre com o endereco do arquivo de livros: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line!=null) {
				String[] fields = line.split(",");
				int id = Integer.parseInt(fields[0]);
				String titulo = fields[1];
				int paginas = Integer.parseInt(fields[2]);
				boolean emprestado = Boolean.getBoolean(fields[3]);
				Genero genero = Genero.valueOf(fields[4]);
				list.add(new Livro(id, titulo, paginas, emprestado, genero));
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for(ItemBiblioteca item : list) {
			System.out.println(item);
		}
		
		char escolha = ' ';
		Leitor leitor = new Leitor(1, "Ane");
		while(escolha != 'S' || escolha != 's') {
			System.out.println();
			System.out.println("1 - Para emprestar um livro");
			System.out.println("2 - Para devolver um livro");
			System.out.println("3 - Consultar historico de emprestimos");
			System.out.println("S - Sair");
			
			escolha = sc.next().charAt(0);
			switch(escolha){
				case '1': 
					System.out.print("Livro que deseja: ");
					leitor.registrarItemEmprestado(list.get(sc.nextInt()));
				
				case '2': 
					System.out.print("Livro a ser devolvido: ");
					leitor.registrarItemDevolvido(list.get(sc.nextInt()));
				
				case '3': leitor.getHistorico();
			}
				
		}
		sc.close();
	}

}
