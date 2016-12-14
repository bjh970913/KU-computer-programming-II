import java.util.Calendar;

/**
 * Created by bjh970913 on 09/12/2016.
 * KU-computer-programming-II
 */
public class CalTest {
    public static void main(String args[]) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        System.out.println(cal1.getTime());

        cal1.set(Calendar.HOUR_OF_DAY, 0);
        cal1.set(Calendar.MINUTE, 0);
        cal1.set(Calendar.SECOND, 0);

        cal2.set(Calendar.HOUR_OF_DAY, 0);
        cal2.set(Calendar.MINUTE, 0);
        cal2.set(Calendar.SECOND, 0);

        System.out.println(cal1.getTime());
        System.out.println(cal2.getTime());

        cal2.add(Calendar.SECOND, -1);

        cal1 = cal2;

        System.out.println(cal2.before(cal1));

        System.out.println(cal1.getTime());
        System.out.println(cal2.getTime());
    }
}
