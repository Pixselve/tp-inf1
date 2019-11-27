public class Exe1 {

  static int occurrence(String s, char c) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) result++;
    }
    return result;
  }

  static boolean estPalindrome(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
    }
    return true;
  }

  static String extraireSousChaine(String s, int d, int f) {
    if (d > f || d >= s.length()) return "";
    StringBuilder result = new StringBuilder();
    for (int i = d; i <= f; i++) {
      result.append(s.charAt(i));
    }
    return result.toString();
  }

  static String remplacer(String s, char c1, char c2) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      result.append(s.charAt(i) == c1 ? c2 : s.charAt(i));
    }
    return result.toString();
  }
}
