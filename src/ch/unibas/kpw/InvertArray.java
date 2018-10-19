package ch.unibas.kpw;

import java.util.Arrays;

public class InvertArray {

	public static void main(String[] args) {
		
		//invert vector
		int[] a = {1,2,3,4,5,6};
		int[] b = invert(a);
		System.out.println(Arrays.toString(b));
		
		//transpose matrix 
		int[][] c = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] d = transpose(c);
		
		for (int i = 0; i < d.length; i++) {
		    for (int j = 0; j < d[i].length; j++) {
		        System.out.print(d[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
	public static int[] invert(int[] a) {
		int[] b = new int[a.length];
		for (int i=0;i<a.length;i++) {
			b[a.length-i-1] = a[i];
		}
		return b;
	}
	
	public static int[][] transpose(int[][] a) {
		int[][] b = new int[a.length][a.length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}

}
