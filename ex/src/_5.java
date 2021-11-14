//import java.util.Scanner;
//
//public class _5 {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//
////        FToC(input);
////        dToSm(input);
////        job(input);
////        e_41(input);
//        e_42(input);
//
//    }
//
//    private static void e_42(Scanner input) {
//        System.out.println("Введите целое положительное трехзначное число");
//        int a = input.nextInt();//356
//        int b = a / 100;//3
//        int c = a % 100;//56
//        int d = c / 10;//5
//        int e = c % 10;//6
//        System.out.println(b + " " + d + " " + e);
//
//        private static void e_41 (Scanner) {
//                System.out.println("Введите целое положительное двузначное число");
//        int a = input.nextInt();
//        int b = a / 10;
//        int c = a % 10;
//        System.out.println(b + " " + c);
//    }
//
//        private static void job(){
//            System.out.println("Введите заработанную сумму");
//            double a1 = input.nextDouble();
//            System.out.println("Введите сумму, которую дали");
//            double b1 = input.nextDouble();
//            System.out.println("Введите курс евро");
//            double c1 = input.nextDouble();
//
//            double all = (a1 + b1) / c1;
//            System.out.println(all);
//        }
//
//        private static void dToSm (Scanner input){
//            System.out.println("Введите значения в дюймах");
//            double d = input.nextDouble();
//
//            double sm = 2.54 * d;
//            System.out.println("Значение в сантиметрах равно " + sm);
//        }
//
//        public static void FToC() {
//            System.out.println("Введите значения в фаренгейтах");
//            double f = input.nextDouble();
//
//            double c = 5 * (f - 32) / 9;
//            System.out.println("Температура в цельсиях равна - " + c);
//        }
//
//    }
//}