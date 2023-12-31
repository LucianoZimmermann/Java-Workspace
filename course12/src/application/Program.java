package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		int linhas = sc.nextInt();
		sc.nextLine();
		System.out.print("Colunas: ");
		int colunas = sc.nextInt();
		sc.nextLine();
		
		int[][] mat = new int[linhas] [colunas];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print("Digite o valor na posicao " + i + ", " + j + ": ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Entre um numero: ");
		int x = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}	
		
		System.out.println();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
