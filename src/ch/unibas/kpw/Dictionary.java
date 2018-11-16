package ch.unibas.kpw;

class Dictionary {
	Entry[] e;
	int nextFree;
	int size;
	
// Constructor
	Dictionary(int size) {
		e = new Entry[size];
		this.size = size;
		nextFree = 0;
	}

	void insert(String key, String value) {
		if (nextFree < size) {
			int i = 0;
			while (i < nextFree && !key.equals(e[i].key))
				i++;
			// i >= nextFree || key.equals(e[i].key)
			if (i >= nextFree)
				e[nextFree++] = new Entry(key, value);
			else // key.equals(e[i].key)
				e[i].value = value;
		} else
			System.out.println("-- dictionary full");
	}

	String lookup(String key) {
		for (int i = 0; i < nextFree; i++)
			if (key.equals(e[i].key))
				return e[i].value;
		return null;
	}
}

