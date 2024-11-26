//How Many Solutions Does This Quadratic Have

public class Challenge {
	public static int solutions(int a, int b, int c) {
		int d = (b*b)-(4*a*c);
		if(d>0) {
			return 2;
		}
		else if(d==0) {
			return 1;
		}
		else {
			return 0;
		}
  }
}
