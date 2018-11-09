package ch.unibas.kpw;

class Queue {
	int[] data;
	int head, tail, n;

	Queue(int size) {
		data = new int[size];
		head = 0;
		tail = 0;
		n = 0;
	}

	void put(int x) {
		if (n == data.length)
			System.out.println("-- overflow");
		else {
			data[tail] = x;
			n++;
			tail = (tail + 1) % data.length;
		}
	}

	int get() {
		if (n == 0) {
			System.out.println("-- underflow");
			return 0;
		} else {
			int x = data[head];
			n--;
			head = (head + 1) % data.length;
			return x;
		}
	}
}