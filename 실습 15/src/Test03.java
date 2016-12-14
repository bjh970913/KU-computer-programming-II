import java.util.ArrayList;

/**
 * Created by bjh970913 on 14/12/2016.
 * KU-computer-programming-II
 */
public class Test03 {
    public static void main(String [] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(new Integer(3));
        a.add(new Integer(1));
        a.add(new Integer(2));
        MyCmp cmp = new MyCmp();
        a.sort(cmp);
        System.out.println(a);
    }
}
