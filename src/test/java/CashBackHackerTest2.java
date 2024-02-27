import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest2 {
    @Test
    public void CalcHacker1() {
        CashBackHacker serv = new CashBackHacker();
        int amount = 1990;

        int actual = serv.remain(amount);
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    public void CalcHackerZero1() {
        CashBackHacker serv = new CashBackHacker();
        int amount = 0;

        int actual = serv.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }

    @Test
    public void CalcHackerMinus1() {
        CashBackHacker serv = new CashBackHacker();
        int amount = -1;

        int actual = serv.remain(amount);
        int expected = 1001;

        assertEquals(expected, actual);

    }

    @Test
    public void CalcHacker2() {
        CashBackHacker serv = new CashBackHacker();
        int amount = 1000;

        int actual = serv.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }
}