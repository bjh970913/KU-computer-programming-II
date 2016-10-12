/**
 * Created by bjh970913 on 12/10/2016.
 * KU-computer-programming-II
 */
public class Lab07_3 {
    public static void main(String[] args) {
        double arr[] = new double[100000 + 1];  // arr[x] = 1/factorial(x)

        arr[0] = 1.0;

        for (int i = 1; i <= 100000; i++) {
            arr[i] = arr[i - 1] / (double) i;
        }

        double sum = 0, diff = 0;

        for (int i = 200; i >= 0; i--) {
            sum += arr[i];
        }
        System.out.println("Estimated e with n=200    : " + sum);

        for (int i = 100000; i > 200; i--) {
            sum += arr[i];
            diff += arr[i];
        }
        System.out.println("Estimated e with n=100000 : " + sum);
        System.out.println("Difference is  : " + diff);
    }
}
