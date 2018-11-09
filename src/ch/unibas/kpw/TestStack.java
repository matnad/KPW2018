package ch.unibas.kpw;

public class TestStack {

	public static void main(String[] args) {
		// Stack s = new Stack(10);
		java.util.Stack s = new java.util.Stack<String>();
		s.push(3);
		s.push(5);
		int x = (int)s.pop() - (int)s.pop();
		// x == 2 (d.h. 5 - 3)
		System.out.println(x);
	}

}
