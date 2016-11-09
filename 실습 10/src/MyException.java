import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bjh970913 on 09/11/2016.
 * KU-computer-programming-II
 */
public class MyException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (; ; ) {
            try {
                int x = input.nextInt();
                int y = input.nextInt();
                System.out.format("%d/%d = %d\n", x, y, x / y);
            } catch (InputMismatchException ex) {
                System.out.println("Really an integer? Try again");
                input.nextLine();
            } catch (ArithmeticException ex) {
                System.out.println("Division by zero?");
            } finally {
                System.out.println("Always called");
            }
        }
    }
}
