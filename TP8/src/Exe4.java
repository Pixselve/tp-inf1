public class Exe4 {
  static int stringToInt(String s) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      result += (isANumber(s.charAt(i)) ? (s.charAt(i) - 48) : 0) * Math.pow(10, s.length() - i - 1);
    }
    return result;
  }

  private static boolean isANumber(char c) {
    return c >= 48 && c <= 57;
  }
}
