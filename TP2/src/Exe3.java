import java.util.Scanner;

public class Exe3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Veuillez saisir un entier supérieur ou égal à 1 : ");
    int n = sc.nextInt();
    sc.close();
    int sum = 0;
    StringBuilder calc = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      sum += i;
      if (i == n) {
        calc.append(i).append(" ");
      } else {
        calc.append(i).append(" + ");
      }
    }
    calc.append("= ").append(sum);
    System.out.println(calc);

  }
}
