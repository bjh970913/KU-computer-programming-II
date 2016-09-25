import java.util.Scanner;

/**
 * Created by bjh970913 on 9/26/16.
 * KU-computer-programming-II
 */
public class Lab02 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter (int): ");
        number = scan.nextInt();
        System.out.println(number + " + 1 = " + (number + 1));
    }
}
