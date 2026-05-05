package esercizi_J_UNIT;

import java.time.OffsetDateTime;
import java.time.Month;
import java.time.DayOfWeek;

public class DateDetailsTest {

    private final OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void testGetYear() {
        assertEquals(2023, data.getYear());
    }

    private void assertEquals(int march, int year) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testGetMonth() {
        assertEquals(Month.MARCH, data.getMonth());
        assertEquals(3, data.getMonthValue());
    }

    private void assertEquals(Month march, Month month) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testGetDayOfMonth() {
        assertEquals(1, data.getDayOfMonth());
    }

    @Test
    void testGetDayOfWeek() {
        assertEquals(DayOfWeek.WEDNESDAY, data.getDayOfWeek());
    }

    private void assertEquals(DayOfWeek wednesday, DayOfWeek dayOfWeek) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}