/**
 * Created by bjh970913 on 14/12/2016.
 * KU-computer-programming-II
 */

import java.util.ArrayList;

public class Test_01 {
    public static void main(String [] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(new Integer(1));
        a.add(new Integer(2));
        a.add(new Integer(3));
        for(Integer i : a) {
            System.out.println(i);
        }
    }
}
