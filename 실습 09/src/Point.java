/**
 * Created by bjh970913 on 02/11/2016.
 * KU-computer-programming-II
 */
public class Point {
    double x, y;

    Point(double initx, double inity) {
        x = initx;
        y = inity;
    }

    double distance(Point p) {
        return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }
}
