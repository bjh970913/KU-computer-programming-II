import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bjh970913 on 05/10/2016.
 * KU-computer-programming-II
 */
public class Lab06_3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> points = new ArrayList<>();
        ArrayList<Double> sides = new ArrayList<>();
        ArrayList<Double> point, point2;
        Scanner scan = new Scanner(System.in);
        double in1, in2, x1, x2, y1, y2;

        System.out.print("Enter three points for a triangle: ");

        for (int i = 0; i < 3; i++) {
            in1 = scan.nextDouble();
            in2 = scan.nextDouble();

            point = new ArrayList<>();
            point.add(in1);
            point.add(in2);

            points.add(point);
        }

        for (int i = 0; i < 3; i++) {
            point = points.get(i);
            point2 = points.get((i + 1) % 3);

            x1 = point.get(0);
            y1 = point.get(1);
            x2 = point2.get(0);
            y2 = point2.get(1);
            double side = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

            sides.add(side);
        }

        double side1 = sides.get(0);
        double side2 = sides.get(1);
        double side3 = sides.get(2);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.format("The area of the triangle is %.1f", area);
    }
}
