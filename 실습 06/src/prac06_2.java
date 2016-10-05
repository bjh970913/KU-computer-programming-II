/**
 * Created by bjh970913 on 05/10/2016.
 * KU-computer-programming-II
 */
public class prac06_2 {
    public static void main(String[] args) {
        double a, b, c, d, e, f;
        double x, y;

        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = 0.55;
        e = 44.5;
        f = 5.9;

        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);

        System.out.println("X: " + x + ", Y: " + y);
    }
}
