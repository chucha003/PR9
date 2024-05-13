import org.testng.annotations.Test;
import service.CashBackCounting;


import static org.testng.AssertJUnit.assertEquals;

public class CashBackServiceTest {
    @Test
    public void shouldReturnZeroForAmountThousand() {
        CashBackCounting service = new CashBackCounting();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnHundredForAmountNineHundred() {
        CashBackCounting service = new CashBackCounting();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNinetyForAmountNineHundredTen() {
        CashBackCounting service = new CashBackCounting();
        int expected = 90;
        int actual = service.remain(910);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroForAmountTwoThousand() {
        CashBackCounting service = new CashBackCounting();
        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(expected, actual);
    }

}
