package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Dollar;

public class Program {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Dollar dollar = new Dollar();
		
		System.out.println("What is the dollar price: ");
		dollar.dollar = sc.nextDouble();
		System.out.println("How many dollar do you wanna buy: ");
		dollar.real = sc.nextDouble();
		System.out.println("Amount to be baid in reais: "+dollar.CurrencyConverter());
	}
}
