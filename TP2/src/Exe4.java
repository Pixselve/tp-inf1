import java.util.Random;
import java.util.Scanner;


public class Exe4 {
  public static void main(String[] args) {
    int r = new Random().nextInt(100) + 1;
    Scanner sc = new Scanner(System.in);


    boolean isNotFound = true;
    System.out.println("Devine le nombre auquel je pense entre 1 et 100...");
    while (isNotFound) {
      System.out.print("Saisie un nombre : ");
      int guess = sc.nextInt();
      if (guess == r) {
        isNotFound = false;
      } else {
        if (guess > r) {
          System.out.println("Trop Grand...");
        } else {
          System.out.println("Trop petit...");
        }
      }
    }
    System.out.println("Félicitation, tu as trouvé :wink:");
    sc.close();
  }
}
