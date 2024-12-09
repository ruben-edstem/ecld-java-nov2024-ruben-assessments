//How Many Solutions Does This Quadratic Have

package edabit.java.ruben.medium;

public class SolutionQuadratic {
    public static int solutions(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);
        if (d > 0) {
            return 2;
        } else if (d == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solutions(1, 0, -1));  //2 
        System.out.println(solutions(1, 0, 0));   //1
        System.out.println(solutions(1, 0, 1));   //0
        System.out.println(solutions(2, 4, 2));   //1
        System.out.println(solutions(1, -2, 1));  //1
        System.out.println(solutions(1, 2, 3));   //0
    }
}
