package ch.unibas.kpw;

public class ZahlenSort {

	public static void main(String[] args) {
//		In.open("zahlen.txt");
//		String zahlen = In.readFile();
//		System.out.println(zahlen);
		String zahlen = "12,15,18,1,5";
		String[] str_arr = zahlen.split(",");
		final int n = str_arr.length;
		
		/**
		 * input von string zu integer
		 */
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(str_arr[i]); 
		}
		
		int temp = 0;
		boolean done = false;
		/**
		 * vertauschen wenn falsche reihenfolge bis nichts mehr vertauscht wird
		 */
		while(!done) {
			done = true;
			for (int i=0;i<n-1;i++) {
				
				if (arr[i] < arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					done = false;
				}
			}
		}
		for (int z: arr) {
			System.out.println(z);
		}
	}

}
