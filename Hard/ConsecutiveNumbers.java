//Consecutive Numbers

import java.util.*;
public class Challenge {
	public static boolean cons(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]!=1){
				return false;
			}
		}
		return true;
	}
}
