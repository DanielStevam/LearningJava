package application;

import java.util.Scanner;

public class Program {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao cadastradas: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0; i<n; i++ ){
			System.out.println("Dados da "+(i+1)+" Pessoa");
			System.out.printf("Nome:");
			nome[i] = sc.next();
			System.out.printf("Idade:");
			idade[i] = sc.nextInt();
			System.out.printf("Altura:");
			altura[i] = sc.nextDouble();
			
		}
		double somaAltura = 0;
		for(int i = 0; i<n; i++) {
			somaAltura = somaAltura + altura[i];
		}
		double media = somaAltura/n;
		System.out.printf("Altura media: %.2f%n ", media);
		
		int somaIdade = 0;
		for(int i= 0; i<n;i++) {
			if(idade[i] <16) {
				somaIdade = somaIdade + 1;
			}
		}
		double porcentagem = (somaIdade*10)/(n);
		System.out.printf("Porcentagem pessoa abaixo dos 16 anos: %.1f%%%n ", porcentagem);
		
		for(int i= 0; i<n;i++) {
			if(idade[i]<16) {
				System.out.printf(nome[i]);
			}
		}
		sc.close();
	}
}
