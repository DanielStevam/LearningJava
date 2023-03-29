package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter the Name , Gross Salary, Tax: ");
		emp.name = sc.nextLine();
		emp.grossSalary = sc.nextDouble();
		emp.tax = sc.nextDouble();
		
		System.out.println("Name: "+emp.name+" Gross Salary: "+emp.grossSalary);
		System.out.println("Employee: "+emp);
		
		System.out.println("Which percentage to increse in salary");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println("Update data: " +emp);
		sc.close();
		
		}
	}