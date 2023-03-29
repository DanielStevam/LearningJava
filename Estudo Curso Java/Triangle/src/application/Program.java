package application;

import java.util.Scanner;
import java.util.Locale;
 
import entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
			
		System.out.println("Enter the measures of triangule X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangule Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
	
		double areaX = x.area();		
		double areaY = y.area();
		System.out.println("Area X =" +areaX);
		System.out.println("Area Y =" +areaY);
		
		if(areaX > areaY) {
			System.out.println("Area X is bigger" +areaX);
		}
		else {
			System.out.println("Area Y is bigger " +areaY);
		}
	}
}