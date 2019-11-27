import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exe2Test {

  @Test
  void estMajuscule() {
    assertFalse(Exe2.estMajuscule('a'));
    assertFalse(Exe2.estMajuscule('z'));
    assertTrue(Exe2.estMajuscule('B'));
    assertTrue(Exe2.estMajuscule('A'));
    assertTrue(Exe2.estMajuscule('Z'));
  }

  @Test
  void estMinuscule() {
    assertTrue(Exe2.estMinuscule ('a'));
    assertTrue(Exe2.estMinuscule ('z'));
    assertFalse(Exe2.estMinuscule ('B'));
    assertFalse(Exe2.estMinuscule ('A'));
    assertFalse(Exe2.estMinuscule ('Z'));
  }
  @Test
  void minuscule() {
    assertEquals("azertyuiop", Exe2.minuscule("AZERTYUIOP"));
    assertEquals("azertyuiop", Exe2.minuscule("AZERTYuiop"));
  }
  @Test
  void majuscule() {
    assertEquals("AZERTYUIOP", Exe2.majuscule("azertyuiop"));
    assertEquals("AZERTYUIOP", Exe2.majuscule("AZERTYuiop"));
  }
  @Test
  void majusculeDebut() {
    assertEquals("L’examen Ne Sera Pas Trop Dur", Exe2.majusculeDebut("l’eXamen ne sera pas TROP dur"));
  }
}