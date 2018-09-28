package ch.unibas.kpw;

public class Round100 {
    public static void main (String[] arg) {
        /* Round positive and negative integers to the next multiple of 100 */

        // Get int input by using javax.swing
        int in_x;
        try {
            in_x = Integer.parseInt(
                    javax.swing.JOptionPane.showInputDialog(null,
                            "Round to the next 100", "Enter a number to round"));
        } catch (Exception e) {
            in_x = 0;
        }

        int out_x = (int) in_x / 100 * 100; // Round down for positive numbers and up for negative
        int mod = in_x % 100; // Get modulo
        if (mod >= 50) {
            out_x += 100;  // If modulo is 50 or higher add 100 (round up for positive numbers)
        } else if (mod < -50) {
            out_x -= 100;  // If modulo is -50 or lower subtract 100 (round down for negative numbers)
        }

        // Print results
        System.out.println(out_x);
    }
}
