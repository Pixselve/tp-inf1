import java.util.Scanner;

public class Exe5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Saisie une hauteur : ");
    int h = sc.nextInt();
    sc.close();
    first(h);
    second(h);
    third(h);
    last(h);
  }

  private static void first(int h) {
    StringBuilder x = new StringBuilder();

    x.append("*".repeat(h + 1));
    for (int i = h; i >= 1; i--) {
      System.out.println(x.deleteCharAt(0));
    }
  }

  private static void second(int h) {
    StringBuilder topBottom = new StringBuilder();
    StringBuilder middle = new StringBuilder();
    topBottom.append("*".repeat(h));
    middle.append("*").append(" ".repeat(h - 2)).append("*");
    for (int i = 0; i <= h; i++) {
      if (i == 0 || i == h) {
        System.out.println(topBottom);
      } else {
        System.out.println(middle);
      }
    }

  }

  private static void third(int h) {
    StringBuilder topBottom = new StringBuilder();
    StringBuilder middle = new StringBuilder();
    topBottom.append("*".repeat(h));
    middle.append(" ".repeat(h - 1)).append("*");
    for (int i = 0; i <= h; i++) {
      if (i == 0 || i == h) {
        System.out.println(topBottom);
      } else {
        middle.deleteCharAt(0);
        System.out.println(middle);
      }
    }
  }

  private static void four(int h) {
    StringBuilder space = new StringBuilder(" ".repeat(h - 1));
    StringBuilder star = new StringBuilder("*");
    for (int i = 1; i <= h; i++) {
      System.out.println(space.toString() + star.toString() + space.toString());
      if (space.length() != 0) {
        space.deleteCharAt(0);
      }
      star.append("**");
    }
  }

  private static void last(int h) {
    StringBuilder line = new StringBuilder().append("*").append(" ".repeat(h - 2)).append("*");
    for (int i = 0; i < h; i++) {
      if (i == 0 || i == h) {
        System.out.println(line);
      } else {
        StringBuilder currentLine = new StringBuilder(line);

        currentLine.setCharAt(i, '*');
        System.out.println(currentLine);
      }

    }
  }
}
