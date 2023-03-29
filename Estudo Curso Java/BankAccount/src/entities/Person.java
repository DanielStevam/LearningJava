package entities;

public class Person {
	private int accountNumber;
	private String name;
	private double accountValue;	

public Person(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
}
public Person(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
}	
	
public void deposit(double amount){
	accountValue += amount;
}
public void withdraw(double amount){
	accountValue -= amount + 5;
}
public int getAccountNumber() {
	return accountNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAccountValue() {
	return accountValue;
}
public String toString() {
	return "Account: "+accountNumber +", Holder: "+name+ ", Balance:"+accountValue;
}
}