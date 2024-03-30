import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriesUnitTest {
    @Test
    public void UnitTesting() {
        Fries fries = new Fries(1.5);
        Assertions.assertEquals(1.5, fries.getPrice() ,"The price of Fries is incorrect.");
    }
}
