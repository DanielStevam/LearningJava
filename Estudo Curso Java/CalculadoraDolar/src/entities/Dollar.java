package entities;

public class Dollar {
	public double dollar;
	public double real;

	public double CurrencyConverter() {
		return (dollar*real)*6/100 +(dollar*real);
	}
}
