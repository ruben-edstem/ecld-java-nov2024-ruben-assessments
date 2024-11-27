//Recursion: Harshad Number
package edabit.java.ruben;

public class HarshadNumber {
    public static int calcDigitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return calcDigitSum(n / 10) + n % 10;
    }

    public static boolean isHarshad(int n) {
        if (n == 0) {
            return false;
        }
        int digitSum = calcDigitSum(n);
        return n % digitSum == 0;
    }

    public static void main(String[] args) {
        System.out.println(isHarshad(75)); //false
        System.out.println(isHarshad(171)); //true
        System.out.println(isHarshad(481)); //true
        System.out.println(isHarshad(89)); //false
        System.out.println(isHarshad(516)); //true
        System.out.println(isHarshad(214)); //false
        System.out.println(isHarshad(209)); //true
        System.out.println(isHarshad(12335)); //false
    }
}
