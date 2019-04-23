package util;

public class CurrencyConverter {
	public double valDolar;
	public double quantDolar;

	public double calc() {
		double calcFinal = valDolar * quantDolar;
		return calcFinal += calcFinal * 0.06;
	}

}
