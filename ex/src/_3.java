import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        int minutes = input.nextInt();

        int minutesAfterNight = hours * 60 + minutes;
        int secondsAfterNight = minutesAfterNight * 60;
        System.out.println(minutesAfterNight);

        System.out.println(secondsAfterNight);

        int hoursBeforeNight = 23 - hours; //23 00 // 1
        int minutesBeforeNight = hoursBeforeNight * 60 + (60 - minutes);
        System.out.println(minutesBeforeNight);







    }
}
