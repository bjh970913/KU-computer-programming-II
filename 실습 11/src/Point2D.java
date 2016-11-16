/**
 * Created by bjh970913 on 16/11/2016.
 * KU-computer-programming-II
 */
public class Point2D {
    private double x, y;

    public Point2D() {
        x = 0;
        y = 0;
    }

    public Point2D(Point2D other) {
        x = other.getX();
        y = other.getY();
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distance(double x, double y) {
        return Math.pow(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2), 0.5);
    }

    public double distance(Point2D other) {
        return distance(other.getX(), other.getY());
    }
}
