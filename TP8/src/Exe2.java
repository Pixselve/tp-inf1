public class Exe2 {
  static boolean estMajuscule(char c) {
    return c >= 65 && c <= 90;
  }

  static boolean estMinuscule(char c) {
    return c >= 97 && c <= 122;
  }

  static String minuscule(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      result.append(charToLowerCase(s.charAt(i)));
    }
    return result.toString();
  }

  static String majuscule(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      result.append(charToUpperCase(s.charAt(i)));
    }
    return result.toString();
  }
  private static char charToUpperCase(char c) {
    return estMinuscule(c) ? (char) (c - (97 - 65)) : c;
  }
  private static char charToLowerCase(char c) {
    return estMajuscule(c) ? (char) (c + (97 - 65)) : c;
  }
  static String majusculeDebut(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i == 0) {
        result.append(charToUpperCase(s.charAt(i)));
      } else if (s.charAt(i - 1) == 32) {
        result.append(charToUpperCase(s.charAt(i)));
      } else {
        result.append(charToLowerCase(s.charAt(i)));
      }

    }
    return result.toString();
  }
}
