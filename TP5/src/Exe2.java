import java.util.Arrays;

public class Exe2 {
  public static void main(String[] args) {
    int[] notes = {6, 11, 13, 16, 12, 8, 9, 7, 12, 9, 8, 10, 14,
        11, 9, 1, 6, 4, 19, 17, 12, 13, 4, 0, 5, 9, 10, 11};
    afficheHistoVertical(calculHistogramme(notes));
  }

  private static int[] calculHistogramme(int[] notes) {
    int[] histo = new int[21];
    for (int note :
        notes) {
      histo[note] += 1;
    }
    return histo;
  }

  private static void printArray(int[] tab) {
    for (int el :
        tab) {
      System.out.println(el);
    }
  }

  private static void afficheHistoHorizontal(int[] histo) {
    for (int i = 0; i < histo.length; i++) {
      System.out.println((i >= 10 ? "" : " ") + i + " " + "*".repeat(histo[i]));
    }
  }

  private static void afficheHistoVertical(int[] histo) {
    int[] histoCopy = histo.clone();
    // Get highest bar
    Arrays.sort(histoCopy);
    int max = histoCopy[histoCopy.length - 1];
    for (int i = max; i >= -1; i--) {
      String line = "";
      for (int j = 0; j < histoCopy.length; j++) {
        if (i != -1) {
          if (histo[j] > i) {
            line += "*  ";
          } else {
            line += "   ";
          }
        } else {
          if (j >= 10) {
            line += String.valueOf(j) + " ";
          } else {
            line += String.valueOf(j) + "  ";
          }

        }


      }
      System.out.println(line);
    }
  }
}
