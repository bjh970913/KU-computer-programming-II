/**
 * Created by bjh970913 on 23/11/2016.
 * KU-computer-programming-II
 */
public class Point {
    private double[] vec;

    Point() {
        this(10, 10);
        System.out.println("Point()");
    }

    Point(double x, double y) {
        System.out.println("Point(double,double)");
        vec = new double[2];
        vec[0] = x;
        vec[1] = y;
    }

    Point(int dim) {
        vec = new double[dim];
        for (int i = 0; i < vec.length; i++) {
            vec[0] = 0;
        }
    }

    public double getX() {
        return vec[0];
    }

    public double getY() {
        return vec[1];
    }

    public double dim() {
        return vec.length;
    }

    public double getI(int i) {
        if (i >= dim()) {
            System.out.println("Error!");
            return 0;
        }
        return vec[i];
    }

    public double distance(Point other) {
        if (dim() != other.dim()) {
            System.out.println("Error!");
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < dim(); i++) {
            sum += Math.pow(vec[i] - other.getI(i), 2);
        }

        return Math.sqrt(sum);
    }
}