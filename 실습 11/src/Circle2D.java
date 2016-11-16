/**
 * Created by bjh970913 on 16/11/2016.
 * KU-computer-programming-II
 */
public class Circle2D {
    private Point2D center;
    private double radious;

    public Circle2D() {
        center = new Point2D();
        radious = 1;
    }

    public Circle2D(Point2D center, double radious) {
        this.center = new Point2D(center);
        this.radious = radious;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadious() {
        return radious;
    }

    public double getArea() {
        return Math.PI * radious * radious;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radious;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

    public boolean contains(Point2D other) {
        return center.distance(other) <= radious;
    }

    public boolean contains(double x, double y) {
        return center.distance(x, y) <= radious;
    }

    public boolean contains(Circle2D other) {
        return center.distance(other.getCenter()) + other.getRadious() < radious;
    }

    public boolean overlaps(Circle2D other) {
        return center.distance(other.getCenter()) < (radious + other.getRadious());
    }
}
