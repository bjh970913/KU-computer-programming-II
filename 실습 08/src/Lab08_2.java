import java.util.Scanner;

/**
 * Created by bjh970913 on 19/10/2016.
 * KU-computer-programming-II
 */
public class Lab08_2 {
    public static boolean isSorted(int[] list) {
        boolean flag = true;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                flag = false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int list[], length, i;

        length = scan.nextInt();
        list = new int[length];

        for (i = 0; i < length; i++) {
            list[i] = scan.nextInt();
        }

        System.out.print("The list is ");
        if (isSorted(list)) {
            System.out.print("already");
        } else {
            System.out.print("not");
        }
        System.out.println(" sorted");
    }
}
