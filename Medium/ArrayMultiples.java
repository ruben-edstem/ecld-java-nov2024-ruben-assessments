//Array of Multiples

import java.util.*;

public class Program {
	public static int[] arrayOfMultiples(int a, int b) {
		int[] arr = new int[b];
		for(int i=0;i<b;i++) {
			arr[i]=a*(i+1);
		}
		return arr;
	}
}
