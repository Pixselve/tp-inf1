import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exe1Test {
  @Test
  void occurence() {
    assertEquals(0, Exe1.occurrence("", 'c'));
    assertEquals(1, Exe1.occurrence("mael", 'm'));
    assertEquals(2, Exe1.occurrence("natation", 'a'));
  }

  @Test
  void estPalindrome() {
    assertTrue(Exe1.estPalindrome(""));
    assertTrue(Exe1.estPalindrome("kawak"));
    assertFalse(Exe1.estPalindrome("mael"));
    assertTrue(Exe1.estPalindrome("a"));
  }

  @Test
  void extraireSousChaine() {
    assertEquals("a", Exe1.extraireSousChaine("bab", 1, 1));
    assertEquals("", Exe1.extraireSousChaine("", 12, 1));
    assertEquals("", Exe1.extraireSousChaine("", 1, 12));
    assertEquals("tat", Exe1.extraireSousChaine("natation", 2, 4));
  }

  @Test
  void remplacer() {
    assertEquals("a", Exe1.remplacer("b", 'b', 'a'));
    assertEquals("a", Exe1.remplacer("a", 'b', 'a'));
    assertEquals("ababa", Exe1.remplacer("acaca", 'c', 'b'));
  }
}