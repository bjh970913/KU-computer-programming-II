import java.util.Scanner;

/**
 * Created by bjh970913 on 19/10/2016.
 * KU-computer-programming-II
 */
public class Lab08_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in, i, j;

        in = scan.nextInt();

        for (i = 1; i <= in; i++) {
            for (j = in - i; j > 0; j--) {
                System.out.print("    ");
            }
            for (j = i; j >= 1; j--) {
                System.out.format("%4d", j);
            }
            for (j = 2; j <= i; j++) {
                System.out.format("%4d", j);
            }
            System.out.print("\n");
        }
    }
}
