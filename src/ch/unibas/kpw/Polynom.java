package ch.unibas.kpw;

/**
 * Code parts taken from: https://www.programcreek.com/java-api-examples/index.php?source_dir=wattzap-ce-master/src/com/wattzap/model/power/Cubic.java
 */

public class Polynom {

    private static final double TWO_PI = 2.0 * Math.PI;
    private static final double FOUR_PI = 4.0 * Math.PI;

    /**
     * The number of real roots.
     */
    public int nRoots;

    /**
     * The first real root.
     */
    public double x1;

    /**
     * The second real root.
     */
    public double x2;

    /**
     * The third real root.
     */
    public double x3;

    /**
     * Solve the cubic equation with the given coefficients. The results are
     * stored in this Cubic object's fields.
     *
     * @param  a  Coefficient of <I>x</I><SUP>3</SUP>.
     * @param  b  Coefficient of <I>x</I><SUP>2</SUP>.
     * @param  c  Coefficient of <I>x</I>.
     * @param  d  Constant coefficient.
     *
     * @exception  DomainException
     *     (unchecked exception) Thrown if <TT>a</TT> is 0; in other words, the
     *     coefficients do not represent a cubic equation.
     */
    public void solve(double a, double b, double c, double d){
        // Verify preconditions.
        if (a == 0.0)
        {
            throw new RuntimeException ("Cubic.solve(): a = 0");
        }

        // Normalize coefficients.
        double denom = a;
        a = b/denom;
        b = c/denom;
        c = d/denom;

        // Commence solution.
        double a_over_3 = a / 3.0;
        double Q = (3*b - a*a) / 9.0;
        double Q_CUBE = Q*Q*Q;
        double R = (9*a*b - 27*c - 2*a*a*a) / 54.0;
        double R_SQR = R*R;
        double D = Q_CUBE + R_SQR;

        if (D < 0.0)
        {
            // Three unequal real roots.
            nRoots = 3;
            double theta = Math.acos (R / Math.sqrt (-Q_CUBE));
            double SQRT_Q = Math.sqrt (-Q);
            x1 = 2.0 * SQRT_Q * Math.cos (theta/3.0) - a_over_3;
            x2 = 2.0 * SQRT_Q * Math.cos ((theta+TWO_PI)/3.0) - a_over_3;
            x3 = 2.0 * SQRT_Q * Math.cos ((theta+FOUR_PI)/3.0) - a_over_3;
            sortRoots();
        }
        else if (D > 0.0)
        {
            // One real root.
            nRoots = 1;
            double SQRT_D = Math.sqrt (D);
            double S = Math.cbrt (R + SQRT_D);
            double T = Math.cbrt (R - SQRT_D);
            x1 = (S + T) - a_over_3;
            x2 = Double.NaN;
            x3 = Double.NaN;
        }
        else
        {
            // Three real roots, at least two equal.
            nRoots = 3;
            double CBRT_R = Math.cbrt (R);
            x1 = 2*CBRT_R - a_over_3;
            x2 = x3 = CBRT_R - a_over_3;
            sortRoots();
        }
    }

    /**
     * Sort the roots into descending order.
     */
    private void sortRoots()
    {
        if (x1 < x2)
        {
            double tmp = x1; x1 = x2; x2 = tmp;
        }
        if (x2 < x3)
        {
            double tmp = x2; x2 = x3; x3 = tmp;
        }
        if (x1 < x2)
        {
            double tmp = x1; x1 = x2; x2 = tmp;
        }
    }

    /**
     * Function to round the results.
     * @param dec_places number of decimal places to round to.
     */
    private void round(int dec_places)
    {
        double round_modifier = Math.pow(10.0, dec_places);
        x1 = Math.round(x1 * round_modifier) / round_modifier;

        if (nRoots == 3) {
            x2 = Math.round(x2 * round_modifier) / round_modifier;
            x3 = Math.round(x3 * round_modifier) / round_modifier;
        }
    }

    /**
     * Unit test main program.
     */
    public static void main (String[] arg) {

        double a = 2;
        double b = -3;
        double c = -5;
        double d = 6;

        Polynom  poly = new Polynom();
        poly.solve(a,b,c,d);

        // optional rounding due to machine precision
        poly.round(5);

        System.out.println("x1 = " + poly.x1);
        if (poly.nRoots == 3) {
            System.out.println("x2 = " + poly.x2);
            System.out.println("x3 = " + poly.x3);
        }
    }
}
