import java.util.Scanner;

public class Exe3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez une année : ");
    int year = sc.nextInt();
    sc.close();
    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
      System.out.println("Vous avez entré une année bissextile ;)");
    } else {
      System.out.println("Vous n'avez pas entré une année bissesxtile ;(");
    }
  }
}
