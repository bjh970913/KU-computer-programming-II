import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by bjh970913 on 05/10/2016.
 * KU-computer-programming-II
 */
public class Lab06_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int tmp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three integers : ");

        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());

        Collections.sort(arr);

        System.out.println(arr.toString());
    }
}
