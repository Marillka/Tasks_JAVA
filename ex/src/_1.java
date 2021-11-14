import java.util.Scanner;

public class _1 {
 static Scanner reader = new Scanner(System.in);

 public static void main(String[] args) {
  int x = 10;
  int y = 10;

  for (int i = 0; i < x; i++) {
   for (int j = 0; j < y; j++) {
    if (i == 4 && j == 1) {
     System.out.print("Раюмов Валерий ");
    } else if (i == 4 && j > 1 && j < 9) {
     System.out.print("");
    }  else if (i == 5 && j == 1) {
    System.out.print("8-916-998-48-56 ");
   }  else if (i == 5 && j > 1 && j < 9) {
     System.out.print("");
    } else {
     System.out.print("* ");
    }
   }
   System.out.println();

  }
 }
}
