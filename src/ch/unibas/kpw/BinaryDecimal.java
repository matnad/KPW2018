package ch.unibas.kpw;

public class BinaryDecimal {
	public static void main(String[] args) {
		
		char[] binary_array = args[0].toCharArray();
		
		int dec = 0;
		int bin_len = binary_array.length; 
		
		for(int i=bin_len-1; i >= 0; i--) {
			int bn = Character.getNumericValue(binary_array[i]);	
			dec += Math.pow(2,bin_len-1-i)*bn;
		}
		
		System.out.println(dec);

	}
}
