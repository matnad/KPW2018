package ch.unibas.kpw;

public class Woerterbuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dictionary d = new Dictionary(100);
		java.util.Map d = new java.util.HashMap();
		In.open("inputDict.txt");
		String key = In.readWord();
		while (In.done()) {
			String value = In.readWord();
//			d.insert(key, value);
			d.put(key,  value);
			key = In.readWord();
		}
		In.close();
		
		System.out.print("Geben Sie ein Suchwort (wie z.B Feuer Regen, Haus / Ende = Strg-Z) ein: ");		
		key = In.readWord();
		while (In.done()) {
//			String value = d.lookup(key);
			String value = (String) d.get(key);
			System.out.println(key + " => " + value);
			key = In.readWord();
		}
	}

}
