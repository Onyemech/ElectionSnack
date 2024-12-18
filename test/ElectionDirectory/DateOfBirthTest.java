package ElectionDirectory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateOfBirthTest {
    @Test
    public void testDayOfBirthWorks_asIt_should() {
        DateOfBirth dateOfBirth = new DateOfBirth(5,12,2016);
        assertEquals(5,dateOfBirth.getDayOfBirth());
        assertEquals(12,dateOfBirth.getMonthOfBirth());
        assertEquals(2016,dateOfBirth.getYearOfBirth());
    }
    @Test
    public void testThat_DateOfBirth_ClassGetsFull_DateOfBirth() {
        DateOfBirth dateOfBirth = new DateOfBirth(5,12,2016);
        assertEquals("5-12-2016",dateOfBirth.getDateOfBirth());
    }
    @Test
    public void testThat_DateOfBirth_ClassHandles_ExceptionFor_invalid_dayOfBirth() {
        DateOfBirth dateOfBirth = new DateOfBirth(-5,12,2016);
        assertThrows(IllegalArgumentException.class, () -> dateOfBirth.setDayOfBirth("-5"));
    }

    @Test
    public void testThat_DateOfBirth_ClassHandles_ExceptionFor_invalid_monthOfBirth() {
        DateOfBirth dateOfBirth = new DateOfBirth(5,13,2016);
        assertThrows(IllegalArgumentException.class, () -> dateOfBirth.setMonthOfBirth("13"));
    }

    @Test
    public void testThat_DateOfBirth_ClassHandles_ExceptionFor_invalid_yearOfBirth() {
        DateOfBirth dateOfBirth = new DateOfBirth(5,13,2016);
        assertThrows(IllegalArgumentException.class, () -> dateOfBirth.setYearOfBirth("2025"));
    }
}
