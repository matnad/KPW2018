package ch.unibas.kpw;

public class DictionaryTest {
	
	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		dict.insert("Haus", "house");
		dict.insert("Buch", "book");
		dict.insert("Tisch", "table");
		
		System.out.println(dict.lookup("Haus"));
		System.out.println(dict.lookup("Buch"));
		System.out.println(dict.lookup("Tisch"));
		System.out.println(dict.lookup("Stuhl"));
	}
	
}
