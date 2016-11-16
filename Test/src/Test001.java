/**
 * Created by bjh970913 on 16/11/2016.
 * KU-computer-programming-II
 */
public class Test001 {
    public static void main(String[] args) {
        Test001 a = new Test001();

        a.printByes(-8);

        System.out.println(-8 >> 2);
        a.printByes(-8 >> 2);

        System.out.println(-8 << 2);
        a.printByes(-8 << 2);

        System.out.println(-8 >>> 2);
        a.printByes(-8 >>> 2);
    }

    private void printByes(int number) {
        int bit = 32;

        for (int i = 0; i < bit; i++) {
            System.out.print((number << i) >>> (bit - 1));
        }
        System.out.println("");
        System.out.println("");
    }
}
