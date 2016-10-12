/**
 * Created by bjh970913 on 12/10/2016.
 * KU-computer-programming-II
 */
public class Lab07_2 {
    public static void main(String[] args) {
        double sum_rtl = 0, sum_ltr = 0;
        for (int i = 50000; i > 0; i--) {
            sum_rtl += (1 / (double) i);
            sum_ltr += (1 / (double) (50001 - i));
        }
        System.out.println("From right to left : " + sum_rtl);
        System.out.println("From left to right : " + sum_ltr);
    }
}
