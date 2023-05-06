package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] matriz = new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;n++) {
				System.out.println("Escreva os numeros: ");
				matriz[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("Diagonal");
		for(int i=0;i<n;i++) {
			System.out.println(matriz[i][i] + " ");
		}
		
		int contador = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		System.out.println("Numeros Negativos: " +contador);
		sc.close();
	}

}
