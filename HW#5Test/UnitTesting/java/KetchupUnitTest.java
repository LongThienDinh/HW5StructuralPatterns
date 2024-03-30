import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KetchupUnitTest {
    @Test
    public void UnitTesting() {
        FoodItems Fries = new Fries(1.5);
        FoodItems friesPlusKetchup = new Ketchup(Fries, 0.25);
        Assertions.assertEquals(1.75, friesPlusKetchup.getPrice(), "The price of Fries plus ketchup is incorrect.");
    }
}