import java.util.Arrays;

public class Exe4 {
  public static void main(String[] args) {
    int[] tab1 = {1, 12, 20, 8, 17, 6, 13};
    int[] tab2 = {14, 2, 10, 21, 9, 16, 5};
    int[][] magic = {
        {1, 12, 20, 8, 17, 6, 13},
        {14, 2, 10, 21, 9, 16, 5},
        {18, 19, 3, 4, 7, 11, 15}
    };
//    System.out.println(Arrays.toString(sommeRectangles(tab1, tab2)));
    System.out.println(Arrays.deepToString(rotation(magic)));
  }

  private static int[][] sommeRectangles(int[][] tab1, int[][] tab2) {
    int[][] result = new int[tab1.length][];
    for (int i = 0; i < tab1.length; i++) {
      result[i] = new int[tab1[i].length];
      for (int j = 0; j < tab1[i].length; j++) {
        result[i][j] = tab1[i][j] + tab2[i][j];
      }

    }
    return result;
  }

  private static int[][] symetrieHorizontale(int[][] tab) {
    int[][] result = new int[tab.length][];
    for (int i = 0; i < tab.length; i++) {
      result[result.length - 1 - i] = tab[i];
    }
    return result;
  }

  private static int[][] symetrieVerticale(int[][] tab) {
    int[][] result = new int[tab.length][];
    for (int i = 0; i < tab.length; i++) {
      result[i] = new int[tab[i].length];
      for (int j = 0; j < tab[i].length; j++) {
        result[i][j] = tab[i][tab[i].length - 1 - j];
      }
    }
    return result;
  }

  private static int[][] transpose(int[][] tab) {
    int[][] result = new int[tab[0].length][tab.length];

    for (int i = 0; i < tab.length; i++) {

      for (int j = 0; j < tab[i].length; j++) {

        result[j][i] = tab[i][j];
      }
    }
    return result;
  }

  private static int[][] rotation(int[][] tab) {
    return symetrieHorizontale(transpose(tab));
  }
}
