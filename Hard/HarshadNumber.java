//Recursion: Harshad Number

public class HarshadNumber {
	public static boolean isHarshad(int n) {
		int r=0,i=n;
		while(i>0) {
			r+=i%10;
			i/=10;
		}
		return n%r==0;
	}
}
