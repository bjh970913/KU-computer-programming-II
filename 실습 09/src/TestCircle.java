/**
 * Created by bjh970913 on 02/11/2016.
 * KU-computer-programming-II
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(0, 0, 1);
        Point p1 = new Point(0.5, 0.5);
        Point p2 = new Point(1, 1);
        Circle c1 = new Circle(1, 1, 1);
        Circle c2 = new Circle(2, 2, 1);
        Rectangle r1 = new Rectangle(1, 1, 1, 1);
        Rectangle r2 = new Rectangle(0.5, 0.5, 1, 1);
        Rectangle r3 = new Rectangle(-2, -2, 4, 4);
        System.out.println(c.isHit(p1));
        System.out.println(c.isHit(p2));
        System.out.println(c.isHit(c1));
        System.out.println(c.isHit(c2));
        System.out.println(c.isHit(r1));
        System.out.println(c.isHit(r2));
        System.out.println(c.isHit(r3));
    }
}
