import java.util.Scanner;

public class Exe4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez un nombre de secondes : ");
    int seconds = sc.nextInt();
    sc.close();
    int days = seconds / 86400;
    seconds %= 86400;
    int hours = seconds / 3600;
    seconds %= 3600;
    int minutes = seconds / 60;
    seconds %= 60;
    System.out.println("Cela donne " + days + " jours, " + hours + " heures, " + minutes + " minutes et " + seconds + " secondes.");

  }
}
