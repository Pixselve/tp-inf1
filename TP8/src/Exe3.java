public class Exe3 {
  static int countTwoLetterWord(String s) {
    int result = 0;
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 32 && s.charAt(i) <= 47 || s.charAt(i) >= 58 && s.charAt(i) <= 64) {
        if (count == 2) result++;
        count = 0;
      } else {
        count++;
      }
    }
    if (count == 2) result++;
    return result;
  }
}
