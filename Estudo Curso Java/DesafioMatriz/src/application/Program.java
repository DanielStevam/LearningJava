package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o valor de N: ");
		int n = sc.nextInt();
		System.out.println("Escreva o valor de M: ");
		int m = sc.nextInt();
		int [][] matriz = new int [m][n];
		
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Escreva os numeros: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite a linha que deseja procurar:");
		int linha = sc.nextInt();
		System.out.println("Digite a coluna que deseja procurar:");
		int coluna = sc.nextInt();	
		int valorProcurado = matriz[linha][coluna];
		
		int anterior = -1;
		int subsequente = -1;
		int abaixo = -1;
		
		if(coluna > 0) {
			anterior = matriz[linha][coluna - 1];
		}
		if(coluna < n - 1) {
			subsequente = matriz[linha][coluna + 1];
		}
		System.out.println("O valor " + valorProcurado + " foi encontrado na posição [" + linha + "][" + coluna + "]");
		if (anterior != -1) {
			System.out.println("O valor anterior é " + anterior);
		} else {
			System.out.println("Não há valor anterior");
		}
		if (subsequente != -1) {
			System.out.println("O valor subsequente é " + subsequente);
		} else {
			System.out.println("Não há valor subsequente");
		}
		if (linha < m - 1) { 
		    abaixo = matriz[linha + 1][coluna];
		}
		if (abaixo != -1) {
		    System.out.println("O valor abaixo é " + abaixo);
		} else {
		    System.out.println("Não há valor abaixo");
		}
	
		sc.close();
	}

}
