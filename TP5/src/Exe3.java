public class Exe3 {
  public static void main(String[] args) {
    int[] f = {5, 7, 3, 2};
    int[] f2 = {5, 7, 3, 2, 14};
//    System.out.println(evaluePoly(f, 1));
//    displayArray(additionPoly(f, f2));
//    derivee(f);
    affichePoly(multiplicationPoly(f, f2));
  }

  private static void affichePoly(int[] poly) {
    String x = "";
    for (int i = 0; i < poly.length; i++) {
      if (i == 0) {
        x += poly[i];
      } else if (i == 1) {
        x += " + " + poly[i] + "x";
      } else {
        x += " + " + poly[i] + "x^" + (i);
      }
    }

    System.out.println(x);
  }

  private static int evaluePoly(int[] poly, int y) {
    int result = 0;
    for (int i = 0; i < poly.length; i++) {
      if (i == 0) {
        result += poly[i];
      } else {
        result += poly[i] * Math.pow(y, i);
      }
    }
    return result;
  }

  private static int[] additionPoly(int[] poly1, int[] poly2) {
    int maxLength = Math.max(poly1.length, poly2.length);
    int[] newPoly = new int[maxLength];
    for (int i = 0; i < maxLength; i++) {
      if (poly1.length > i) {
        newPoly[i] += poly1[i];
      }
      if (poly2.length > i) {
        newPoly[i] += poly2[i];
      }
    }
    return newPoly;
  }
  private static void derivee(int[] poly) {
    String result = "";
    for (int i = 0; i < poly.length; i++) {
      if (i == 0) {
      } else if (i == 1) {
        result += poly[i];
      } else if (i == 2) {
        result += " + " + (i * poly[i]) + "x";
      } else {
        result += " + " + (i * poly[i]) + "x^" + (i - 1);
      }
    }
    System.out.println(result);
  }
  private static int[] multiplicationPoly(int[] poly1, int[] poly2) {
    int[] result = new int[poly1.length * poly2.length];
    for (int i = 0; i < poly1.length; i++) {
      for (int j = 0; j < poly2.length; j++) {
        result[i + j] = poly1[i] * poly2[j];
      }
    }
    return result;
  }

  private static void displayArray(int[] arr) {
    for (int el :
        arr) {
      System.out.println(el);
    }
  }
}
