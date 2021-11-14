import java.util.Scanner;

public class _2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 9;
        int y = 5;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || i == 8 || (i == 1 &&  j > 0 && j < 5) || (i == 2 &&  j > 1 && j < 5) || (i == 3 &&  j > 2 && j < 5) || (i == 4 &&  j > 3 && j < 5) || (i == 5 &&  j > 2 && j < 5) || (i == 6 &&  j > 1 && j < 5) || (i == 7 &&  j > 0 && j < 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}