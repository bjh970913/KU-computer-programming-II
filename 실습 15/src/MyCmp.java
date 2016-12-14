import java.util.Comparator;

/**
 * Created by bjh970913 on 14/12/2016.
 * KU-computer-programming-II
 */
public class MyCmp implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        return x - y;
    }
}