import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lavender on 17-7-13.
 */
public class MoneyTest {
    @Test
    public void testCurrency(){
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.france(1).currency());
    }
}