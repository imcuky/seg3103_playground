import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DateTest {

  @Test
  void testNextDate_Sample1() {
      Date d = new Date(1700, 6, 20);
      assertEquals(new Date(1700, 6, 21), d.nextDate());
  }

  @Test
  void testNextDate_Sample2() {
      Date d = new Date(2005, 4, 5);
      assertEquals(new Date(2005, 4, 6), d.nextDate());
  }

  @Test
  void testNextDate_Sample3() {
      Date d = new Date(1901, 7, 20);
      assertEquals(new Date(1901, 7, 21), d.nextDate());
  }

  @Test
  void testNextDate_Sample4() {
      Date d = new Date(3456, 3, 27);
      assertEquals(new Date(3456, 3, 28), d.nextDate());
  }

  @Test
  void testNextDate_Sample5() {
      Date d = new Date(1500, 2, 17);
      assertEquals(new Date(1500, 2, 18), d.nextDate());
  }

  @Test
  void testNextDate_Sample6() {
      Date d = new Date(1700, 6, 29);
      assertEquals(new Date(1700, 6, 30), d.nextDate());
  }

  @Test
  void testNextDate_Sample7() {
      Date d = new Date(1800, 11, 29);
      assertEquals(new Date(1800, 11, 30), d.nextDate());
  }

  @Test
  void testNextDate_Sample8() {
      Date d = new Date(3453, 1, 29);
      assertEquals(new Date(3453, 1, 30), d.nextDate());
  }

  @Test
  void testNextDate_Sample9() {
      Date d = new Date(444, 2, 29);
      assertEquals(new Date(444, 3, 1), d.nextDate());
  }

  @Test
  void testNextDate_Sample10() {
      Date d = new Date(2005, 4, 30);
      assertEquals(new Date(2005, 5, 1), d.nextDate());
  }

  @Test
  void testNextDate_Sample11() {
      Date d = new Date(3453, 1, 30);
      assertEquals(new Date(3453, 1, 31), d.nextDate());
  }

  @Test
  void testNextDate_Sample12() {
      Date d = new Date(3456, 3, 30);
      assertEquals(new Date(3456, 3, 31), d.nextDate());
  }

  @Test
  void testNextDate_Sample13() {
      Date d = new Date(1901, 7, 31);
      assertEquals(new Date(1901, 8, 1), d.nextDate());
  }

  @Test
  void testNextDate_Sample14() {
      Date d = new Date(3453, 1, 31);
      assertEquals(new Date(3453, 2, 1), d.nextDate());
  }

  @Test
  void testNextDate_Sample15() {
      Date d = new Date(3456, 12, 31);
      assertEquals(new Date(3457, 1, 1), d.nextDate());
  }

  @Test
  void testNextDate_Sample16() {
      assertThrows(IllegalArgumentException.class, () -> new Date(1500, 2, 31).nextDate());
  }

  @Test
  void testNextDate_Sample17() {
      assertThrows(IllegalArgumentException.class, () -> new Date(1500, 2, 29).nextDate());
  }

  @Test
  void testNextDate_Sample18() {
      assertThrows(IllegalArgumentException.class, () -> new Date(-1, 10, 20).nextDate());
  }

  @Test
  void testNextDate_Sample19() {
      assertThrows(IllegalArgumentException.class, () -> new Date(1458, 15, 12).nextDate());
  }

  @Test
  void testNextDate_Sample20() {
      assertThrows(IllegalArgumentException.class, () -> new Date(1975, 6, -50).nextDate());
  }
}
