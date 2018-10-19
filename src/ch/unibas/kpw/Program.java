package ch.unibas.kpw;

public class Program {
	static int factor = 10;

	static int max(int a, int b) {
		/* 3 */ if (a > b)
			return a;
		else
			return b;
	}

	static int compute(int x) {
		/* 2 */int y = factor * max(x, 0);
		return y;
	}

	public static void main(String[] args) {
		/* 1 */int n = 0;
		try {
			n = Integer.parseInt(
					javax.swing.JOptionPane.showInputDialog(null, "Benutzereingabe (Titel)", "Bitte Zahl eingeben"));
		} catch (Exception e) {
			n = 0;
		}
		;
		System.out.println(compute(n));
	}
}