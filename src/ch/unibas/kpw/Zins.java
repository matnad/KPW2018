package ch.unibas.kpw;

public class Zins {

	public static void main(String[] args) {
		int jahre = getAmount(3.5);
		System.out.println(jahre);

	}
	
	static int getAmount(double p) {
		double kapital = 100;
		int jahr = 0;
		while(kapital < 1000) {
			kapital *= (1+p/100);
			jahr++;
		}
		return jahr;
	}
	
}
