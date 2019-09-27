public class Exe1 {
  public static void main(String[] args) {

  }

  private static int[] echange(int[] tab, int i, int j) {
    int[] copy = tab.clone();
    int elementAtJ = copy[j];
    copy[j] = copy[i];
    copy[i] = elementAtJ;
    return copy;
  }
}
