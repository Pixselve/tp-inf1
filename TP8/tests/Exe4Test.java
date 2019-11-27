import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exe4Test {

  @Test
  void stringToInt() {
    assertEquals(1234567890, Exe4.stringToInt("1234567890"));
    assertEquals(987654321, Exe4.stringToInt("987654321"));
    assertEquals(0, Exe4.stringToInt("0"));
    assertEquals(0, Exe4.stringToInt(""));
    assertEquals(0, Exe4.stringToInt("aaaa"));
  }
}