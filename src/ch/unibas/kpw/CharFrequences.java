package ch.unibas.kpw;

public class CharFrequences {

	public static void main(String[] args) {
		In.open("textfile.txt");
		String file = In.readFile();
		
		char[] text_arr = file.toCharArray();
		int[] count = new int[Character.MAX_VALUE];
		
		for(char c: text_arr) {
			count[c] += 1;
		}
		
		for(int i=0;i<Character.MAX_VALUE;i++) {
			if (count[i] > 0) {
				String char_str = Character.getName(i);
				//char char_str = (char) i;
				String out_str = char_str + ": ";
				for (int j=0;j<count[i];j++) {
					out_str += "*";
				}
				System.out.println(out_str);
			}
		}

	}
}
