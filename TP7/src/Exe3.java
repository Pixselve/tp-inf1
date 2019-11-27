public class Exe3 {
  public static void main(String[] args) {
    int[][] magic = {
        {1, 12, 20, 8, 17, 6, 13},
        {14, 2, 10, 21, 9, 16, 5},
        {18, 19, 3, 4, 7, 11, 15}
    };
    System.out.print(estNormal(magic));
  }

  private static boolean estNormal(int[][] tab) {
    int[] occurTable = new int[tab.length * tab[0].length];
    for (int[] lines :
        tab) {
      for (int element :
          lines) {
        occurTable[element - 1]++;
      }
    }
    for (int occurElement :
        occurTable) {
      if (occurElement != 1) return false;
    }
    return true;
  }

}
