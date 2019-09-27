public class Exe2 {
  public static void main(String[] args) {
    int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
    System.out.println(premiereOccurrence(tab, 9));
    System.out.println(nombreOccurrences(tab, 9));
    System.out.println(nombreOccurrences(remplace(tab, 9, 1), 1));
  }

  private static int premiereOccurrence(int[] tab, int a) {
    int indexFound = -1;

    for (int i = 0; i < tab.length; i++) {
      if (tab[i] == a) {
        indexFound = i;
        break;
      }
    }
    return indexFound;
  }

  private static int nombreOccurrences(int[] tab, int a) {
    int numOfElements = 0;
    for (int el :
        tab) {
      if (el == a) {
        numOfElements++;
      }
    }
    return numOfElements;
  }

  private static int[] remplace(int[] tab, int a, int b) {
    int[] copy = tab.clone();
    for (int i = 0; i < tab.length; i++) {
      if (copy[i] == a) {
        copy[i] = b;
      }
    }
    return copy;
  }
}
