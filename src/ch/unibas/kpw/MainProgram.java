package ch.unibas.kpw;

public class MainProgram {

	public static void main(String[] args) {
		System.out.println("" + C1.s );
		C1 c = new C1(500);
		c.setA(400);
		System.out.println("" + c.getA());
	}

}
