package ch.unibas.kpw;
import java.util.HashMap;

public class Dictionary {
	
	private HashMap<String, String> dict;
	
	public Dictionary() {
		dict = new HashMap<>();
	}
	
	public void insert (String key, String value) {
		dict.put(key, value);
	} 
	
	public String lookup (String key) {
		return dict.get(key);
	}

}
