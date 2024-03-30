import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LettuceUnitTest {
    @Test
    public void UnitTesting() {
        FoodItems HotDog = new HotDog(2.5);
        FoodItems HotDogPlusLettuce = new Lettuce(HotDog, 0.25);
        Assertions.assertEquals(2.75, HotDogPlusLettuce.getPrice(), "The price of HotDog plus Lettuce is incorrect.");
    }
}