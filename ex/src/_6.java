import java.util.Scanner;

public class _6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        e44(input);
//        e45(input);
//        e46(input);
//        e47(input);
//        e48(input);
//        e49(input);
//        e414(input);
//        e417(input);


        System.out.println("Введите целое четырехзначное число");
        int x = input.nextInt();//1234

        int x1 = x / 1000;//1
        int x2 = (x % 1000) / 100;//2
        int x3 = (x % 100) / 10;//3
        int x4 = x % 10;//4

        int y = x2 * 1000 + x3 * 100 + x4 * 10 + x1 * 0;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(y);

    }

    private static void e417(Scanner input) {
        System.out.println("Введите целое четырехзначное число");
        int x = input.nextInt(); //7854

        int x1 = x / 1000;//7
        int x2 = (x % 1000) / 100;//8
        int x3 = (x % 100) / 10;//5
        int x4 = x % 10;//4

        int y = x4 * 1000 + x2 * 100 + x3 * 10 + x1;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(y);
    }

    private static void e414(Scanner input) {
        System.out.println("Введите целое положительное двузначное число");
        int a = input.nextInt();//35
        int b = a / 10;//3
        int c = a % 10;//5

        int y = 0;

        if(b % 2 == 0) {
            y = y + 1;
        }
        if(c % 2 == 0) {
            y = y + 1;
        }
        System.out.println(y);
    }

    private static void e49(Scanner input) {
        System.out.println("Введите целое положительное двузначное число");
        int a = input.nextInt();//35
        int b = a / 10;//3
        int c = a % 10;//5
        System.out.println(b + c);
    }

    private static void e48(Scanner input) {
        System.out.println("Введите целое положительное трехзначное число");
        int a = input.nextInt();//356
        int b = a / 100;//3
        int c = (a % 100) / 10;//5
        int e = (a % 100) % 10;//6

        int e1 = 100 * e;
        int c1 = c * 10;
        int b1 = b;

        int z = e1 + c1 + b1 - 20;
        System.out.println(z);
    }

    private static void e47(Scanner input) {
        System.out.println("Введите целое положительное двузначное число");
        int a = input.nextInt();//35
        int b = a / 10;//3
        int c = a % 10;//5

        int b1 = c * 10;
        int c1 = b;

        int d = b1 + b + 8;
        System.out.println(d);
    }

    private static void e46(Scanner input) {
        System.out.println("Введите целое положительное трехзначное число");
        int a = input.nextInt();//356
        int b = a / 100;//3
        int c = (a % 100) / 10;//5
        int e = (a % 100) % 10;//6
        System.out.println((b * 100) + " + " + (c * 10) + " + " + e);
    }

    private static void e45(Scanner input) {
        System.out.println("Введите целое положительное двузначное число");
        int a = input.nextInt();//35
        int b = a / 10;//3
        int c = a % 10;//5
        System.out.println((b * 10) + " + " + c);
    }

    private static void e44(Scanner input) {
        System.out.println("Введите целое положительное трехзначное число");
        int a = input.nextInt();//356
        int b = a / 100;//3
        int c = a % 100;//56
        int d = c / 10;//5
        int e = c % 10;//6
        System.out.println(b + " " + d + " " + e);
    }
}
