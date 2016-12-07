import java.util.ArrayList;

/**
 * Created by bjh970913 on 07/12/2016.
 * KU-computer-programming-II
 */
public class Prime {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        int n = 120;
        for (int i = 0; i < n; i++) {
            al.add(1);
        }
        al.set(0, 0);
        al.set(1, 0);
        for (int i = 2; i < n; i++) {
            for (int j = 2; i * j < n; j++) {
                al.set(i * j, 0);
            }
        }
        for (int i = 0; i < n; i++) {
            if ((Integer) (al.get(i)) > 0) {
                System.out.println(i);
            }
        }
    }
}
