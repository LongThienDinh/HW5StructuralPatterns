import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OnionUnitTest {
    @Test
    public void UnitTesting() {
        FoodItems Burger = new Burger(0.5);
        FoodItems BurgerPlusOnion = new Onion(Burger, 0.4);
        Assertions.assertEquals(0.9, BurgerPlusOnion.getPrice(), "The price of Burger plus Onion is incorrect.");
    }
}