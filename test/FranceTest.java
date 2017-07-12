import org.junit.Test;

import static org.junit.Assert.*;


public class FranceTest {
    @Test
    public void testMultiplication(){
        France five = new France(5);
        assertEquals(new France(10),five.times(2));
        assertEquals(new France(15),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new France(5).equals(new France(5)));
        assertFalse(new France(5).equals(new France(6)));
    }
}