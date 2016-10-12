/**
 * Created by bjh970913 on 12/10/2016.
 * KU-computer-programming-II
 */
public class Lab07_2 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 50000; i > 0; i--) {
            sum += (1 / (double) i);
        }
        System.out.println(sum);
    }
}
