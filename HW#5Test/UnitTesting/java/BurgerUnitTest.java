import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BurgerUnitTest {
    @Test
    public void UnitTesting() {
        Burger burger = new Burger(0.5);
        Assertions.assertEquals(0.5, burger.getPrice() ,"The price of burger is incorrect.");
    }
}
