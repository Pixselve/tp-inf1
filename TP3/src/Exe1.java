public class Exe1 {
  public static void main(String[] args) {
    int[] test = {1, 2, 3, 4, 5};
    System.out.println(test);
    afficheTab(test);
  }

  private static void afficheTab(int[] tab) {
    for (int element : tab) {
      System.out.print(element);
    }
  }
}
