import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lavender on 17-7-13.
 */
public class MoneyTest {
    @Test
    public void testDollarMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    public void testFranceMultiplication(){
        Money five = Money.france(5);
        assertEquals(Money.france(10),five.times(2));
        assertEquals(Money.france(15),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(5).equals(Money.france(5)));
    }
    @Test
    public void testCurrency(){
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.france(1).currency());
    }
    @Test
    public void testSimpleAddition(){
        Expression sum = Money.dollar(5).plus(Money.dollar(5));
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10),reduced);
    }
}