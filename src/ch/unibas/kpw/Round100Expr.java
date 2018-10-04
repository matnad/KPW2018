package ch.unibas.kpw;

public class Round100Expr {
    public static void main (String[] arg) {
        /* Round positive and negative integers to the next multiple of 100
        *  Using only 1 expression. */

        // Get int input by using javax.swing
        int in_x;
        try {
            in_x = Integer.parseInt(
                    javax.swing.JOptionPane.showInputDialog(null,
                            "Round to the next 100", "Enter a number to round"));
        } catch (Exception e) {
            in_x = 0;
        }

        // Round in one Expression
        int out_x = in_x  / 100 * 100 + (in_x % 100 >= 50 ? 1 : 0) * 100 - (in_x % 100 < -50 ? 1 : 0) * 100;


        // Print result
        System.out.println(out_x);
    }
}
