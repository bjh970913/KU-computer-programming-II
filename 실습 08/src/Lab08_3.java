import java.util.Scanner;

/**
 * Created by bjh970913 on 19/10/2016.
 * KU-computer-programming-II
 */
public class Lab08_3 {
    public static int[] findLargestBlock(int[][] m) {
        int result[] = {0, 0, 0};
        int x = 0, y = 0, d;
        int size;

        d = m.length;

        for (x = 0; x < d; x++) {
            for (y = 0; y < d; y++) {
                if (m[x][y] == 1) {
                    size = calcSquare(m, x, y, d);
                    if (size > result[2]) {
                        result[2] = size;
                        result[0] = x;
                        result[1] = y;
                    }
                }
            }
        }


        return result;
    }

    private static int calcSquare(int[][] m, int x, int y, int d) {
        int size = 1;
        int X, Y;
        boolean flag;

        for (; (size < d - y) && (size < d - x); size++) {
            flag = true;

            X = size - 1;
            for (Y = 0; Y < size; Y++) {
                if (m[x + X][y + Y] != 1) {
                    flag = false;
                }
            }

            Y = size - 1;
            for (X = 0; X < size; X++) {
                if (m[x + X][y + Y] != 1) {
                    flag = false;
                }
            }

            if (!flag) {
                size--;
                return size;
            }
        }

        return size;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat[][], i, j, k;
        int result[] = new int[3];
        String line, lineSplit[];
        System.out.print("Enter the number of rows in the matrix:");
        i = scan.nextInt();

        mat = new int[i][i];

        System.out.println("Enter the matrix row by row:");

        scan.nextLine();

        j = i;
        for (i = 0; i < j; i++) {
            line = scan.nextLine();
            lineSplit = line.split(" ");
            for (k = 0; k < j; k++) {
                mat[k][i] = Integer.parseInt(lineSplit[k]);
            }
        }

        result = findLargestBlock(mat);

        System.out.format("The maximum square submatrix is at (%d, %d) with size %d\n", result[0], result[1], result[2]);
    }
}
