import java.util.Scanner;

public class Exe2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Veuillez saisir a : ");
    int a = sc.nextInt();
    System.out.print("Veuillez saisir b : ");
    int b = sc.nextInt();
    sc.close();
    System.out.print("La valeur de a est : " + a + " et de b est : " + b);
    int c = a;
    a = b;
    b = c;
    System.out.println("Après échange, la valeur de a est : " + a + " et de b est : " + b);
    System.out.println("Le double de a est : " + a * 2);
    System.out.println("La moitié de b est : " + b / 2);
    System.out.println("Soit la division de a par b. Le quotient est : " + a / b + " et le reste : " + a % b + ".");
    System.out.println("La plus grande valeur entre b et a est : " + (a > b ? "a" : "b"));
  }
}
