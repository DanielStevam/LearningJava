package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o tanto de numeros que vai digitar: ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int i = 0;i < n ; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
			System.out.println("Numeros Negativos ");
		for(int i = 0;i < n ; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
		}
			}
		sc.close();
		}
	}
