public class Exe2 {
  public static void main(String[] args) {
    int[][] magic = {
        {1, 12, 20, 8, 17, 6, 13},
        {14, 2, 10, 21, 9, 16, 5},
        {18, 19, 3, 4, 7, 11, 15}
    };
    System.out.println(verifierLignes(magic));
    System.out.println(verifierColonnes(magic));
  }

  private static int sommeLigne(int[][] tab, int line) {
    if (line >= tab.length) return -1;
    int result = 0;
    for (int element :
        tab[line]) {
      result += element;
    }
    return result;
  }

  private static int sommeColumn(int[][] tab, int column) {
    int result = 0;
    for (int[] lineArray :
        tab) {
      result += lineArray[column];
    }
    return result;
  }

  private static boolean verifierLignes(int[][] tab) {
    int sum = sommeLigne(tab, 0);
    for (int i = 1; i < tab.length; i++) {
      int result = sommeLigne(tab, i);
      if (sum != result) return false;
      sum = result;
    }
    return true;
  }

  private static boolean verifierColonnes(int[][] tab) {
    int sum = sommeColumn(tab, 0);
    for (int i = 1; i < tab[0].length; i++) {
      int result = sommeColumn(tab, i);
      if (sum != result) return false;
      sum = result;
    }
    return true;
  }

  private static boolean estMagique(int[][] tab) {
    return verifierColonnes(tab) && verifierLignes(tab);
  }
}
