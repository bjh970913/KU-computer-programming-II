import java.util.Scanner;

/**
 * Created by bjh970913 on 05/10/2016.
 * KU-computer-programming-II
 */
public class Lab06_4 {
    public static void main(String[] args) {
        double a, b, c;
        double r1, r2;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        r1 = ((-1 * b) + Math.pow(b * b - (4 * a * c), 0.5)) / (2 * a);
        r2 = ((-1 * b) - Math.pow(b * b - (4 * a * c), 0.5)) / (2 * a);

        System.out.format("The equation has two roots %f and %f", r1, r2);
    }
}
