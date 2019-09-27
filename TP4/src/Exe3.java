public class Exe3 {
  public static void main(String[] args) {
    int[] tab = {2, 5, 6};
    int[] tab2 = {1, 2, 3, 4, 5};
//    printTab(sousTableau(tab, 2, 5));
    printTab(fusion(tab, tab2));
  }

  private static int[] copieTableau(int[] tab) {
    int[] copy = new int[tab.length];
    for (int i = 0; i < tab.length; i++) {
      copy[i] = tab[i];
    }
    return copy;
  }

  private static int[] sousTableau(int[] tab, int i, int j) {
    int wantedlength = j - i + 1;
    int[] copy = new int[wantedlength];
    for (int k = 0; k < wantedlength; k++) {
      copy[k] = tab[k + i];
    }
    return copy;
  }

  private static int[] concatenation(int[] tab1, int[] tab2) {
    int totalLength = tab1.length + tab2.length;
    int[] concatenatedTab = new int[totalLength];
    for (int i = 0; i < totalLength; i++) {
      if (i < tab1.length) {
        concatenatedTab[i] = tab1[i];
      } else {
        concatenatedTab[i] = tab2[i - tab1.length];
      }
    }
    return concatenatedTab;
  }

  private static int[] fusion(int[] tab1, int[] tab2) {
    int totalLength = tab1.length + tab2.length;
    int[] fusionTab = new int[totalLength];

    int state = 0;

    for (int i = 0; i < totalLength; i += 2) {
      if (state <= tab1.length && state <= tab2.length) {
        fusionTab[i] = tab1[i];
        fusionTab[i + 1] = tab2[i];
        state++;
      }
    }

    return fusionTab;
  }

  private static void printTab(int[] tab) {
    for (int el :
        tab) {
      System.out.println(el);
    }
  }
}
