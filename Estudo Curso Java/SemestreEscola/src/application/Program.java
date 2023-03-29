package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student x;
		x = new Student();
		
		System.out.println("Name of student and her notes: ");
		x.name = sc.nextLine();
		x.firstNotes = sc.nextDouble();
		x.secondNotes = sc.nextDouble();
		x.thirdNotes = sc.nextDouble();
		
		if(x.total()>=60) {
			System.out.print("Final Grade: "+x.total()+
					"\nPassed");
		}else {
			System.out.print("Final Grade: "+x.total()+
					"\nFailed"+
					"\nMissing "+x.howMuchToPass()+"Points");
		}
	}
}
