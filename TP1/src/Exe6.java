import java.util.Scanner;

public class Exe6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez un nombre entier : ");
    int a = sc.nextInt();
    System.out.print("Entrez un nombre entier : ");
    int b = sc.nextInt();
    System.out.print("Entrez un nombre entier : ");
    int c = sc.nextInt();
    sc.close();

    if (a > b) {
      if (b > c) {
        System.out.print(c + " <= " + b + " <= " + a);
      } else if (a > c) {
        System.out.print(b + " <= " + c + " <= " + a);
      } else {
        System.out.print(b + " <= " + a + " <= " + c);
      }
    } else {
      if (a > c) {
        System.out.print(c + " <= " + a + " <= " + b);
      } else if (b > c) {
        System.out.print(a + " <= " + c + " <= " + b);
      } else {
        System.out.print(a + " <= " + b + " <= " + c);
      }
    }

  }
}
