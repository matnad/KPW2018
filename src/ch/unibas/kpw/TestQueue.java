package ch.unibas.kpw;

public class TestQueue {

	public static void main(String[] args) {
		// Queue q = new Queue(10);
		java.util.Queue q = new java.util.LinkedList();
		q.add(3);
		q.add(6);
		// q.put(3);
		// q.put(6);
		//int x = q.get(); // x == 3 int y = q.get();// y == 6
		int x = (int) q.remove();
		System.out.println(x);
	}

}
