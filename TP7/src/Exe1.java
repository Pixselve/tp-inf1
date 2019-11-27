public class Exe1 {
  public static void main(String[] args) {

  }

  private static void afficheTab2D(int[][] tab) {
    for (int[] elementsFirstTab : tab) {
      for (int inElementElements : elementsFirstTab) {
        System.out.print(inElementElements + " ");
      }
      System.out.println("");
    }
  }
}
