public class Exe2 {
  public static void main(String[] args) {
    for (double i = 250; i > -20; i -= 10) {
      System.out.println(i + " degrés F ---> " + ((5.0 / 9.0) * i - 160.0 / 9.0) + " degrés C");
    }
  }
}
