package application;

import java.util.Scanner;
import java.util.Locale;
 
import entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x,y;
		x = new Rectangle();
		
		System.out.println("Enter the measures of rectangle X:");
			x.width = sc.nextDouble();
			x.height = sc.nextDouble();
		
		double area = x.area();
			System.out.println("Area: "+area);
		double perimeter = x.perimeter();
		System.out.println("Perimeter: "+perimeter);
		double diagonal = x.diagonal();
		System.out.println("Diagonal : "+diagonal);
		
	}
	}