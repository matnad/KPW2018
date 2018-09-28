package ch.unibas.kpw;

public class SecsTohhmm {
    public static void main (String[] arg) {
        /* Convert integer in_secs to a string in the format "hh:mm:ss"
           and print the string. */

        // Get int input by using javax.swing
        int in_secs;
        try {
            in_secs = Integer.parseInt(
                    javax.swing.JOptionPane.showInputDialog(null,
                            "Convert Seconds to \"hh:mm:ss\"", "Enter a number of seconds:"));
        } catch (Exception e) {
            in_secs = 0;
        }

        // Initialize output String
        String out_str = "";

        // Hours
        int hours = in_secs / 3600;
        out_str += format_int(hours) + ":";


        // Minutes
        int minutes = in_secs % 3600 / 60;
        out_str += format_int(minutes) + ":";

        // Seconds
        int seconds = in_secs % 60;
        out_str += format_int(seconds);

        // Print result
        System.out.println(out_str);
    }

    private static String format_int(int in_number) {
        /* Converts integer in_number to 2+ digit String */

        // Initialize output String
        String out_str = "";

        // If smaller than 10, add a "0" before adding the number
        if (in_number < 10) {
            out_str += "0";
        }

        // add the number to the string
        out_str += in_number;

        // return the output string
        return out_str;
    }
}


