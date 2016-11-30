/**
 * Created by bjh970913 on 30/11/2016.
 * KU-computer-programming-II
 */
public class InvalidRadius04 extends Exception {
    private double r;

    InvalidRadius04(double r) {
        super("Radius = " + r);
        this.r = r;
    }

    public double getRadius() {
        return r;
    }
}