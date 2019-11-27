import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exe3Test {

  @Test
  void countTwoLetterWord() {
    assertEquals(0, Exe3.countTwoLetterWord("qzdjhqizd qziud qzid, qzdb ? jhqzbdjqzhbdjhqzbd"));
    assertEquals(3, Exe3.countTwoLetterWord("qzdjhqizd qz, qz ! qz ? jhqzbdjqzhbdjhqzbd"));
    assertEquals(2, Exe3.countTwoLetterWord("un, deux ? trois : un"));
    assertEquals(2, Exe3.countTwoLetterWord("un, deux ? trois : un."));
    assertEquals(2, Exe3.countTwoLetterWord("un,deux?trois:un."));
    assertEquals(2, Exe3.countTwoLetterWord("ùN,deéx?tréis:ué."));
    assertEquals(0, Exe3.countTwoLetterWord(""));
  }
}