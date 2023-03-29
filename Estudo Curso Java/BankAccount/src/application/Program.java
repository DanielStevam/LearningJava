package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	Person person;

	System.out.println("Enter Account Number: ");
	int accountNumber = sc.nextInt();
	System.out.println("Enter Account Holder: ");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.println("Is there na initial deposity (y/n)? ");
	char YesOrNo = sc.next().charAt(0);
	if(YesOrNo == 'y') {
		System.out.println("Enter initial deposit value: ");
		double initialDeposit = sc.nextDouble();
		person = new Person(accountNumber, name, initialDeposit);
		
	}else {
		person = new Person(accountNumber, name);
		}
	System.out.println("Account Data: ");
	System.out.println(person);
	
	System.out.println("");
	System.out.println("Enter a deposit value: ");
	double depositValue = sc.nextDouble();
	person.deposit(depositValue);
	System.out.println("");
	System.out.println("Updated Value: " +person);
	
	System.out.println("");
	System.out.println("Enter a withdraw value: ");
	double withdraw = sc.nextDouble();
	person.withdraw(withdraw);
	System.out.println("");
	System.out.println("Updated Value: " +person);
	
	}

	private static void accountValue(double depositValue) {
		// TODO Auto-generated method stub
		
	}
}