import org.junit.Test;

import static org.junit.Assert.*;


public class FranceTest {
    @Test
    public void testMultiplication(){
        Money five = Money.france(5);
        assertEquals(Money.france(10),five.times(2));
        assertEquals(Money.france(15),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.france(5).equals(Money.france(5)));
        assertFalse(Money.france(5).equals(Money.france(6)));
    }
}