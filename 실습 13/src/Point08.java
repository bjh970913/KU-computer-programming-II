/**
 * Created by bjh970913 on 30/11/2016.
 * KU-computer-programming-II
 */
public class Point08 implements Geom08 {
    private double x, y;

    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
