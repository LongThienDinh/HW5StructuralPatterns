import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToppingsUnitTest {
    @Test
    public void UnitTesting() {
        FoodItems Fries = new Fries(1.5);
        Ketchup Ketchup = new Ketchup(Fries, 0.25);
        Assertions.assertEquals(1.75, Ketchup.getPrice());
    }
}