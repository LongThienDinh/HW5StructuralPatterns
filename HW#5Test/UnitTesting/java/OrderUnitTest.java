import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderUnitTest {
    @Test
    public void UnitTesting() {
        FoodItems fries = new Fries(1.5);
        FoodItems HotDog = new HotDog(0.5);
        Order order = new Order();
        order.addFoodItems(HotDog);
        order.addFoodItems(fries);
        Assertions.assertEquals(2.0, order.getTotalPrice(), "The price of Order is incorrect.");
    }
}