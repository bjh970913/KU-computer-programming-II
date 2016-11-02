/**
 * Created by bjh970913 on 02/11/2016.
 * KU-computer-programming-II
 */
public class Circle extends Point {
    double r;

    Circle(double initx, double inity, double initr) {
        super(initx, inity);
        r = initr;
    }

    Point getCenter() {
        return new Point(x, y);
    }

    boolean isHit(Point p) {
        return distance(p) <= r;
    }

    boolean isHit(Circle c) {
        Point p = new Point(c.x, c.y);
        return distance(p) <= r + c.r;
    }

    boolean isHit(Rectangle r) {
        Boolean collisionDetected = false;
        Point circleCenter = getCenter();
        Point rectCenter = r.getCenter();
        int nZone = GetRectZone(r);

        switch (nZone) {
            // top, bottom 변의 영역에서, 원의 센터와 수직거리를 검사한다.
            case 1:
            case 7: {
                Double distY = Math.abs(rectCenter.y - circleCenter.y);
                if (distY <= this.r + r.h / 2) {
                    collisionDetected = true;
                }
            }
            break;
            // left, right 변의 영역에서. 원의 센터와 수평거리를 검사한다.
            case 3:
            case 5: {
                Double distX = Math.abs(rectCenter.x - circleCenter.x);
                if (distX <= this.r + r.w / 2) {
                    collisionDetected = true;
                }
            }
            break;
            // 사각형 영역의 내부
            case 4:
                collisionDetected = true;
                break;
            // 모서리 영역, 모서리가 원의 내부에 포함되는지 검사한다.
            default: {
                Double cornerX = (nZone == 0 || nZone == 6) ? r.x : r.x + r.w;
                Double cornerY = (nZone == 0 || nZone == 2) ? r.y : r.y + r.h;
                Point corner = new Point(cornerX, cornerY);
                if (this.isHit(corner))
                    collisionDetected = true;
            }
            break;
        }

        return collisionDetected;
    }

    int GetRectZone(Rectangle r) {
        int xZone = (x < r.x) ? 0 :
                (x > r.x + r.w) ? 2 : 1;
        int yZone = (y < r.y) ? 0 :
                (y > r.y + r.h) ? 2 : 1;
        int nZone = xZone + 3 * yZone;
        return nZone;
    }


}
