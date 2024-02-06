import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashBackHackerTest {
    @Test
    void CalcHacker() {
        CashBackHacker serv = new CashBackHacker();
        int amount = 1990;

        int actual = serv.remain(amount);
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    void CalcHackerZero() {
        CashBackHacker serv = new CashBackHacker();
        int amount = 0;

        int actual = serv.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }

    @Test
    void CalcHackerMinus() {
        CashBackHacker serv = new CashBackHacker();
        int amount = -1;

        int actual = serv.remain(amount);
        int expected = 1001;

        assertEquals(expected, actual);

    }

}
