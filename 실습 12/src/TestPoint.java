/**
 * Created by bjh970913 on 23/11/2016.
 * KU-computer-programming-II
 */
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(40, 50);
        System.out.println("distance = " + p1.distance(p2));
    }
}