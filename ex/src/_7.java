import java.util.Arrays;
import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] b = new int[input.nextInt()];

        fill_arr(b);
        print_arr(b);
        countArr(b);
        countArr1(b);
        int neChet = countArr_(b);
        int chet = countArr1_(b);
        is_balance(neChet, chet);

    }

    public static void fill_arr(int c[]) {
        for (int i = 0; i < c.length; i++) {
            c[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив заполнен");
    }

    public static void print_arr(int c[]) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }

    public static int countArr(int[] c) {
        var k = 0;
        for (int i = 0; i < c.length; i++) {
            while (c[i] % 2 > 0) {// нечетные
                k = k + 1;
                break;
            }
        }
        System.out.println("Количество нечетных - " + k);
        return k;
    }

    public static int countArr1(int[] c) {
        var k1 = 0;
        for (int i = 0; i < c.length; i++) {
            while (c[i] % 2 == 0 || c[i] == 0) {//четные
                k1 = k1 + 1;
                break;
            }
        }
        System.out.println("Количество четных - " + k1);
        return k1;
    }

    public static int countArr_(int[] c) {
        var k = 0;
        for (int i = 0; i < c.length; i++) {
            while (c[i] % 2 > 0) {// нечетные
                k = k + 1;
                break;
            }
        }
        return k;
    }

    public static int countArr1_(int[] c) {
        var k1 = 0;
        for (int i = 0; i < c.length; i++) {
            while (c[i] % 2 == 0 || c[i] == 0) {//четные
                k1 = k1 + 1;
                break;
            }
        }
        return k1;
    }

    public static void is_balance(int k, int k1) {
            if (k1 == k) {
                System.out.println("Массив сбалансированный");
            } else {
                System.out.println("Массив не сбалансированный");
            }
        }
    }

