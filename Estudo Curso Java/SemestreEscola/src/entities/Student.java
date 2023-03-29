package entities;

public class Student {
	public double firstNotes;
	public double secondNotes;
	public double thirdNotes;
	public String name;
	
	public double total() {
		return firstNotes + secondNotes + thirdNotes;
	}
	public double howMuchToPass() {
		return 60 - total();
	}
}
