/**
 * Created by bjh970913 on 02/11/2016.
 * KU-computer-programming-II
 */
public class Rectangle extends Point {
    double w, h;

    Rectangle(double initx, double inity, double initw, double inith) {
        super(initx, inity);
        w = initw;
        h = inith;
    }

    boolean isHit(Point p) {
        return (x <= p.x) && (p.x <= x + w) && (y <= p.y) && (p.y <= y + h);
    }

    Point getCenter() {
        return new Point(x + w / 2, y + h / 2);
    }
}
