import java.util.Scanner;

public class Exe5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez un nombre entier : ");
    int a = sc.nextInt();
    System.out.print("Entrez un nombre entier : ");
    int b = sc.nextInt();
    System.out.print("Entrez un nombre entier : ");
    int c = sc.nextInt();
    sc.close();
    if ((a + b + c) % 2 == 0) {
      System.out.println("La somme de ces trois nombres est paire.");
    } else {
      System.out.println("La somme de ces trois nombres est impaire.");
    }
  }
}
