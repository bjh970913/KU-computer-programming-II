import java.util.Scanner;

/**
 * Created by bjh970913 on 9/28/16.
 * KU-computer-programming-II
 */
public class prac004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = scan.nextFloat();

        while (input != -1) {
            System.out.format("%f\n", Math.sin(input));
            input = scan.nextFloat();
        }
    }
}
