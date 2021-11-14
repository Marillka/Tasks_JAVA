import java.util.Arrays;
import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        int[] arrLeft = new int[(n / 2) + 1];
        int[] arrRight = new int [(n / 2)];

        int up = 999;
        int down = 100;

        for (int i = 0; i < n; i++) {
            arr[i] = down + (int) (Math.random() * (up - down));
            arrLeft[((double) i / 2)] = arr[i / 2];

            }
            for (int i = 0; i < n; i++) {
                if (i < arr.length - arrLeft.length) {
                    arrRight[i] = arr[i + arrLeft.length];
                }
            }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrLeft));
        System.out.println(Arrays.toString(arrRight));
// доделать четные и нечетные
    }
}
