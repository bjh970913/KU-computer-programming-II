import java.util.ArrayList;

/**
 * Created by bjh970913 on 14/12/2016.
 * KU-computer-programming-II
 */
public class Test05 {
    public static void main(String [] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(new Integer(1));
        a1.add(new Integer(2));
        a1.add(new Integer(3));
        ArrayList<Integer> a2 = new ArrayList<>(a1);
        a2.add(new Integer(4));
        System.out.println(a1);
    }
}
