package ch.unibas.kpw;

public class BinaryDecimal {
	public static void main(String[] args) {
		
		// Get String input by using javax.swing
		String in_x;
        try {
            in_x = javax.swing.JOptionPane.showInputDialog(null,
                            "Binary to Decimal", "Enter sequence of 0's and 1's.");
        } catch (Exception e) {
            in_x = "0";
        }
		
        char[] binary_array = in_x.toCharArray();
		
		int dec = 0;
		int a = 1;
		int bin_len = binary_array.length;
		
		for(int i=bin_len-1; i >= 0; i--) {
			int bn = Character.getNumericValue(binary_array[i]);	
			dec += bn*a;
			a *= 2;
		}
		
		System.out.println(dec);

	}
}
