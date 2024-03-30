import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MustardUnitTest {
    @Test
    public void UnitTesting() {
        FoodItems Fries = new Fries(1.5);
        FoodItems friesPlusMustard = new Mustard(Fries, 0.2);
        Assertions.assertEquals(1.7, friesPlusMustard.getPrice(), "The price of Fries plus Mustard is incorrect.");
    }
}