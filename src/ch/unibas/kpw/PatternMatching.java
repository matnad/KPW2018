package ch.unibas.kpw;

public class PatternMatching {

	public static void main(String[] args) {
		boolean match = matches("Test.java", "T*.java");
		System.out.println(match);
	}

	static boolean matches(String t, String pat) {

		char[] ta = t.toCharArray();
		char[] pata = pat.toCharArray();
		
		int wildcard = pat.indexOf('*');
		
		for (int i = 0; i < wildcard; i++) {
			if(ta[i] != pata[i])
				return false;
		}
		
		for (int i = pata.length-1, j = ta.length-1; i > wildcard; i--, j--) {
			if(ta[j] != pata[i])
				return false;		
		}
		
		return true;
	}
}
