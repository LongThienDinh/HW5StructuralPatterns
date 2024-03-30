import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TomatoUnitTest {
    @Test
    public void UnitTesting() {
        FoodItems Burger = new Burger(0.5);
        FoodItems BurgerPlusTomato = new Tomato(Burger, 0.2);
        Assertions.assertEquals(0.7, BurgerPlusTomato.getPrice(), "The price of Burger plus Tomato is incorrect.");
    }
}