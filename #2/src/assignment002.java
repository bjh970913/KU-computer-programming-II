/**
 * Created by bjh970913 on 9/19/16.
 * KU-computer-programming-II
 */
public class assignment002 {
    public static void main(String[] args) {
        assignment002 obj = new assignment002();
        System.out.println("method_1 = " + obj.method_1());
        System.out.println("method_2 = " + obj.method_2());
        System.out.println("method_3 = " + obj.method_3());
    }

    private int method_1() {
        int result = 1;

        for (int i = 1; i <= 12; i++) {
            result *= i;
        }
        return result;
    }

    private int method_2() {
        int result = 0;

        for (int i = 1; i <= 255; i++) {
            result += Math.pow((double) i, 2.0);
        }
        return result;
    }

    private int method_3() {
        int result = 1;
        int number = 997;

        for (int i = 2; i < (number / 2); i++) {
            if (number % i == 0) {
                result = 0;
            }
        }
        return result;
    }
}
